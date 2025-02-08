package com.zumba.bean;

public class event {
	
private int EID;
private String day;
private String time;
public enum amorpm {AM,PM};
private String location;
public amorpm AMPM; //changed to public for enum testing.

public amorpm getAMPM() {
	return AMPM;
}

public void setAMPM(amorpm aMPM) {
	AMPM = aMPM;
}

public int getEID() {
	return EID;
}

public void setEID(int eID) {
	EID = eID;
}

public String getDay() {
	return day;
}

public void setDay(String day) {
	this.day = day;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

}
