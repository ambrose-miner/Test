package com.ebank.service;

import com.ebank.bean.Account;
import com.ebank.bean.Transaction;
import com.ebank.dao.TransactionDao;

public class TransactionService {

	TransactionDao tDao = new TransactionDao();
	AccountService aServ = new AccountService();

	public String withdraw(Transaction withdrawTransaction) {
		
		String output="";
		
		Account workingAccount = new Account();
		int j = withdrawTransaction.getAccno();
		float x = withdrawTransaction.getAmount();
		workingAccount.setAmount(x);
		workingAccount.setAccno(j);
		 
		 
//		workingAccount.setAmount(withdrawTransaction.getAmount()); Simplified above logic
//		workingAccount.setAccno(withdrawTransaction.getAccno());
		
		output = aServ.withdraw(workingAccount);
		tDao.tLog(withdrawTransaction);
		return output;
	}
	public String deposit(Transaction depositTransaction) {
		
        String output="";
		
		Account workingAccount = new Account();
		int j = depositTransaction.getAccno();
		float x = depositTransaction.getAmount();
		workingAccount.setAmount(x);
		workingAccount.setAccno(j);
		
		output = aServ.deposit(workingAccount);
		tDao.tLog(depositTransaction);
		return output;
	}
	
}