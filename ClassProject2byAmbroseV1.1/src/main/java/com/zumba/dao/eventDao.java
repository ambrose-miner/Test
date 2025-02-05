package com.zumba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zumba.bean.event;
import com.zumba.resource.DbConnection;

public class eventDao {

	public List<event> viewAllevent() {
		List<event> listOfevent = new ArrayList<event>();
		try {
		Connection con = DbConnection.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from event");
		ResultSet rs = pstmt.executeQuery();		 
		while(rs.next()) {
			
			event bb = new event();
			bb.setEID(rs.getInt("EID"));
			bb.setDay(rs.getString("day"));
			bb.setTime(rs.getString("time"));
			
			bb.setAMPM(rs.getamorpm({AM,PM})); //Why won't enum value pass???
			
			bb.setLocation(rs.getString("location"));
			
			
			listOfevent.add(bb);		
			}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return listOfevent;
	}
}