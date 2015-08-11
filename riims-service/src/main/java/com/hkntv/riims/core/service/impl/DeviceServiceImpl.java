package com.hkntv.riims.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hkntv.riims.core.entity.Device;
import com.hkntv.riims.core.repository.DeviceRepository;
import com.hkntv.riims.core.model.DeviceModel;
import com.hkntv.riims.core.service.DeviceService;
import com.hkntv.pylon.core.beans.mapping.BeanMapper;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

	@Autowired
	private BeanMapper beanMapper;

	@Autowired
	private DeviceRepository deviceRepo;

	@Transactional
	@Override
	public int create(DeviceModel deviceModel) {
		return deviceRepo.insert(beanMapper.map(deviceModel, Device.class));
	}

	@Transactional
	@Override
	public int createSelective(DeviceModel deviceModel) {
		return deviceRepo.insertSelective(beanMapper.map(deviceModel, Device.class));
	}

	@Transactional
	@Override
	public int deleteByPrimaryKey(String id) {
		return deviceRepo.deleteByPrimaryKey(id);
	}

	@Transactional(readOnly = true)
	@Override
	public DeviceModel findByPrimaryKey(String id) {
		Device device = deviceRepo.selectByPrimaryKey(id);
		return beanMapper.map(device, DeviceModel.class);
	}

	@Override
	public List<DeviceModel> selectPage(DeviceModel deviceModel, Integer page, Integer pageSize) {
		Device device = beanMapper.map(deviceModel, Device.class);
		return beanMapper.mapAsList(deviceRepo.selectPage(device, new PageRequest(page, pageSize)), DeviceModel.class);
	}

	@Transactional(readOnly = true)
	@Override
	public int selectCount(DeviceModel deviceModel) {
		return deviceRepo.selectCount(beanMapper.map(deviceModel, Device.class));
	}

	@Transactional
	@Override
	public int updateByPrimaryKey(DeviceModel deviceModel) {
		return deviceRepo.updateByPrimaryKey(beanMapper.map(deviceModel, Device.class));
	}
	
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(DeviceModel deviceModel) {
		return deviceRepo.updateByPrimaryKeySelective(beanMapper.map(deviceModel, Device.class));
	}

}
