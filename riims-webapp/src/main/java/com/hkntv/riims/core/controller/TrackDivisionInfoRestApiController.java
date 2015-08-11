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

import com.hkntv.riims.core.service.TrackDivisionInfoService;
import com.hkntv.riims.core.model.TrackDivisionInfoModel;
import com.hkntv.riims.core.vo.TrackDivisionInfoVO;

@RestApiController
@RequestMapping("/riims")
public class TrackDivisionInfoRestApiController {

	private final Logger logger = LoggerFactory.getLogger(TrackDivisionInfoRestApiController.class);
	
	@Autowired
	private BeanMapper beanMapper;
	
	@Autowired
	private TrackDivisionInfoService trackDivisionInfoService;
	
	@RequestMapping(value = "/core/trackDivisionInfo/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<TrackDivisionInfoVO>> getTrackDivisionInfoById(@PathVariable String id){
		TrackDivisionInfoModel trackDivisionInfoModel = trackDivisionInfoService.findByPrimaryKey(id);
		TrackDivisionInfoVO trackDivisionInfoVO =beanMapper.map(trackDivisionInfoModel, TrackDivisionInfoVO.class);
		ResponseEnvelope<TrackDivisionInfoVO> responseEnv = new ResponseEnvelope<TrackDivisionInfoVO>(trackDivisionInfoVO);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/trackDivisionInfo", method = RequestMethod.POST)
	public ResponseEntity<ResponseEnvelope<Integer>> createTrackDivisionInfo(@RequestBody TrackDivisionInfoVO trackDivisionInfoVO){
		TrackDivisionInfoModel trackDivisionInfoModel = beanMapper.map(trackDivisionInfoVO, TrackDivisionInfoModel.class);
		Integer  result = trackDivisionInfoService.create(trackDivisionInfoModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/trackDivisionInfo/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ResponseEnvelope<Integer>> deleteTrackDivisionInfoByPrimaryKey(@PathVariable String id){
		Integer  result = trackDivisionInfoService.deleteByPrimaryKey(id);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/trackDivisionInfo/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ResponseEnvelope<Integer>> updateTrackDivisionInfoByPrimaryKeySelective(@PathVariable String id, @RequestBody TrackDivisionInfoVO trackDivisionInfoVO){
		TrackDivisionInfoModel trackDivisionInfoModel = beanMapper.map(trackDivisionInfoVO, TrackDivisionInfoModel.class);
		trackDivisionInfoModel.setGuid(id);
		Integer  result = trackDivisionInfoService.updateByPrimaryKeySelective(trackDivisionInfoModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
}
