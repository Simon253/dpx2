package com.spottechindustrial.carpool.model;

public class Student {
	private String mId;
	private String mEmail;
	private String mUserName;
	private String mPassword;
	private char mGender;
	private String mMajor;
	private int mClass;



	public void setId(String id){
		this.mId = id;
	}

	public String getId(){
		return mId;
	}

    public void setEmail(String email) {
        this.mEmail = email;
    }

    public String getEmail() {
        return this.mEmail;
    }

    public void setUserName(String username){
    	this.mUserName = username;
    }

    public String getUserName(){
    	return mUserName;
    }

    public void setPassword(String password) {
        this.mPassword = password;
    }

    public String getPassword() {
        return this.mPassword;
    }
    
    public void setGender(char gender){
    	this.mGender = gender;
    }
    
    public char getGender(){
    	return mGender;
    }
    
    public void setMajor(String major){
    	this.mMajor = major;
    }

    public String getMajor(){
    	return mMajor;
    }

    public void setClss(int clss){
    	this.mClass = clss;
    }
    
    public int getClss(){
    	return mClass;
    }
}
