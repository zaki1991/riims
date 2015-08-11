
package com.hkntv.riims.core.service;

import com.hkntv.riims.core.model.OrDamageInfoModel;

import java.util.List;

public interface OrDamageInfoService{
	
	public int create(OrDamageInfoModel orDamageInfoModel);
	
	public int createSelective(OrDamageInfoModel orDamageInfoModel);

	public List<OrDamageInfoModel> selectPage(OrDamageInfoModel orDamageInfoModel, Integer page, Integer pageSize);
	
	public OrDamageInfoModel findByPrimaryKey(String id);
	
	public int updateByPrimaryKey(OrDamageInfoModel orDamageInfoModel);
	
	public int updateByPrimaryKeySelective(OrDamageInfoModel orDamageInfoModel);
	
	public int deleteByPrimaryKey(String id);
	
	public int selectCount(OrDamageInfoModel orDamageInfoModel);
	
}