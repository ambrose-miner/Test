package resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	static Connection con;
	
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2", "root", "MySQL$h1t");	
		} catch (Exception e) {
			System.out.println(e.toString());	
		}
	}
	
	public static Connection getDbConnection() {
		
		try {
			return con;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}