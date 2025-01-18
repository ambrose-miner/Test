package com.ebank.bean;
import java.time.LocalDateTime;
public class Transaction {
public int tid;
public int accno;
public LocalDateTime dot;
public String Ttype;
public float amount;

//These are all being made as public for the sake of initial testing

public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public LocalDateTime getDot() {
	return dot;
}
public void setDot(LocalDateTime dot) {
	this.dot = dot;
}
public String getTtype() {
	return Ttype;
}
public void setTtype(String ttype) {
	Ttype = ttype;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}



}
