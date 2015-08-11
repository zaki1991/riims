package com.hkntv.riims.core.model;

import com.hkntv.pylon.core.beans.mapping.annotation.MapClass;

@MapClass("com.hkntv.riims.core.entity.Units")
public class UnitsModel{
	
	private String guid;
	private String unitId;
	private String unitName;
		
	public void setGuid(String guid){
		this.guid = guid;
	}
	
	public String getGuid(){
		return this.guid;
	}
		
	public void setUnitId(String unitId){
		this.unitId = unitId;
	}
	
	public String getUnitId(){
		return this.unitId;
	}
		
	public void setUnitName(String unitName){
		this.unitName = unitName;
	}
	
	public String getUnitName(){
		return this.unitName;
	}
		
		
}