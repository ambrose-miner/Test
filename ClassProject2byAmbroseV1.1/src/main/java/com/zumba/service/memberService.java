package com.zumba.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zumba.bean.member;
import com.zumba.bean.memberEvent;
import com.zumba.dao.memberDao;
import com.zumba.resource.DbConnection;

public class memberService {

	
memberDao bd = new memberDao();
member mE = new member();
	
	public List<member> viewAllmemberDetails() {
		return bd.viewAllmember();	
	}
	public member viewMemberDetails(){
		
		return viewMemberDetails();
		
	}
	public void addMember() {
		
		try {
		Connection con = DbConnection.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("update member");	
		ResultSet rs = pstmt.executeUpdate();		
		while(rs.next()) {
			
			member mE = new member();
			//mE.setMID(rs.getInt("MID")); This is auto generated so I don't need it....?
			mE.setF_name(rs.getString("f_name"));
			mE.setL_name(rs.getString("l_name"));
			mE.setEmail(rs.getString("email"));
			
			
			member.add(mE);		}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		
	}
}
