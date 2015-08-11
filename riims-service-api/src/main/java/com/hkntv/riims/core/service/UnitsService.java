
package com.hkntv.riims.core.service;

import com.hkntv.riims.core.model.UnitsModel;

public interface UnitsService{
	
	public int create(UnitsModel unitsModel);
	
	public int createSelective(UnitsModel unitsModel);
	
	public UnitsModel findByPrimaryKey(String id);
	
	public int updateByPrimaryKey(UnitsModel unitsModel);
	
	public int updateByPrimaryKeySelective(UnitsModel unitsModel);
	
	public int deleteByPrimaryKey(String id);
	
	public int selectCount(UnitsModel unitsModel);
	
}