package bean;

public class zumbaEvent {
private int event_id;
private int member_id;
public String day;
public float time;
public String location;

public int getEvent_id() {
	return event_id;
}
public void setEvent_id(int event_id) {
	this.event_id = event_id;
}
public int getMember_id() {
	return member_id;
}
public void setMember_id(int member_id) {
	this.member_id = member_id;
}
public String getDay() {
	return day;
}
public void setDay(String day) {
	this.day = day;
}
public float getTime() {
	return time;
}
public void setTime(float time) {
	this.time = time;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
}
