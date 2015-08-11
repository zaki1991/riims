package com.hkntv.riims.core.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hkntv.pylon.core.beans.mapping.BeanMapper;
import com.hkntv.pylon.web.rest.ResponseEnvelope;
import com.hkntv.pylon.web.rest.annotation.RestApiController;
import com.hkntv.riims.core.model.DamageInfoModel;
import com.hkntv.riims.core.service.DamageInfoService;
import com.hkntv.riims.core.vo.DamageInfoVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestApiController
@RequestMapping("/riims")
public class DamageInfoRestApiController {

	private final Logger logger = LoggerFactory.getLogger(DamageInfoRestApiController.class);
	
	@Autowired
	private BeanMapper beanMapper;
	
	@Autowired
	private DamageInfoService damageInfoService;

	@Autowired
	private Gson gson;
	
	@RequestMapping(value = "/core/damageInfo/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<DamageInfoVO>> getDamageInfoById(@PathVariable String id){
		DamageInfoModel damageInfoModel = damageInfoService.findByPrimaryKey(id);
		DamageInfoVO damageInfoVO =beanMapper.map(damageInfoModel, DamageInfoVO.class);
		ResponseEnvelope<DamageInfoVO> responseEnv = new ResponseEnvelope<DamageInfoVO>(damageInfoVO);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/damageInfo", method = RequestMethod.POST)
	public ResponseEntity<ResponseEnvelope<Integer>> createDamageInfo(@RequestBody DamageInfoVO damageInfoVO){
		DamageInfoModel damageInfoModel = beanMapper.map(damageInfoVO, DamageInfoModel.class);
		Integer  result = damageInfoService.create(damageInfoModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}

	@RequestMapping(value = "/core/damages", params = { "pageNumber", "pageSize" }, method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<String>> getDamages(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("pageSize") Integer pageSize) {
		ResponseEnvelope<String> responseEnv;
		List<DamageInfoModel> damageInfoModels = damageInfoService.selectPage(new DamageInfoModel(), pageNumber, pageSize);
		if(damageInfoModels == null || damageInfoModels.isEmpty()){
			responseEnv = new ResponseEnvelope<String>("",false);
			return new ResponseEntity<>(responseEnv, HttpStatus.OK);
		}
		List<DamageInfoVO> damageInfoVos = new ArrayList<DamageInfoVO>();
		damageInfoVos = beanMapper.mapAsList(damageInfoModels,DamageInfoVO.class);
		String result = gson.toJson(damageInfoVos, new TypeToken<List<DamageInfoVO>>() {}.getType());
		responseEnv = new ResponseEnvelope<String>(result,true);

		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/damageInfo/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ResponseEnvelope<Integer>> deleteDamageInfoByPrimaryKey(@PathVariable String id){
		Integer  result = damageInfoService.deleteByPrimaryKey(id);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/damageInfo/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ResponseEnvelope<Integer>> updateDamageInfoByPrimaryKeySelective(@PathVariable String id, @RequestBody DamageInfoVO damageInfoVO){
		DamageInfoModel damageInfoModel = beanMapper.map(damageInfoVO, DamageInfoModel.class);
		damageInfoModel.setGuid(id);
		Integer  result = damageInfoService.updateByPrimaryKeySelective(damageInfoModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
}
