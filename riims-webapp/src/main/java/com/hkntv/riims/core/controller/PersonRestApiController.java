package com.hkntv.riims.core.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hkntv.pylon.core.beans.mapping.BeanMapper;
import com.hkntv.pylon.web.rest.ResponseEnvelope;
import com.hkntv.pylon.web.rest.annotation.RestApiController;
import com.hkntv.riims.core.model.PersonModel;
import com.hkntv.riims.core.service.PersonService;
import com.hkntv.riims.core.vo.LoginVO;
import com.hkntv.riims.core.vo.PersonVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestApiController
@RequestMapping("/riims")
public class PersonRestApiController {

	private final Logger logger = LoggerFactory.getLogger(PersonRestApiController.class);
	
	@Autowired
	private BeanMapper beanMapper;
	
	@Autowired
	private PersonService personService;

	@Autowired
	private Gson gson;
	
	@RequestMapping(value = "/core/person/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<PersonVO>> getPersonById(@PathVariable String id){
		PersonModel personModel = personService.findByPrimaryKey(id);
		PersonVO personVO =beanMapper.map(personModel, PersonVO.class);
		ResponseEnvelope<PersonVO> responseEnv = new ResponseEnvelope<PersonVO>(personVO);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}

	@RequestMapping(value = "/person/login", method = RequestMethod.POST)
	public ResponseEntity<ResponseEnvelope<PersonVO>> login(@RequestBody LoginVO loginVO) {
		PersonModel personModel = personService.login(loginVO.getUsername(), loginVO.getPassword());
		ResponseEnvelope<PersonVO> responseEnv;
		PersonVO personVO = beanMapper.map(personModel, PersonVO.class);
		if(personVO!=null){
			responseEnv = new ResponseEnvelope<PersonVO>(personVO, true);
		}else{
			responseEnv = new ResponseEnvelope<PersonVO>(personVO, false);
		}

		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}

	@RequestMapping(value = "/core/persons", params = { "pageNumber", "pageSize" }, method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<String>> getPersons(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("pageSize") Integer pageSize) {
		ResponseEnvelope<String> responseEnv;
		List<PersonModel> personModels = personService.selectPage(new PersonModel(), pageNumber, pageSize);
		if(personModels == null || personModels.isEmpty()){
			responseEnv = new ResponseEnvelope<String>("",false);
			return new ResponseEntity<>(responseEnv, HttpStatus.OK);
		}
		List<PersonVO> personVos = new ArrayList<PersonVO>();
		personVos = beanMapper.mapAsList(personModels,PersonVO.class);
		String result = gson.toJson(personVos, new TypeToken<List<PersonVO>>() {}.getType());
		responseEnv = new ResponseEnvelope<String>(result,true);

		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/person", method = RequestMethod.POST)
	public ResponseEntity<ResponseEnvelope<Integer>> createPerson(@RequestBody PersonVO personVO){
		PersonModel personModel = beanMapper.map(personVO, PersonModel.class);
		Integer  result = personService.create(personModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/person/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ResponseEnvelope<Integer>> deletePersonByPrimaryKey(@PathVariable String id){
		Integer  result = personService.deleteByPrimaryKey(id);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/person/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ResponseEnvelope<Integer>> updatePersonByPrimaryKeySelective(@PathVariable String id, @RequestBody PersonVO personVO){
		PersonModel personModel = beanMapper.map(personVO, PersonModel.class);
		personModel.setGuid(id);
		Integer  result = personService.updateByPrimaryKeySelective(personModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
}
