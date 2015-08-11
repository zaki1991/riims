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

import com.hkntv.riims.core.service.LineAreaInfoService;
import com.hkntv.riims.core.model.LineAreaInfoModel;
import com.hkntv.riims.core.vo.LineAreaInfoVO;

@RestApiController
@RequestMapping("/riims")
public class LineAreaInfoRestApiController {

	private final Logger logger = LoggerFactory.getLogger(LineAreaInfoRestApiController.class);
	
	@Autowired
	private BeanMapper beanMapper;
	
	@Autowired
	private LineAreaInfoService lineAreaInfoService;
	
	@RequestMapping(value = "/core/lineAreaInfo/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<LineAreaInfoVO>> getLineAreaInfoById(@PathVariable String id){
		LineAreaInfoModel lineAreaInfoModel = lineAreaInfoService.findByPrimaryKey(id);
		LineAreaInfoVO lineAreaInfoVO =beanMapper.map(lineAreaInfoModel, LineAreaInfoVO.class);
		ResponseEnvelope<LineAreaInfoVO> responseEnv = new ResponseEnvelope<LineAreaInfoVO>(lineAreaInfoVO);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/lineAreaInfo", method = RequestMethod.POST)
	public ResponseEntity<ResponseEnvelope<Integer>> createLineAreaInfo(@RequestBody LineAreaInfoVO lineAreaInfoVO){
		LineAreaInfoModel lineAreaInfoModel = beanMapper.map(lineAreaInfoVO, LineAreaInfoModel.class);
		Integer  result = lineAreaInfoService.create(lineAreaInfoModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/lineAreaInfo/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ResponseEnvelope<Integer>> deleteLineAreaInfoByPrimaryKey(@PathVariable String id){
		Integer  result = lineAreaInfoService.deleteByPrimaryKey(id);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/lineAreaInfo/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ResponseEnvelope<Integer>> updateLineAreaInfoByPrimaryKeySelective(@PathVariable String id, @RequestBody LineAreaInfoVO lineAreaInfoVO){
		LineAreaInfoModel lineAreaInfoModel = beanMapper.map(lineAreaInfoVO, LineAreaInfoModel.class);
		lineAreaInfoModel.setGuid(id);
		Integer  result = lineAreaInfoService.updateByPrimaryKeySelective(lineAreaInfoModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
}
