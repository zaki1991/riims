
package com.hkntv.riims.core.service;

import com.hkntv.riims.core.model.LineInfoModel;
import java.util.Date;

public interface LineInfoService{
	
	public int create(LineInfoModel lineInfoModel);
	
	public int createSelective(LineInfoModel lineInfoModel);
	
	public LineInfoModel findByPrimaryKey(String id);
	
	public int updateByPrimaryKey(LineInfoModel lineInfoModel);
	
	public int updateByPrimaryKeySelective(LineInfoModel lineInfoModel);
	
	public int deleteByPrimaryKey(String id);
	
	public int selectCount(LineInfoModel lineInfoModel);
	
}