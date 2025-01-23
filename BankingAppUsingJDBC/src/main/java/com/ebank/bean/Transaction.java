package com.ebank.bean;
import java.sql.Date;
public class Transaction {
	public int tid;
	public int accno;
	public Date dot;
	public String tType;
	public float amount;

//These are all being made as public for the sake of initial testing

	public Transaction(int accno2, float amount2, String tType) {
		accno = accno2;
		amount = amount2;		
		this.tType = tType;
		// TODO Auto-generated constructor stub
	}
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
	public Date getDot() {
		return dot;
	}
	public void setDot(Date dot) {
		this.dot = dot;
	}
	public String getTtype() {
		return tType;
	}
	public void setTtype(String ttype) {
		tType = ttype;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	

}
