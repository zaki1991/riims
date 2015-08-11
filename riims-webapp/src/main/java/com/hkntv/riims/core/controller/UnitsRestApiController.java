package com.hkntv.riims.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hkntv.pylon.core.beans.mapping.BeanMapper;
import com.hkntv.pylon.web.rest.ResponseEnvelope;
import com.hkntv.pylon.web.rest.annotation.RestApiController;

import com.hkntv.riims.core.service.UnitsService;
import com.hkntv.riims.core.model.UnitsModel;
import com.hkntv.riims.core.vo.UnitsVO;

@RestApiController
@RequestMapping("/riims")
public class UnitsRestApiController {

	private final Logger logger = LoggerFactory.getLogger(UnitsRestApiController.class);
	
	@Autowired
	private BeanMapper beanMapper;
	
	@Autowired
	private UnitsService unitsService;
	
	@RequestMapping(value = "/core/units/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<UnitsVO>> getUnitsById(@PathVariable String id){
		UnitsModel unitsModel = unitsService.findByPrimaryKey(id);
		UnitsVO unitsVO =beanMapper.map(unitsModel, UnitsVO.class);
		ResponseEnvelope<UnitsVO> responseEnv = new ResponseEnvelope<UnitsVO>(unitsVO);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/units", method = RequestMethod.POST)
	public ResponseEntity<ResponseEnvelope<Integer>> createUnits(@RequestBody UnitsVO unitsVO){
		UnitsModel unitsModel = beanMapper.map(unitsVO, UnitsModel.class);
		Integer  result = unitsService.create(unitsModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/units/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ResponseEnvelope<Integer>> deleteUnitsByPrimaryKey(@PathVariable String id){
		Integer  result = unitsService.deleteByPrimaryKey(id);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/units/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ResponseEnvelope<Integer>> updateUnitsByPrimaryKeySelective(@PathVariable String id, @RequestBody UnitsVO unitsVO){
		UnitsModel unitsModel = beanMapper.map(unitsVO, UnitsModel.class);
		unitsModel.setGuid(id);
		Integer  result = unitsService.updateByPrimaryKeySelective(unitsModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
}
