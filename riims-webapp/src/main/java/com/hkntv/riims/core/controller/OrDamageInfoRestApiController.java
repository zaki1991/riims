package com.hkntv.riims.core.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hkntv.riims.core.vo.DamageInfoVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hkntv.pylon.core.beans.mapping.BeanMapper;
import com.hkntv.pylon.web.rest.ResponseEnvelope;
import com.hkntv.pylon.web.rest.annotation.RestApiController;

import com.hkntv.riims.core.service.OrDamageInfoService;
import com.hkntv.riims.core.model.OrDamageInfoModel;
import com.hkntv.riims.core.vo.OrDamageInfoVO;

import java.util.ArrayList;
import java.util.List;

@RestApiController
@RequestMapping("/riims")
public class OrDamageInfoRestApiController {

	private final Logger logger = LoggerFactory.getLogger(OrDamageInfoRestApiController.class);
	
	@Autowired
	private BeanMapper beanMapper;
	
	@Autowired
	private OrDamageInfoService orDamageInfoService;

	@Autowired
	private Gson gson;
	
	@RequestMapping(value = "/core/orDamageInfo/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<OrDamageInfoVO>> getOrDamageInfoById(@PathVariable String id){
		OrDamageInfoModel orDamageInfoModel = orDamageInfoService.findByPrimaryKey(id);
		OrDamageInfoVO orDamageInfoVO =beanMapper.map(orDamageInfoModel, OrDamageInfoVO.class);
		ResponseEnvelope<OrDamageInfoVO> responseEnv = new ResponseEnvelope<OrDamageInfoVO>(orDamageInfoVO);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}

	@RequestMapping(value = "/core/orDamages", params = { "pageNumber", "pageSize" }, method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<String>> getOrDamages(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("pageSize") Integer pageSize) {
		ResponseEnvelope<String> responseEnv;
		List<OrDamageInfoModel> orDamageInfoModels = orDamageInfoService.selectPage(new OrDamageInfoModel(), pageNumber, pageSize);
		if(orDamageInfoModels == null || orDamageInfoModels.isEmpty()){
			responseEnv = new ResponseEnvelope<String>("",false);
			return new ResponseEntity<>(responseEnv, HttpStatus.OK);
		}
		List<OrDamageInfoVO> orDamageInfoVos = new ArrayList<OrDamageInfoVO>();
		orDamageInfoVos = beanMapper.mapAsList(orDamageInfoModels,OrDamageInfoVO.class);
		String result = gson.toJson(orDamageInfoVos, new TypeToken<List<DamageInfoVO>>() {}.getType());
		responseEnv = new ResponseEnvelope<String>(result,true);

		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/orDamageInfo", method = RequestMethod.POST)
	public ResponseEntity<ResponseEnvelope<Integer>> createOrDamageInfo(@RequestBody OrDamageInfoVO orDamageInfoVO){
		OrDamageInfoModel orDamageInfoModel = beanMapper.map(orDamageInfoVO, OrDamageInfoModel.class);
		Integer  result = orDamageInfoService.create(orDamageInfoModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/orDamageInfo/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ResponseEnvelope<Integer>> deleteOrDamageInfoByPrimaryKey(@PathVariable String id){
		Integer  result = orDamageInfoService.deleteByPrimaryKey(id);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/orDamageInfo/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ResponseEnvelope<Integer>> updateOrDamageInfoByPrimaryKeySelective(@PathVariable String id, @RequestBody OrDamageInfoVO orDamageInfoVO){
		OrDamageInfoModel orDamageInfoModel = beanMapper.map(orDamageInfoVO, OrDamageInfoModel.class);
		orDamageInfoModel.setGuid(id);
		Integer  result = orDamageInfoService.updateByPrimaryKeySelective(orDamageInfoModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
}
