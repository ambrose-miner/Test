package com;
import java.sql.*;
public class JdbcTest {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "MySQL$h1t");
		System.out.println("Connected successfully");
		Statement stmt= con.createStatement();
//		int result = stmt.executeUpdate("update film set title= 'Aliens' where film_id=7  ");
//		int result = stmt.executeUpdate("insert into films_Classics values ('Alien',271, 2.5)");
//		int result = stmt.executeUpdate("insert into films_Classics values ('Aliens',272, 2.1)");
//		int result = stmt.executeUpdate("insert into films_Classics values ('TerminatorTwo',273, 1.9)");
		int result = stmt.executeUpdate("insert into films_Classics values ('BacktotheFuture',274, 2.5)");
		if(result>0) {
				System.out.println("Record Updated");
				}else {
					System.out.println("Unknown Record");
				}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}