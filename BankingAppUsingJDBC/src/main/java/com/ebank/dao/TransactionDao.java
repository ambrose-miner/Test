package com.ebank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.ebank.bean.Account;
import com.ebank.bean.Transaction;
import com.ebank.resource.DbConnection;
import java.sql.DriverManager;

public class TransactionDao {
	
	public void tLog(Transaction X) {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/databasename", "root", "MySQLPasword");
			Connection con = DbConnection.getDbConnection(); 
		PreparedStatement pstmt = con.prepareStatement("insert into transaction values(?,?,?,?,?)");
		pstmt.setInt(1, X.getTid());
		pstmt.setInt(2, X.getAccno());
		pstmt.setDate(3, X.getDot());
		pstmt.setString(4, X.getTtype());
		pstmt.setFloat(5, X.getAmount());
		pstmt.execute();     
		} catch (Exception e) {
			System.out.println(e.toString());
		
		}
	}

}
