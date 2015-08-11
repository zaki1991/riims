package com.hkntv.riims.core.vo;

import com.hkntv.pylon.core.beans.mapping.annotation.MapClass;

@MapClass("com.hkntv.riims.core.model.LineAreaInfoModel")
public class LineAreaInfoVO{
	
	private String guid;
	private String id;
	private String lineAreaName;
		
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
		
	public void setLineAreaName(String lineAreaName){
		this.lineAreaName = lineAreaName;
	}
	
	public String getLineAreaName(){
		return this.lineAreaName;
	}
		
		
}