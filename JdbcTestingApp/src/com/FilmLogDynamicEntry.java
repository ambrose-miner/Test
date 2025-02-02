package com;
import java.sql.*;
import java.util.Scanner;
public class FilmLogDynamicEntry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "MySQL$h1t");
	Statement stmt = con.createStatement();
	// insert query 
	System.out.println("1:Add Film 2 : Delete Film 3 : Update Film 4 : Retrieve Film");
	System.out.println("Choose 1-4 to enter your choice");
	int choice = sc.nextInt();
	
	if(choice==1) {
		
		PreparedStatement pstmt = con.prepareStatement("insert into films_Classics values(?,?,?)");
		System.out.println("Enter the Name");
		String name = sc.next();
		pstmt.setString(1, name);		// here we set name value to 1st ? in query 
	
		System.out.println("Enter the ID");
		int id= sc.nextInt();
		pstmt.setInt(2, id);	// here we set ID value to 2nd ? in query 
	
		System.out.println("Enter the run time");
		float salary = sc.nextFloat();
		pstmt.setFloat(3, salary);	// here we set run time value to 3rd ? in query 
	
		int result = pstmt.executeUpdate();
		if(result>0) {
			System.out.println("Film added successfully");
		}
		
	}else if(choice==2) {
		
		PreparedStatement pstmt = con.prepareStatement("delete from film where name = ?");
		System.out.println("Enter the name");
		String name = sc.next();
		pstmt.setString(1, name);		// here we set name value to 1st ? in query
	
	
		int result = pstmt.executeUpdate();
		if(result>0) {
			System.out.println("film removed successfully");
		}else {
			System.out.println("film not present");
		}
		
	}else if(choice==3) {
		
		
		PreparedStatement pstmt = con.prepareStatement("update film length = ? where id=?");
		System.out.println("Enter the id");
		int id = sc.nextInt();
		pstmt.setInt(2, id);		// here we set id value to 2nd ? in query 
	
		
		System.out.println("Enter the correct run time");
		float runTime = sc.nextFloat();
		pstmt.setFloat(1, runTime);	// here we set salary value to 1st ? in query 
	
		int result = pstmt.executeUpdate();
		if(result>0) {
			System.out.println("Runtime updated successfully");
		}else {
			System.out.println("Record not present");
		}
		
	}else if(choice==4) {
		
		PreparedStatement pstmt = con.prepareStatement("select * from films_Classics where ID > ?");
		
		System.out.println("Enter the ID");
		int ID = sc.nextInt();
		pstmt.setInt(1, ID);	// here we set salary value to 1st ? in query 
	
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println("Id is "+rs.getInt("ID")+" Name is "+rs.getString("name")+" Runtime is "+rs.getFloat("Length"));
		}
		
	}else {
		System.out.println("wrong choice");
	}
	
	
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}