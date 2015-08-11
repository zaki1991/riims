package com.hkntv.riims.core.vo;

import com.hkntv.pylon.core.beans.mapping.annotation.MapClass;

@MapClass("com.hkntv.riims.core.model.UnitsModel")
public class UnitsVO{
	
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