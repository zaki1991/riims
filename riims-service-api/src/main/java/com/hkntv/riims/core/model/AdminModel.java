package com.hkntv.riims.core.model;

import com.hkntv.pylon.core.beans.mapping.annotation.MapClass;
import java.util.Date;

@MapClass("com.hkntv.riims.core.entity.Admin")
public class AdminModel{
	
	private String id;
	private String category;
	private String sysLevel;
	private String name;
	private String nickname;
	private String userPwd;
	private String leadingOfficial;
	private String userJob;
	private String phoneNumber;
	private Date birthday;
	private String userSex;
		
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return this.id;
	}
		
	public void setCategory(String category){
		this.category = category;
	}
	
	public String getCategory(){
		return this.category;
	}
		
	public void setSysLevel(String sysLevel){
		this.sysLevel = sysLevel;
	}
	
	public String getSysLevel(){
		return this.sysLevel;
	}
		
	public void setNickname(String nickname){
		this.nickname = nickname;
	}
	
	public String getNickname(){
		return this.nickname;
	}
		
	public void setUserPwd(String userPwd){
		this.userPwd = userPwd;
	}
	
	public String getUserPwd(){
		return this.userPwd;
	}
		
	public void setLeadingOfficial(String leadingOfficial){
		this.leadingOfficial = leadingOfficial;
	}
	
	public String getLeadingOfficial(){
		return this.leadingOfficial;
	}
		
	public void setUserJob(String userJob){
		this.userJob = userJob;
	}
	
	public String getUserJob(){
		return this.userJob;
	}
		
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
		
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	
	public Date getBirthday(){
		return this.birthday;
	}
		
	public void setUserSex(String userSex){
		this.userSex = userSex;
	}
	
	public String getUserSex(){
		return this.userSex;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}