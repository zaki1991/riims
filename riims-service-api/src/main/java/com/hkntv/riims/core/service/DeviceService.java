
package com.hkntv.riims.core.service;

import com.hkntv.riims.core.model.DeviceModel;

import java.util.List;

public interface DeviceService{
	
	public int create(DeviceModel deviceModel);
	
	public int createSelective(DeviceModel deviceModel);
	
	public DeviceModel findByPrimaryKey(String id);

	public List<DeviceModel> selectPage(DeviceModel deviceModel, Integer page, Integer pageSize);

	public int updateByPrimaryKey(DeviceModel deviceModel);
	
	public int updateByPrimaryKeySelective(DeviceModel deviceModel);
	
	public int deleteByPrimaryKey(String id);
	
	public int selectCount(DeviceModel deviceModel);
	
}