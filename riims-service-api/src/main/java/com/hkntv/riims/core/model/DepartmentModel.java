package com.hkntv.riims.core.model;

import com.hkntv.pylon.core.beans.mapping.annotation.MapClass;

@MapClass("com.hkntv.riims.core.entity.Department")
public class DepartmentModel{
	
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