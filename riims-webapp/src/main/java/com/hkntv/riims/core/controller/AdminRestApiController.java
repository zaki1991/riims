package com.hkntv.riims.core.controller;

import com.hkntv.riims.core.vo.LoginVO;
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

import com.hkntv.riims.core.service.AdminService;
import com.hkntv.riims.core.model.AdminModel;
import com.hkntv.riims.core.vo.AdminVO;

@RestApiController
@RequestMapping("/riims")
public class AdminRestApiController {

	private final Logger logger = LoggerFactory.getLogger(AdminRestApiController.class);
	
	@Autowired
	private BeanMapper beanMapper;
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value = "/core/admin/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<AdminVO>> getAdminById(@PathVariable String id){
		AdminModel adminModel = adminService.findByPrimaryKey(id);
		AdminVO adminVO =beanMapper.map(adminModel, AdminVO.class);
		ResponseEnvelope<AdminVO> responseEnv = new ResponseEnvelope<AdminVO>(adminVO);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}

	@RequestMapping(value = "/admin/login", method = RequestMethod.POST)
	public ResponseEntity<ResponseEnvelope<AdminVO>> login(@RequestBody LoginVO loginVO) {
		AdminModel adminModel = adminService.login(loginVO.getUsername(), loginVO.getPassword());
		ResponseEnvelope<AdminVO> responseEnv;
		AdminVO adminVO = beanMapper.map(adminModel, AdminVO.class);
		if(adminVO!=null){
			responseEnv = new ResponseEnvelope<AdminVO>(adminVO, true);
		}else{
			responseEnv = new ResponseEnvelope<AdminVO>(adminVO, false);
		}

		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/admin", method = RequestMethod.POST)
	public ResponseEntity<ResponseEnvelope<Integer>> createAdmin(@RequestBody AdminVO adminVO){
		AdminModel adminModel = beanMapper.map(adminVO, AdminModel.class);
		Integer  result = adminService.create(adminModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/admin/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ResponseEnvelope<Integer>> deleteAdminByPrimaryKey(@PathVariable String id){
		Integer  result = adminService.deleteByPrimaryKey(id);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/admin/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ResponseEnvelope<Integer>> updateAdminByPrimaryKeySelective(@PathVariable String id, @RequestBody AdminVO adminVO){
		AdminModel adminModel = beanMapper.map(adminVO, AdminModel.class);
		adminModel.setId(id);
		Integer  result = adminService.updateByPrimaryKeySelective(adminModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
}
