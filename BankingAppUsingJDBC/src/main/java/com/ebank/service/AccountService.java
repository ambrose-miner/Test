package com.ebank.service;

import com.ebank.bean.Account;
import com.ebank.dao.AccountDao;

public class AccountService {

	AccountDao ad = new AccountDao();
	
	public String createAccount(Account newAccount) {
		if(newAccount.getAmount()<1000) {
			return "Minimum deposit of 1000 required to open account";
		}else if(ad.createAccount(newAccount)>0) {
			return "A new account was successfully created";
		}else {
			return "Account couldn't be created";
		}
	}
	
	public String withdraw(Account withdrawAccount) {
		float balance =ad.findBalance(withdrawAccount.getAccno()); 
		if(balance==-1) {
			return "Account doesn't exists";
		}else {
			if(balance >  withdrawAccount.getAmount()) {
				
				if(ad.withdraw(withdrawAccount)>0) {
					return "Funds withdrawn successfully";
				}else {
					return "Withdrawl couldn't be completed";
				}
				
	
			}else {
				return "Withdrawl failed insufficient funds";
			}
		}
	}
	
	public String deposit(Account depostAccount) {
		if(ad.deposit(depostAccount)>0) {
			return "Deposite was successfully compleated";
		}else {
			return "Error Deposit failed";
		}
	}
	
	public String findBalance(int accno) {
		float balance = ad.findBalance(accno);
		if(balance==-1) {
			return "Account doesn't exists";
		}else {
			return "Your balance is "+balance;
		}
	}
}