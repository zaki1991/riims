
package com.hkntv.riims.core.service;

import com.hkntv.riims.core.model.JobInfoModel;
import java.util.Date;

public interface JobInfoService{
	
	public int create(JobInfoModel jobInfoModel);
	
	public int createSelective(JobInfoModel jobInfoModel);
	
	public JobInfoModel findByPrimaryKey(String id);
	
	public int updateByPrimaryKey(JobInfoModel jobInfoModel);
	
	public int updateByPrimaryKeySelective(JobInfoModel jobInfoModel);
	
	public int deleteByPrimaryKey(String id);
	
	public int selectCount(JobInfoModel jobInfoModel);
	
}