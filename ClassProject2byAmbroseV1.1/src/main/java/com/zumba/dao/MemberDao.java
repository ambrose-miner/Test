package com.zumba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zumba.bean.Member;
import com.zumba.resource.DbConnection;

public class MemberDao {

	public List<Member> viewAllmember() {
		List<Member> listOfmember = new ArrayList<Member>();
		try {
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from member");	
			ResultSet rs = pstmt.executeQuery();		
				while(rs.next()) {
				
					Member nm = new Member();
					nm.setMID(rs.getInt("MID"));
					nm.setF_name(rs.getString("f_name"));
					nm.setL_name(rs.getString("l_name"));
					nm.setEmail(rs.getString("email"));
					listOfmember.add(nm);
				}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	return listOfmember;
	}
	
	public List<Member> viewMembersInEvent(int EID){
		List<Member> membersInEvent = new ArrayList<Member>();
		try {
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from member innerjoin memberEvent on member.MID = memberEvent.MID where EID = (?) "); 
			ResultSet rs2 = pstmt.executeQuery();
			pstmt.setInt(0, EID);
				while(rs2.next()) {
					
					Member nm = new Member();
					nm.setMID(rs2.getInt("MID"));
					nm.setF_name(rs2.getString("f_name"));
					nm.setL_name(rs2.getString("l_name"));
					nm.setEmail(rs2.getString("email"));
					membersInEvent.add(nm);
					
				}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	return membersInEvent;
	}
}