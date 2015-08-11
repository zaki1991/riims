package com.hkntv.riims.core.vo;

import com.hkntv.pylon.core.beans.mapping.annotation.MapClass;
import java.util.Date;

@MapClass("com.hkntv.riims.core.model.DeviceModel")
public class DeviceVO{
	
	private String guid;
	private String deviceId;
	private String deviceType;
	private String price;
	private String deviceVersion;
	private Date boughtDate;
	private String leadingOfficial;
	private Date productionDate;
	private String phoneNumber;
	private String yearlyInspectionStatus;
	private Date quaterlyInspectionDate;
	private Date monthlyInspectionDate;
	private String manufacturer;
	private String isRebuildDevice;
	private Date maintenancePeriod;
	private Date planScrapDate;
	private String usingUnit;
	private String deviceStatus;
	private Date startUseDate;
	private String remark;
		
	public void setGuid(String guid){
		this.guid = guid;
	}
	
	public String getGuid(){
		return this.guid;
	}
		
	public void setDeviceType(String deviceType){
		this.deviceType = deviceType;
	}
	
	public String getDeviceType(){
		return this.deviceType;
	}
		
	public void setPrice(String price){
		this.price = price;
	}
	
	public String getPrice(){
		return this.price;
	}
		
	public void setDeviceVersion(String deviceVersion){
		this.deviceVersion = deviceVersion;
	}
	
	public String getDeviceVersion(){
		return this.deviceVersion;
	}
		
	public void setBoughtDate(Date boughtDate){
		this.boughtDate = boughtDate;
	}
	
	public Date getBoughtDate(){
		return this.boughtDate;
	}
		
	public void setLeadingOfficial(String leadingOfficial){
		this.leadingOfficial = leadingOfficial;
	}
	
	public String getLeadingOfficial(){
		return this.leadingOfficial;
	}
		
	public void setProductionDate(Date productionDate){
		this.productionDate = productionDate;
	}
	
	public Date getProductionDate(){
		return this.productionDate;
	}
		
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
		
	public void setYearlyInspectionStatus(String yearlyInspectionStatus){
		this.yearlyInspectionStatus = yearlyInspectionStatus;
	}
	
	public String getYearlyInspectionStatus(){
		return this.yearlyInspectionStatus;
	}
		
	public void setQuaterlyInspectionDate(Date quaterlyInspectionDate){
		this.quaterlyInspectionDate = quaterlyInspectionDate;
	}
	
	public Date getQuaterlyInspectionDate(){
		return this.quaterlyInspectionDate;
	}
		
	public void setMonthlyInspectionDate(Date monthlyInspectionDate){
		this.monthlyInspectionDate = monthlyInspectionDate;
	}
	
	public Date getMonthlyInspectionDate(){
		return this.monthlyInspectionDate;
	}
		
	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}
	
	public String getManufacturer(){
		return this.manufacturer;
	}
		
	public void setIsRebuildDevice(String isRebuildDevice){
		this.isRebuildDevice = isRebuildDevice;
	}
	
	public String getIsRebuildDevice(){
		return this.isRebuildDevice;
	}
		
	public void setMaintenancePeriod(Date maintenancePeriod){
		this.maintenancePeriod = maintenancePeriod;
	}
	
	public Date getMaintenancePeriod(){
		return this.maintenancePeriod;
	}
		
	public void setPlanScrapDate(Date planScrapDate){
		this.planScrapDate = planScrapDate;
	}
	
	public Date getPlanScrapDate(){
		return this.planScrapDate;
	}
		
	public void setUsingUnit(String usingUnit){
		this.usingUnit = usingUnit;
	}
	
	public String getUsingUnit(){
		return this.usingUnit;
	}
		
	public void setDeviceStatus(String deviceStatus){
		this.deviceStatus = deviceStatus;
	}
	
	public String getDeviceStatus(){
		return this.deviceStatus;
	}
		
	public void setStartUseDate(Date startUseDate){
		this.startUseDate = startUseDate;
	}
	
	public Date getStartUseDate(){
		return this.startUseDate;
	}
		
	public void setRemark(String remark){
		this.remark = remark;
	}
	
	public String getRemark(){
		return this.remark;
	}


	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
}