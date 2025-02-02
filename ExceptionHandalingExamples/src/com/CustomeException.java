package com;

public class CustomeException extends Exception{

	public CustomeException() {
	super();		// calling super class ie Exception class empty constructor 
	}
	
	public CustomeException(String message) {
	//super();	// calling super class ie Exception class empty constructor 
	super(message);		// calling explicity super class parameter constructor to set message 
	}
}