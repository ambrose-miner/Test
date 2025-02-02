package dao;
import java.sql.Connection;
public class zumbaMembersDao {
	public int createMember(Member newMember) {
		try {Connection con = DbConnection.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("provide new member information(?,?)");
		
		pstmt.setString(1,newMember.getDay());
		pstmt.setfloat(2, newMember.getTime());
		
		int result = pstmt.executeUpdate();
		return result;
		}catch (Exception e) {
			System.out.println(e.toString());
			return 0;
		}
	}
}
