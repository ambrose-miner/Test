package com.bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Department {
private int dID;
private String name;
private int runStatus;

public int getdID() {
	return dID;
}
public void setdID(int dID) {
	this.dID = dID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRunStatus() {
	return runStatus;
}
public void setRunStatus(int runStatus) {
	this.runStatus = runStatus;
}

}
