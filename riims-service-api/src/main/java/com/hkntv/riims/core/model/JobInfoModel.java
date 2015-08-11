package com.hkntv.riims.core.model;

import com.hkntv.pylon.core.beans.mapping.annotation.MapClass;
import java.util.Date;

@MapClass("com.hkntv.riims.core.entity.JobInfo")
public class JobInfoModel{
	
	private String guid;
	private String unitId;
	private String lineId;
	private String trackDivision;
	private String workAreaId;
	private String lineName;
	private String lineDirection;
	private String trackId;
	private String stationId;
	private String turnoutId;
	private String weldLineId;
	private Double mileage;
	private String leftRightTrack;
	private Date enteringDate;
	private String enteringPerson;
	private String deviceId;
	private Integer slightWoundNumber;
	private Integer severeWoundNumber;
	private String taskId;
		
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
		
	public void setLineId(String lineId){
		this.lineId = lineId;
	}
	
	public String getLineId(){
		return this.lineId;
	}
		
	public void setTrackDivision(String trackDivision){
		this.trackDivision = trackDivision;
	}
	
	public String getTrackDivision(){
		return this.trackDivision;
	}
		
	public void setWorkAreaId(String workAreaId){
		this.workAreaId = workAreaId;
	}
	
	public String getWorkAreaId(){
		return this.workAreaId;
	}
		
	public void setLineName(String lineName){
		this.lineName = lineName;
	}
	
	public String getLineName(){
		return this.lineName;
	}
		
	public void setLineDirection(String lineDirection){
		this.lineDirection = lineDirection;
	}
	
	public String getLineDirection(){
		return this.lineDirection;
	}
		
	public void setTrackId(String trackId){
		this.trackId = trackId;
	}
	
	public String getTrackId(){
		return this.trackId;
	}
		
	public void setStationId(String stationId){
		this.stationId = stationId;
	}
	
	public String getStationId(){
		return this.stationId;
	}
		
	public void setTurnoutId(String turnoutId){
		this.turnoutId = turnoutId;
	}
	
	public String getTurnoutId(){
		return this.turnoutId;
	}
		
	public void setWeldLineId(String weldLineId){
		this.weldLineId = weldLineId;
	}
	
	public String getWeldLineId(){
		return this.weldLineId;
	}
		
	public void setMileage(Double mileage){
		this.mileage = mileage;
	}
	
	public Double getMileage(){
		return this.mileage;
	}
		
	public void setLeftRightTrack(String leftRightTrack){
		this.leftRightTrack = leftRightTrack;
	}
	
	public String getLeftRightTrack(){
		return this.leftRightTrack;
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
		
	public void setDeviceId(String deviceId){
		this.deviceId = deviceId;
	}
	
	public String getDeviceId(){
		return this.deviceId;
	}
		
	public void setSlightWoundNumber(Integer slightWoundNumber){
		this.slightWoundNumber = slightWoundNumber;
	}
	
	public Integer getSlightWoundNumber(){
		return this.slightWoundNumber;
	}
		
	public void setSevereWoundNumber(Integer severeWoundNumber){
		this.severeWoundNumber = severeWoundNumber;
	}
	
	public Integer getSevereWoundNumber(){
		return this.severeWoundNumber;
	}
		
	public void setTaskId(String taskId){
		this.taskId = taskId;
	}
	
	public String getTaskId(){
		return this.taskId;
	}
		
		
}