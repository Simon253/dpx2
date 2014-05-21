package com.spottechindustrial.carpool.model;

import java.util.ArrayList;
//multi threading needs to be addressed later.
public class Schedule {
	private String mProposer;
	private String mDriver;
	private ArrayList<String> mParticipants;
	private int mMAX = 5;	//currently default 5
	private boolean mHasDriver;
	Location mFrom;
	Location mTo;
	long mFromTime;
	int mFromTimeArd;
	long mToTime;
	int mToTimeArd;

	public Schedule(String proposer){
		this.mProposer = proposer;
		this.mHasDriver = false;
		this.mParticipants = new ArrayList<String>();
		mParticipants.add(proposer);
	}

	public Schedule(String proposer, int max){
		this.mProposer = proposer;
		this.mMAX = max;
		this.mHasDriver = false;
		this.mParticipants = new ArrayList<String>();
		mParticipants.add(proposer);
	}

	public Schedule(String proposer, boolean isDriver){
		this.mProposer = proposer;
		this.mHasDriver = isDriver;
		if(isDriver) mDriver = proposer;
		this.mParticipants = new ArrayList<String>();
		mParticipants.add(proposer);
	}

	public void setProposer(String proposer){
		this.mProposer = proposer;
	}
	
	public String setProposer(){
		return mProposer;
	}

	public boolean hasDriver(){
		return mHasDriver;
	}

	public void setDriver(String driver){
		this.mDriver = driver;
		if(this.mParticipants.contains(driver) == false)
			mParticipants.add(driver);
	}

	public String getDriver(){
		return mDriver;
	}
	
	public void setMax(int max){
		this.mMAX = max;
	}

	public int getMax(){
		return mMAX;
	}

	public boolean isScheduleFull(){
		return mParticipants.size() > mMAX;
	}
	public boolean addParticipant(String id){
		if(isScheduleFull()) return false;
		mParticipants.add(id);
		return true;
	}
	
	public ArrayList<String> getParticipants(){
		return mParticipants;
	}

	public void setLocationFrom(Location from){
		this.mFrom = from;
	}

	public Location getLocationFrom(){
		return mFrom;
	}

	public void setLocationTo(Location to){
		this.mFrom = to;
	}

	public Location getLocationTo(){
		return mTo;
	}

	public void setFromTime(long fromTime){
		this.mFromTime = fromTime;
	}

	public long getFromTime(){
		return mFromTime;
	}

	public void setFromTimeArd(int fromTimeArd){
		this.mFromTimeArd = fromTimeArd;
	}

	public int getFromTimeArd(){
		return mFromTimeArd;
	}

	public void setToTime(long toTime){
		this.mToTime = toTime;
	}

	public long getToTime(){
		return mToTime;
	}

	public void setToTimeArd(int fromTimeArd){
		this.mFromTimeArd = fromTimeArd;
	}

	public int getToTimeArd(){
		return mFromTimeArd;
	}

}
