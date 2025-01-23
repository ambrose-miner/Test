package com.ebank.dao;

import java.sql.Connection;
//import java.sql.DriverManager; function moved to resource class.
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ebank.bean.Account;
//import com.ebank.bean.Transaction;   ??
import com.ebank.resource.DbConnection;

public class AccountDao {

	public int createAccount(Account newAccount) {
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasename", "root", "MySQLPasword");
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into account values(?,?,?)");
			pstmt.setInt(1, newAccount.getAccno());
			pstmt.setString(2, newAccount.getName());
			pstmt.setFloat(3, newAccount.getAmount());
			int result = pstmt.executeUpdate();
			return result;
		} catch (Exception e) {
			System.out.println(e.toString());
			return 0;
		}
	}
	
	
	public int withdraw(Account wAccount) { //Insert (, Transaction transaction)??
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasename", "root", "MySQLPasword");
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("update account set amount = amount-? where accno=?");
			pstmt.setFloat(1, wAccount.getAmount());
			pstmt.setInt(2, wAccount.getAccno());
			int result = pstmt.executeUpdate();	// the query effect how many record it return count. 
			return result;
		} catch (Exception e) {
			System.out.println(e.toString());
			return 0;
		}
	}
	
	public int deposit(Account dAccount) {
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasename", "root", "MySQLPasword");
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("update account set amount = amount+? where accno=?");
			pstmt.setFloat(1, dAccount.getAmount());
			pstmt.setInt(2, dAccount.getAccno());
			int result = pstmt.executeUpdate();
			return result;
		} catch (Exception e) {
			System.out.println(e.toString());
			return 0;
		}
	}
	
	public float findBalance(int accno) {
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasename", "root", "MySQLPasword");
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select amount from account where accno=?");
		
			pstmt.setInt(1, accno);
		
			ResultSet rs = pstmt.executeQuery();
		
			if(rs.next()) {
				float balance = rs.getFloat("amount");
				return balance;
			}else {
				return -1;
			}
		
		} catch (Exception e) {
			System.out.println(e.toString());
			return 0;
		}
	}
}