package com.zumba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zumba.bean.Event;
import com.zumba.resource.DbConnection;

public class EventDao {

	public List<Event> viewAllevent() {
		List<Event> listOfevent = new ArrayList<Event>();
		try {
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from event");
			
			ResultSet rs = pstmt.executeQuery();		 
					while(rs.next()) {
					
						Event bb = new Event();
						bb.setEID(rs.getInt("EID"));
						bb.setDay(rs.getString("day"));
						bb.setTime(rs.getString("time"));
						bb.setLocation(rs.getString("location"));
						listOfevent.add(bb);		
					}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return listOfevent;
	}
	
	public List<Event> viewEventsForMember(int MID) {//add bean here later.
		List<Event> eventsForMember = new ArrayList<Event>();
		try {
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from Event innerjoin MemberEvent on Event.EID = MemberEvent.EID where MID = (?)");
			pstmt.setInt(0, MID);
			ResultSet rs2 = pstmt.executeQuery();
					while(rs2.next()) {
						Event currentEvent = new Event();
						currentEvent.setEID(rs2.getInt("EID"));
						currentEvent.setDay(rs2.getString("day"));
						currentEvent.setTime(rs2.getString("time"));
						currentEvent.setLocation(rs2.getString("location"));
						eventsForMember.add(currentEvent);		
					}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return eventsForMember;
	}
	
	public Event viewSpecificEvent(int EID) {
		Event currentSpecificEvent = null;
		try {
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select from Event where EID = (?)");
			pstmt.setInt(0, EID);
			ResultSet rs3 = pstmt.executeQuery();
					while(rs3.next()) {
						currentSpecificEvent = new Event();
						currentSpecificEvent.setEID(rs3.getInt("EID"));
						currentSpecificEvent.setDay(rs3.getString("day"));
						currentSpecificEvent.setTime(rs3.getString("time"));
						currentSpecificEvent.setLocation(rs3.getString("location"));
					}
			
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return currentSpecificEvent;
	}
}



