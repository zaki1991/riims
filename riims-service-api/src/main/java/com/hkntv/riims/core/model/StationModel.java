package com.hkntv.riims.core.model;

import com.hkntv.pylon.core.beans.mapping.annotation.MapClass;

@MapClass("com.hkntv.riims.core.entity.Station")
public class StationModel{
	
	private String guid;
	private String stationId;
	private String stationName;
		
	public void setGuid(String guid){
		this.guid = guid;
	}
	
	public String getGuid(){
		return this.guid;
	}
		
	public void setStationId(String stationId){
		this.stationId = stationId;
	}
	
	public String getStationId(){
		return this.stationId;
	}
		
	public void setStationName(String stationName){
		this.stationName = stationName;
	}
	
	public String getStationName(){
		return this.stationName;
	}
		
		
}