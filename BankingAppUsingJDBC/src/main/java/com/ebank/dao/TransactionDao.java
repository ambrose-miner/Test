package com.ebank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.ebank.bean.Account;
import com.ebank.bean.Transaction;
import com.ebank.resource.DbConnection;
import java.sql.DriverManager;

public class TransactionDao {
	
	public void tLog() {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasename", "root", "MySQLPasword");
			Connection con = DbConnection.getDbConnection(); 
		PreparedStatement pstmt = con.prepareStatement("insert into transaction values(?,?,?,?,?)");
		pstmt.setInt(1, transaction.setTid());
		pstmt.setInt(2, transaction.setAccno());
		pstmt.setDot(3, transaction.setDot());
		pstmt.setString(4, transaction.setTtype());
		pstmt.setFloat(5, transaction.setAmount());
		pstmt.execute();     // executeInsert();   ???
		} catch (Exception e) {
			System.out.println(e.toString());
		
		}
	}

}
