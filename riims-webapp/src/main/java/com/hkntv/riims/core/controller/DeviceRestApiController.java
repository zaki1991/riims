package com.hkntv.riims.core.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hkntv.pylon.core.beans.mapping.BeanMapper;
import com.hkntv.pylon.web.rest.ResponseEnvelope;
import com.hkntv.pylon.web.rest.annotation.RestApiController;
import com.hkntv.riims.core.model.DeviceModel;
import com.hkntv.riims.core.service.DeviceService;
import com.hkntv.riims.core.vo.DeviceVO;
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
public class DeviceRestApiController {

	private final Logger logger = LoggerFactory.getLogger(DeviceRestApiController.class);
	
	@Autowired
	private BeanMapper beanMapper;
	
	@Autowired
	private DeviceService deviceService;

	@Autowired
	private Gson gson;
	
	@RequestMapping(value = "/core/device/{id}", method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<DeviceVO>> getDeviceById(@PathVariable String id){
		DeviceModel deviceModel = deviceService.findByPrimaryKey(id);
		DeviceVO deviceVO =beanMapper.map(deviceModel, DeviceVO.class);
		ResponseEnvelope<DeviceVO> responseEnv = new ResponseEnvelope<DeviceVO>(deviceVO);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}

	@RequestMapping(value = "/core/devices", params = { "pageNumber", "pageSize" }, method = RequestMethod.GET)
	public ResponseEntity<ResponseEnvelope<String>> getDevices(@RequestParam("pageNumber") Integer pageNumber, @RequestParam("pageSize") Integer pageSize) {
		ResponseEnvelope<String> responseEnv;
		List<DeviceModel> deviceModels = deviceService.selectPage(new DeviceModel(), pageNumber, pageSize);
		if(deviceModels == null || deviceModels.isEmpty()){
			responseEnv = new ResponseEnvelope<String>("",false);
			return new ResponseEntity<>(responseEnv, HttpStatus.OK);
		}
		List<DeviceVO> deviceVos = new ArrayList<DeviceVO>();
		deviceVos = beanMapper.mapAsList(deviceModels,DeviceVO.class);
		String result = gson.toJson(deviceVos, new TypeToken<List<DeviceVO>>() {}.getType());
		responseEnv = new ResponseEnvelope<String>(result,true);

		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/device", method = RequestMethod.POST)
	public ResponseEntity<ResponseEnvelope<Integer>> createDevice(@RequestBody DeviceVO deviceVO){
		DeviceModel deviceModel = beanMapper.map(deviceVO, DeviceModel.class);
		Integer  result = deviceService.create(deviceModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/device/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ResponseEnvelope<Integer>> deleteDeviceByPrimaryKey(@PathVariable String id){
		Integer  result = deviceService.deleteByPrimaryKey(id);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/core/device/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ResponseEnvelope<Integer>> updateDeviceByPrimaryKeySelective(@PathVariable String id, @RequestBody DeviceVO deviceVO){
		DeviceModel deviceModel = beanMapper.map(deviceVO, DeviceModel.class);
		deviceModel.setGuid(id);
		Integer  result = deviceService.updateByPrimaryKeySelective(deviceModel);
		ResponseEnvelope<Integer> responseEnv = new ResponseEnvelope<Integer>(result);
		return new ResponseEntity<>(responseEnv, HttpStatus.OK);
	}
	
}
