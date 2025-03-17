package com.bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {
private int eID;
private String fName;
private String lName;
private String Department;
private int activeStatus;
private String firstName;
private String lastName;

public int geteID() {
	return eID;
}
public void seteID(int eID) {
	this.eID = eID;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public int getActiveStatus() {
	return activeStatus;
}
public void setActiveStatus(int activeStatus) {
	this.activeStatus = activeStatus;
}



}
