package com.zumba.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zumba.bean.Member;
import com.zumba.bean.MemberEvent;
import com.zumba.resource.DbConnection;

public class MemberEventDao {

	public void addMemberToEvent(Member newMemberEvent) {
		try {
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into MemberEvent(EID, MID) values (?,?)");
			pstmt.setString(1, newMemberEvent.getEID());
			pstmt.setString(2, newMemberEvent.getMID());
			int intResult = pstmt.executeUpdate(); 
			System.out.println("MemberEvent Dao addNewMemberEvent=" +intResult);
				
		}catch (Exception e) {
				System.err.println(e.toString());
		}
	}
}