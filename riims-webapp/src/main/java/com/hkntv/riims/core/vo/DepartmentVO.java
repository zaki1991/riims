package com.hkntv.riims.core.vo;

import com.hkntv.pylon.core.beans.mapping.annotation.MapClass;

@MapClass("com.hkntv.riims.core.model.DepartmentModel")
public class DepartmentVO{
	
	private String guid;
	private String departmentId;
	private String departmentName;
		
	public void setGuid(String guid){
		this.guid = guid;
	}
	
	public String getGuid(){
		return this.guid;
	}
		
	public void setDepartmentId(String departmentId){
		this.departmentId = departmentId;
	}
	
	public String getDepartmentId(){
		return this.departmentId;
	}
		
	public void setDepartmentName(String departmentName){
		this.departmentName = departmentName;
	}
	
	public String getDepartmentName(){
		return this.departmentName;
	}
		
		
}