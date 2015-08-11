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

import com.hkntv.riims.core.service.WorkAreaInfoService;
import com.hkntv.riims.core.model.WorkAreaInfoModel;
import com.hkntv.riims.core.vo.WorkAreaInfoVO;

@RestApiController
@RequestMapping("/riims")
public class WorkAreaInfoRestApiController {

	private final Logger logger = LoggerFactory.getLogger(WorkAreaInfoRestApiController.class);
	
	@Autowired
	private BeanMapper beanMapper;
	
	@Autowired
	private WorkAreaInfoService workAreaInfoService;
	
	@RequestMapping(value = "/core/workAreaInfo/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<WorkAreaInfoVO>> getWorkAreaInfoById(@PathVariable String id){
		WorkAreaInfoModel workAreaInfoModel = workAreaInfoService.findByPrimaryKey(id);
		WorkAreaInfoVO workAreaInfoVO =beanMapper.map(workAreaInfoModel, WorkAreaInfoVO.class);
		ResponseEnvelope<WorkAreaInfoVO> responseEnv = new ResponseEnvelope<WorkAreaInfoVO>(workAreaInfoVO);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/workAreaInfo", method = RequestMethod.POST)
	public ResponseEntity<ResponseEnvelope<Integer>> createWorkAreaInfo(@RequestBody WorkAreaInfoVO workAreaInfoVO){
		WorkAreaInfoModel workAreaInfoModel = beanMapper.map(workAreaInfoVO, WorkAreaInfoModel.class);
		Integer  result = workAreaInfoService.create(workAreaInfoModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/workAreaInfo/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ResponseEnvelope<Integer>> deleteWorkAreaInfoByPrimaryKey(@PathVariable String id){
		Integer  result = workAreaInfoService.deleteByPrimaryKey(id);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/workAreaInfo/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ResponseEnvelope<Integer>> updateWorkAreaInfoByPrimaryKeySelective(@PathVariable String id, @RequestBody WorkAreaInfoVO workAreaInfoVO){
		WorkAreaInfoModel workAreaInfoModel = beanMapper.map(workAreaInfoVO, WorkAreaInfoModel.class);
		workAreaInfoModel.setGuid(id);
		Integer  result = workAreaInfoService.updateByPrimaryKeySelective(workAreaInfoModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
}
