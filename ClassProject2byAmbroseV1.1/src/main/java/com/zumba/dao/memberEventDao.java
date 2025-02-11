package com.zumba.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zumba.bean.member;
import com.zumba.bean.memberEvent;
import com.zumba.resource.DbConnection;

public class memberEventDao {

	
	public List<memberEvent> addMemberToEvent() { 
		// I dont want to pass list of member event here.... 
		//do I event want this function here
		List<memberEvent> listOfmemberEvent = new ArrayList<memberEvent>();
		try {
		Connection con = DbConnection.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("update memberEvent");	
		ResultSet rs = pstmt.executeUpdate();		
		while(rs.next()) {
			
			member mE = new memberEvent();
			mE.setMID(rs.getInt("MID"));
			mE.setF_name(rs.getString("f_name"));
			mE.setL_name(rs.getString("l_name"));
			mE.setEmail(rs.getString("email"));
			
			
			listOfmemberEvent.add(mE);		}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return listOfmemberEvent;
	}
}
	
	
	
}
