package com.spottechindustrial.carpool.model;

import android.graphics.PointF;

public class Location {
	private String mLocationName;
	private String mLocationGoogle;
	private PointF mCoord;
	
	public void setLocationName(String locationName){
		this.mLocationName = locationName;
	}

	public String getLocationName(){
		return mLocationName;
	}
	

	public void setLocationGoogle(String locationGoogle){
		this.mLocationGoogle = locationGoogle;
	}

	public String getLocationGoogle(){
		return mLocationGoogle;
	}

	public void setCoord(PointF coord){
		this.mCoord = coord;
	}

	public PointF getCoord(){
		return mCoord;
	}
}
