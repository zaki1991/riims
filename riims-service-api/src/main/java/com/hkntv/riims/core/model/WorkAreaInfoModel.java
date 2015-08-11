package com.hkntv.riims.core.model;

import com.hkntv.pylon.core.beans.mapping.annotation.MapClass;

@MapClass("com.hkntv.riims.core.entity.WorkAreaInfo")
public class WorkAreaInfoModel{
	
	private String guid;
	private String id;
	private String inspectionAreaName;
		
	public void setGuid(String guid){
		this.guid = guid;
	}
	
	public String getGuid(){
		return this.guid;
	}
		
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return this.id;
	}
		
	public void setInspectionAreaName(String inspectionAreaName){
		this.inspectionAreaName = inspectionAreaName;
	}
	
	public String getInspectionAreaName(){
		return this.inspectionAreaName;
	}
		
		
}