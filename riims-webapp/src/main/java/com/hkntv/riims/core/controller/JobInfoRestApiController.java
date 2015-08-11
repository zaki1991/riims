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

import com.hkntv.riims.core.service.JobInfoService;
import com.hkntv.riims.core.model.JobInfoModel;
import com.hkntv.riims.core.vo.JobInfoVO;

@RestApiController
@RequestMapping("/riims")
public class JobInfoRestApiController {

	private final Logger logger = LoggerFactory.getLogger(JobInfoRestApiController.class);
	
	@Autowired
	private BeanMapper beanMapper;
	
	@Autowired
	private JobInfoService jobInfoService;
	
	@RequestMapping(value = "/core/jobInfo/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<JobInfoVO>> getJobInfoById(@PathVariable String id){
		JobInfoModel jobInfoModel = jobInfoService.findByPrimaryKey(id);
		JobInfoVO jobInfoVO =beanMapper.map(jobInfoModel, JobInfoVO.class);
		ResponseEnvelope<JobInfoVO> responseEnv = new ResponseEnvelope<JobInfoVO>(jobInfoVO);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/jobInfo", method = RequestMethod.POST)
	public ResponseEntity<ResponseEnvelope<Integer>> createJobInfo(@RequestBody JobInfoVO jobInfoVO){
		JobInfoModel jobInfoModel = beanMapper.map(jobInfoVO, JobInfoModel.class);
		Integer  result = jobInfoService.create(jobInfoModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/jobInfo/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ResponseEnvelope<Integer>> deleteJobInfoByPrimaryKey(@PathVariable String id){
		Integer  result = jobInfoService.deleteByPrimaryKey(id);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/jobInfo/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ResponseEnvelope<Integer>> updateJobInfoByPrimaryKeySelective(@PathVariable String id, @RequestBody JobInfoVO jobInfoVO){
		JobInfoModel jobInfoModel = beanMapper.map(jobInfoVO, JobInfoModel.class);
		jobInfoModel.setGuid(id);
		Integer  result = jobInfoService.updateByPrimaryKeySelective(jobInfoModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
}
