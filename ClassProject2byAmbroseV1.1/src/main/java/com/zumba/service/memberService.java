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
	public member viewMemberDetails("select * from member where MID = input" ){ //input????
		
		return viewMemberDetails();
		
	}
	public void addMember() {
		
		try {
		Connection con = DbConnection.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("update member");	
		 uM = pstmt.executeUpdate();	//why does it want to make uM an integer????	
		while(uM.next()) {
			
			member mE = new member();
			//mE.setMID(rs.getInt("MID")); This is auto generated so I don't need it....?
			mE.setF_name(uM.getString("f_name"));
			mE.setL_name(uM.getString("l_name"));
			mE.setEmail(uM.getString("email"));
			
			
			}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		
	}
}
