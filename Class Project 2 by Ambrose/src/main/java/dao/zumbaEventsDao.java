package dao;
import java.sql.Connection;
public class zumbaEventsDao {
	public int createEvent(Event newEvent) {
		try {Connection con = DbConnection.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("provide event details(?,?,?)");
		pstmt.setString(1,newEvent.getDay());
		pstmt.setfloat(2, newEvent.getTime());
		pstmt.setString(3,newEvent.getlocation());
		int result = pstmt.executeUpdate();
		return result;
		}catch (Exception e) {
			System.out.println(e.toString());
			return 0;
		}
	}
}
