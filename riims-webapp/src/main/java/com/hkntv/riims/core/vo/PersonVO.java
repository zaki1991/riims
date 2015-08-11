package com.hkntv.riims.core.vo;

import com.hkntv.pylon.core.beans.mapping.annotation.MapClass;
import java.util.Date;

@MapClass("com.hkntv.riims.core.model.PersonModel")
public class PersonVO{
	
	private String guid;
	private String password;
	private String workId;
	private String name;
	private String identityCardId;
	private String literacy;
	private String teamId;
	private Date birthday;
	private String phoneNumber;
	private Date enteringDate;
	private String enteringPerson;
	private String enteringPersonPhoneNumber;
	private String departmentId;
	private String sex;
	private String job;
		
	public void setGuid(String guid){
		this.guid = guid;
	}
	
	public String getGuid(){
		return this.guid;
	}
		
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return this.password;
	}
		
	public void setWorkId(String workId){
		this.workId = workId;
	}
	
	public String getWorkId(){
		return this.workId;
	}
		
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
		
	public void setIdentityCardId(String identityCardId){
		this.identityCardId = identityCardId;
	}
	
	public String getIdentityCardId(){
		return this.identityCardId;
	}
		
	public void setLiteracy(String literacy){
		this.literacy = literacy;
	}
	
	public String getLiteracy(){
		return this.literacy;
	}
		
	public void setTeamId(String teamId){
		this.teamId = teamId;
	}
	
	public String getTeamId(){
		return this.teamId;
	}
		
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	
	public Date getBirthday(){
		return this.birthday;
	}
		
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
		
	public void setEnteringDate(Date enteringDate){
		this.enteringDate = enteringDate;
	}
	
	public Date getEnteringDate(){
		return this.enteringDate;
	}
		
	public void setEnteringPerson(String enteringPerson){
		this.enteringPerson = enteringPerson;
	}
	
	public String getEnteringPerson(){
		return this.enteringPerson;
	}
		
	public void setEnteringPersonPhoneNumber(String enteringPersonPhoneNumber){
		this.enteringPersonPhoneNumber = enteringPersonPhoneNumber;
	}
	
	public String getEnteringPersonPhoneNumber(){
		return this.enteringPersonPhoneNumber;
	}
		
	public void setDepartmentId(String departmentId){
		this.departmentId = departmentId;
	}
	
	public String getDepartmentId(){
		return this.departmentId;
	}
		
	public void setSex(String sex){
		this.sex = sex;
	}
	
	public String getSex(){
		return this.sex;
	}
		
	public void setJob(String job){
		this.job = job;
	}
	
	public String getJob(){
		return this.job;
	}
		
		
}