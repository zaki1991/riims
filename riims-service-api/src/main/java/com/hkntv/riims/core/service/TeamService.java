
package com.hkntv.riims.core.service;

import com.hkntv.riims.core.model.TeamModel;

public interface TeamService{
	
	public int create(TeamModel teamModel);
	
	public int createSelective(TeamModel teamModel);
	
	public TeamModel findByPrimaryKey(String id);
	
	public int updateByPrimaryKey(TeamModel teamModel);
	
	public int updateByPrimaryKeySelective(TeamModel teamModel);
	
	public int deleteByPrimaryKey(String id);
	
	public int selectCount(TeamModel teamModel);
	
}