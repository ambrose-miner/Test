package com.zumba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zumba.bean.member;
import com.zumba.resource.DbConnection;

public class memberDao {

	public List<member> viewAllmember() {
		List<member> listOfmember = new ArrayList<member>();
		try {
		Connection con = DbConnection.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from event");	// as string format 
		ResultSet rs = pstmt.executeQuery();		// in while loop we need to convert to object ie batch object 
		while(rs.next()) {
			// it display on console. 
//System.out.println("batch id "+rs.getInt(1)+" Type of batch "+rs.getString(2)+" time "+rs.getString(3));
			member bb = new member();
			bb.setMID(rs.getInt("MID"));
			bb.setF_name(rs.getString("f_name"));
			bb.setL_name(rs.getString("l_name"));
			bb.setEmail(rs.getString("email"));
			
			// converted as batch object 
			listOfmember.add(bb);		// store in list 
			}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return listOfmember;
	}
}