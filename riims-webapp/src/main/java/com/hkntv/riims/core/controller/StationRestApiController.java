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

import com.hkntv.riims.core.service.StationService;
import com.hkntv.riims.core.model.StationModel;
import com.hkntv.riims.core.vo.StationVO;

@RestApiController
@RequestMapping("/riims")
public class StationRestApiController {

	private final Logger logger = LoggerFactory.getLogger(StationRestApiController.class);
	
	@Autowired
	private BeanMapper beanMapper;
	
	@Autowired
	private StationService stationService;
	
	@RequestMapping(value = "/core/station/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<StationVO>> getStationById(@PathVariable String id){
		StationModel stationModel = stationService.findByPrimaryKey(id);
		StationVO stationVO =beanMapper.map(stationModel, StationVO.class);
		ResponseEnvelope<StationVO> responseEnv = new ResponseEnvelope<StationVO>(stationVO);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/station", method = RequestMethod.POST)
	public ResponseEntity<ResponseEnvelope<Integer>> createStation(@RequestBody StationVO stationVO){
		StationModel stationModel = beanMapper.map(stationVO, StationModel.class);
		Integer  result = stationService.create(stationModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/station/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ResponseEnvelope<Integer>> deleteStationByPrimaryKey(@PathVariable String id){
		Integer  result = stationService.deleteByPrimaryKey(id);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/station/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ResponseEnvelope<Integer>> updateStationByPrimaryKeySelective(@PathVariable String id, @RequestBody StationVO stationVO){
		StationModel stationModel = beanMapper.map(stationVO, StationModel.class);
		stationModel.setGuid(id);
		Integer  result = stationService.updateByPrimaryKeySelective(stationModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
}
