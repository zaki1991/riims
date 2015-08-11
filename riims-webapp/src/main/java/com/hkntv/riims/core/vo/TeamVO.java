package com.hkntv.riims.core.vo;

import com.hkntv.pylon.core.beans.mapping.annotation.MapClass;

@MapClass("com.hkntv.riims.core.model.TeamModel")
public class TeamVO{
	
	private String guid;
	private String teamId;
	private String teamName;
		
	public void setGuid(String guid){
		this.guid = guid;
	}
	
	public String getGuid(){
		return this.guid;
	}
		
	public void setTeamId(String teamId){
		this.teamId = teamId;
	}
	
	public String getTeamId(){
		return this.teamId;
	}
		
	public void setTeamName(String teamName){
		this.teamName = teamName;
	}
	
	public String getTeamName(){
		return this.teamName;
	}
		
		
}