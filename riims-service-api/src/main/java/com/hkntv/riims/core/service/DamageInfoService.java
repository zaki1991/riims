
package com.hkntv.riims.core.service;

import com.hkntv.riims.core.model.DamageInfoModel;

import java.util.List;

public interface DamageInfoService{
	
	public int create(DamageInfoModel damageInfoModel);
	
	public int createSelective(DamageInfoModel damageInfoModel);
	
	public DamageInfoModel findByPrimaryKey(String id);

	public List<DamageInfoModel> selectPage(DamageInfoModel damageInfoModel, Integer page, Integer pageSize);
	
	public int updateByPrimaryKey(DamageInfoModel damageInfoModel);
	
	public int updateByPrimaryKeySelective(DamageInfoModel damageInfoModel);
	
	public int deleteByPrimaryKey(String id);
	
	public int selectCount(DamageInfoModel damageInfoModel);
	
}