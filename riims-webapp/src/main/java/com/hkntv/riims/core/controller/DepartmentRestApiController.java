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

import com.hkntv.riims.core.service.DepartmentService;
import com.hkntv.riims.core.model.DepartmentModel;
import com.hkntv.riims.core.vo.DepartmentVO;

@RestApiController
@RequestMapping("/riims")
public class DepartmentRestApiController {

	private final Logger logger = LoggerFactory.getLogger(DepartmentRestApiController.class);
	
	@Autowired
	private BeanMapper beanMapper;
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value = "/core/department/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<DepartmentVO>> getDepartmentById(@PathVariable String id){
		DepartmentModel departmentModel = departmentService.findByPrimaryKey(id);
		DepartmentVO departmentVO =beanMapper.map(departmentModel, DepartmentVO.class);
		ResponseEnvelope<DepartmentVO> responseEnv = new ResponseEnvelope<DepartmentVO>(departmentVO);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/department", method = RequestMethod.POST)
	public ResponseEntity<ResponseEnvelope<Integer>> createDepartment(@RequestBody DepartmentVO departmentVO){
		DepartmentModel departmentModel = beanMapper.map(departmentVO, DepartmentModel.class);
		Integer  result = departmentService.create(departmentModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/department/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ResponseEnvelope<Integer>> deleteDepartmentByPrimaryKey(@PathVariable String id){
		Integer  result = departmentService.deleteByPrimaryKey(id);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/department/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ResponseEnvelope<Integer>> updateDepartmentByPrimaryKeySelective(@PathVariable String id, @RequestBody DepartmentVO departmentVO){
		DepartmentModel departmentModel = beanMapper.map(departmentVO, DepartmentModel.class);
		departmentModel.setGuid(id);
		Integer  result = departmentService.updateByPrimaryKeySelective(departmentModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
}
