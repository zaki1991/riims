
package com.hkntv.riims.core.service;

import com.hkntv.riims.core.model.LineAreaInfoModel;

public interface LineAreaInfoService{
	
	public int create(LineAreaInfoModel lineAreaInfoModel);
	
	public int createSelective(LineAreaInfoModel lineAreaInfoModel);
	
	public LineAreaInfoModel findByPrimaryKey(String id);
	
	public int updateByPrimaryKey(LineAreaInfoModel lineAreaInfoModel);
	
	public int updateByPrimaryKeySelective(LineAreaInfoModel lineAreaInfoModel);
	
	public int deleteByPrimaryKey(String id);
	
	public int selectCount(LineAreaInfoModel lineAreaInfoModel);
	
}