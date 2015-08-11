package com.hkntv.riims.core.entity;

import java.util.Date;

public class LineInfo {
    private String guid;

    private String id;

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

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineDirection() {
        return lineDirection;
    }

    public void setLineDirection(String lineDirection) {
        this.lineDirection = lineDirection;
    }

    public Double getStartMileage() {
        return startMileage;
    }

    public void setStartMileage(Double startMileage) {
        this.startMileage = startMileage;
    }

    public Double getEndMileage() {
        return endMileage;
    }

    public void setEndMileage(Double endMileage) {
        this.endMileage = endMileage;
    }

    public Double getExtensionLength() {
        return extensionLength;
    }

    public void setExtensionLength(Double extensionLength) {
        this.extensionLength = extensionLength;
    }

    public Date getRailLayingDate() {
        return railLayingDate;
    }

    public void setRailLayingDate(Date railLayingDate) {
        this.railLayingDate = railLayingDate;
    }

    public String getRailType() {
        return railType;
    }

    public void setRailType(String railType) {
        this.railType = railType;
    }

    public Double getPreYearPassWeight() {
        return preYearPassWeight;
    }

    public void setPreYearPassWeight(Double preYearPassWeight) {
        this.preYearPassWeight = preYearPassWeight;
    }

    public Integer getMinYearlyInspectionNumber() {
        return minYearlyInspectionNumber;
    }

    public void setMinYearlyInspectionNumber(Integer minYearlyInspectionNumber) {
        this.minYearlyInspectionNumber = minYearlyInspectionNumber;
    }

    public Integer getFindSevereWound() {
        return findSevereWound;
    }

    public void setFindSevereWound(Integer findSevereWound) {
        this.findSevereWound = findSevereWound;
    }

    public Integer getExistingWoundNumber() {
        return existingWoundNumber;
    }

    public void setExistingWoundNumber(Integer existingWoundNumber) {
        this.existingWoundNumber = existingWoundNumber;
    }

    public Double getWoundRate() {
        return woundRate;
    }

    public void setWoundRate(Double woundRate) {
        this.woundRate = woundRate;
    }

    public String getCurrentRailStatusEvaluate() {
        return currentRailStatusEvaluate;
    }

    public void setCurrentRailStatusEvaluate(String currentRailStatusEvaluate) {
        this.currentRailStatusEvaluate = currentRailStatusEvaluate;
    }

    public Integer getYearlyInspectionNumber() {
        return yearlyInspectionNumber;
    }

    public void setYearlyInspectionNumber(Integer yearlyInspectionNumber) {
        this.yearlyInspectionNumber = yearlyInspectionNumber;
    }

    public Integer getInspectionAreaInspBlockNumber() {
        return inspectionAreaInspBlockNumber;
    }

    public void setInspectionAreaInspBlockNumber(Integer inspectionAreaInspBlockNumber) {
        this.inspectionAreaInspBlockNumber = inspectionAreaInspBlockNumber;
    }

    public String getResponsibleInspecitonArea() {
        return responsibleInspecitonArea;
    }

    public void setResponsibleInspecitonArea(String responsibleInspecitonArea) {
        this.responsibleInspecitonArea = responsibleInspecitonArea;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}