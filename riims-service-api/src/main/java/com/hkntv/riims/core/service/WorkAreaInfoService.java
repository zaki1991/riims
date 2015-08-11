
package com.hkntv.riims.core.service;

import com.hkntv.riims.core.model.WorkAreaInfoModel;

public interface WorkAreaInfoService{
	
	public int create(WorkAreaInfoModel workAreaInfoModel);
	
	public int createSelective(WorkAreaInfoModel workAreaInfoModel);
	
	public WorkAreaInfoModel findByPrimaryKey(String id);
	
	public int updateByPrimaryKey(WorkAreaInfoModel workAreaInfoModel);
	
	public int updateByPrimaryKeySelective(WorkAreaInfoModel workAreaInfoModel);
	
	public int deleteByPrimaryKey(String id);
	
	public int selectCount(WorkAreaInfoModel workAreaInfoModel);
	
}