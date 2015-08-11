package com.hkntv.riims.core.model;

import com.hkntv.pylon.core.beans.mapping.annotation.MapClass;
import java.util.Date;

@MapClass("com.hkntv.riims.core.entity.TrackDivisionInfo")
public class TrackDivisionInfoModel{
	
	private String guid;
	private String id;
	private String trackDivisionName;
	private String lineId;
	private String lineName;
	private String lineDirection;
	private Double startMileage;
	private Double endMileage;
	private Double extensionLength;
	private Date railLayingDate;
	private String railType;
	private Double preYearPassWeight;
	private Integer minYearlyInspectionNumber;
	private Integer findSevereWound;
	private Integer existingWoundNumber;
	private Double woundRate;
	private String currentRailStatusEvaluate;
	private Integer yearlyInspectionNumber;
	private Integer inspectionAreaInspBlockNumber;
	private String responsibleInspecitonArea;
	private String remark;
		
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
		
	public void setTrackDivisionName(String trackDivisionName){
		this.trackDivisionName = trackDivisionName;
	}
	
	public String getTrackDivisionName(){
		return this.trackDivisionName;
	}
		
	public void setLineId(String lineId){
		this.lineId = lineId;
	}
	
	public String getLineId(){
		return this.lineId;
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
		
	public void setStartMileage(Double startMileage){
		this.startMileage = startMileage;
	}
	
	public Double getStartMileage(){
		return this.startMileage;
	}
		
	public void setEndMileage(Double endMileage){
		this.endMileage = endMileage;
	}
	
	public Double getEndMileage(){
		return this.endMileage;
	}
		
	public void setExtensionLength(Double extensionLength){
		this.extensionLength = extensionLength;
	}
	
	public Double getExtensionLength(){
		return this.extensionLength;
	}
		
	public void setRailLayingDate(Date railLayingDate){
		this.railLayingDate = railLayingDate;
	}
	
	public Date getRailLayingDate(){
		return this.railLayingDate;
	}
		
	public void setRailType(String railType){
		this.railType = railType;
	}
	
	public String getRailType(){
		return this.railType;
	}
		
	public void setPreYearPassWeight(Double preYearPassWeight){
		this.preYearPassWeight = preYearPassWeight;
	}
	
	public Double getPreYearPassWeight(){
		return this.preYearPassWeight;
	}
		
	public void setMinYearlyInspectionNumber(Integer minYearlyInspectionNumber){
		this.minYearlyInspectionNumber = minYearlyInspectionNumber;
	}
	
	public Integer getMinYearlyInspectionNumber(){
		return this.minYearlyInspectionNumber;
	}
		
	public void setFindSevereWound(Integer findSevereWound){
		this.findSevereWound = findSevereWound;
	}
	
	public Integer getFindSevereWound(){
		return this.findSevereWound;
	}
		
	public void setExistingWoundNumber(Integer existingWoundNumber){
		this.existingWoundNumber = existingWoundNumber;
	}
	
	public Integer getExistingWoundNumber(){
		return this.existingWoundNumber;
	}
		
	public void setWoundRate(Double woundRate){
		this.woundRate = woundRate;
	}
	
	public Double getWoundRate(){
		return this.woundRate;
	}
		
	public void setCurrentRailStatusEvaluate(String currentRailStatusEvaluate){
		this.currentRailStatusEvaluate = currentRailStatusEvaluate;
	}
	
	public String getCurrentRailStatusEvaluate(){
		return this.currentRailStatusEvaluate;
	}
		
	public void setYearlyInspectionNumber(Integer yearlyInspectionNumber){
		this.yearlyInspectionNumber = yearlyInspectionNumber;
	}
	
	public Integer getYearlyInspectionNumber(){
		return this.yearlyInspectionNumber;
	}
		
	public void setInspectionAreaInspBlockNumber(Integer inspectionAreaInspBlockNumber){
		this.inspectionAreaInspBlockNumber = inspectionAreaInspBlockNumber;
	}
	
	public Integer getInspectionAreaInspBlockNumber(){
		return this.inspectionAreaInspBlockNumber;
	}
		
	public void setResponsibleInspecitonArea(String responsibleInspecitonArea){
		this.responsibleInspecitonArea = responsibleInspecitonArea;
	}
	
	public String getResponsibleInspecitonArea(){
		return this.responsibleInspecitonArea;
	}
		
	public void setRemark(String remark){
		this.remark = remark;
	}
	
	public String getRemark(){
		return this.remark;
	}
		
		
}