package com.hkntv.riims.core.entity;

import java.util.Date;

public class JobInfo {
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

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getTrackDivision() {
        return trackDivision;
    }

    public void setTrackDivision(String trackDivision) {
        this.trackDivision = trackDivision;
    }

    public String getWorkAreaId() {
        return workAreaId;
    }

    public void setWorkAreaId(String workAreaId) {
        this.workAreaId = workAreaId;
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

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getTurnoutId() {
        return turnoutId;
    }

    public void setTurnoutId(String turnoutId) {
        this.turnoutId = turnoutId;
    }

    public String getWeldLineId() {
        return weldLineId;
    }

    public void setWeldLineId(String weldLineId) {
        this.weldLineId = weldLineId;
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    public String getLeftRightTrack() {
        return leftRightTrack;
    }

    public void setLeftRightTrack(String leftRightTrack) {
        this.leftRightTrack = leftRightTrack;
    }

    public Date getEnteringDate() {
        return enteringDate;
    }

    public void setEnteringDate(Date enteringDate) {
        this.enteringDate = enteringDate;
    }

    public String getEnteringPerson() {
        return enteringPerson;
    }

    public void setEnteringPerson(String enteringPerson) {
        this.enteringPerson = enteringPerson;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getSlightWoundNumber() {
        return slightWoundNumber;
    }

    public void setSlightWoundNumber(Integer slightWoundNumber) {
        this.slightWoundNumber = slightWoundNumber;
    }

    public Integer getSevereWoundNumber() {
        return severeWoundNumber;
    }

    public void setSevereWoundNumber(Integer severeWoundNumber) {
        this.severeWoundNumber = severeWoundNumber;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}