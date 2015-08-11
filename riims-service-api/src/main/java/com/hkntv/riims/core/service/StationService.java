
package com.hkntv.riims.core.service;

import com.hkntv.riims.core.model.StationModel;

public interface StationService{
	
	public int create(StationModel stationModel);
	
	public int createSelective(StationModel stationModel);
	
	public StationModel findByPrimaryKey(String id);
	
	public int updateByPrimaryKey(StationModel stationModel);
	
	public int updateByPrimaryKeySelective(StationModel stationModel);
	
	public int deleteByPrimaryKey(String id);
	
	public int selectCount(StationModel stationModel);
	
}