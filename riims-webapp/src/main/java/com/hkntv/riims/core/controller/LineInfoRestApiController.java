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

import com.hkntv.riims.core.service.LineInfoService;
import com.hkntv.riims.core.model.LineInfoModel;
import com.hkntv.riims.core.vo.LineInfoVO;

@RestApiController
@RequestMapping("/riims")
public class LineInfoRestApiController {

	private final Logger logger = LoggerFactory.getLogger(LineInfoRestApiController.class);
	
	@Autowired
	private BeanMapper beanMapper;
	
	@Autowired
	private LineInfoService lineInfoService;
	
	@RequestMapping(value = "/core/lineInfo/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<LineInfoVO>> getLineInfoById(@PathVariable String id){
		LineInfoModel lineInfoModel = lineInfoService.findByPrimaryKey(id);
		LineInfoVO lineInfoVO =beanMapper.map(lineInfoModel, LineInfoVO.class);
		ResponseEnvelope<LineInfoVO> responseEnv = new ResponseEnvelope<LineInfoVO>(lineInfoVO);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/lineInfo", method = RequestMethod.POST)
	public ResponseEntity<ResponseEnvelope<Integer>> createLineInfo(@RequestBody LineInfoVO lineInfoVO){
		LineInfoModel lineInfoModel = beanMapper.map(lineInfoVO, LineInfoModel.class);
		Integer  result = lineInfoService.create(lineInfoModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/lineInfo/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ResponseEnvelope<Integer>> deleteLineInfoByPrimaryKey(@PathVariable String id){
		Integer  result = lineInfoService.deleteByPrimaryKey(id);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/lineInfo/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ResponseEnvelope<Integer>> updateLineInfoByPrimaryKeySelective(@PathVariable String id, @RequestBody LineInfoVO lineInfoVO){
		LineInfoModel lineInfoModel = beanMapper.map(lineInfoVO, LineInfoModel.class);
		lineInfoModel.setGuid(id);
		Integer  result = lineInfoService.updateByPrimaryKeySelective(lineInfoModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
}
