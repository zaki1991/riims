
package com.hkntv.riims.core.service;

import com.hkntv.riims.core.model.TrackDivisionInfoModel;
import java.util.Date;

public interface TrackDivisionInfoService{
	
	public int create(TrackDivisionInfoModel trackDivisionInfoModel);
	
	public int createSelective(TrackDivisionInfoModel trackDivisionInfoModel);
	
	public TrackDivisionInfoModel findByPrimaryKey(String id);
	
	public int updateByPrimaryKey(TrackDivisionInfoModel trackDivisionInfoModel);
	
	public int updateByPrimaryKeySelective(TrackDivisionInfoModel trackDivisionInfoModel);
	
	public int deleteByPrimaryKey(String id);
	
	public int selectCount(TrackDivisionInfoModel trackDivisionInfoModel);
	
}