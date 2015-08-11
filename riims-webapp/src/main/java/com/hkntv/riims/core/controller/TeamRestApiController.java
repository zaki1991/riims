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

import com.hkntv.riims.core.service.TeamService;
import com.hkntv.riims.core.model.TeamModel;
import com.hkntv.riims.core.vo.TeamVO;

@RestApiController
@RequestMapping("/riims")
public class TeamRestApiController {

	private final Logger logger = LoggerFactory.getLogger(TeamRestApiController.class);
	
	@Autowired
	private BeanMapper beanMapper;
	
	@Autowired
	private TeamService teamService;
	
	@RequestMapping(value = "/core/team/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<TeamVO>> getTeamById(@PathVariable String id){
		TeamModel teamModel = teamService.findByPrimaryKey(id);
		TeamVO teamVO =beanMapper.map(teamModel, TeamVO.class);
		ResponseEnvelope<TeamVO> responseEnv = new ResponseEnvelope<TeamVO>(teamVO);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/team", method = RequestMethod.POST)
	public ResponseEntity<ResponseEnvelope<Integer>> createTeam(@RequestBody TeamVO teamVO){
		TeamModel teamModel = beanMapper.map(teamVO, TeamModel.class);
		Integer  result = teamService.create(teamModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/team/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ResponseEnvelope<Integer>> deleteTeamByPrimaryKey(@PathVariable String id){
		Integer  result = teamService.deleteByPrimaryKey(id);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/team/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ResponseEnvelope<Integer>> updateTeamByPrimaryKeySelective(@PathVariable String id, @RequestBody TeamVO teamVO){
		TeamModel teamModel = beanMapper.map(teamVO, TeamModel.class);
		teamModel.setGuid(id);
		Integer  result = teamService.updateByPrimaryKeySelective(teamModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
}
