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
	
	public List<Event> viewEventsForMember() {
		List<Event> eventsForMember = new ArrayList<Event>();
		try {
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from Event innerjoin MemberEvent on Event.EID = MemberEvent.EID where MID = (?)");
			ResultSet rs2 = pstmt.executeQuery();
					while(rs2.next()) {
						Event mm = new Event();
						mm.setEID(rs2.getInt("EID"));
						mm.setDay(rs2.getString("day"));
						mm.setTime(rs2.getString("time"));
						mm.setLocation(rs2.getString("location"));
						eventsForMember.add(mm);		
					}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	return eventsForMember;
	}
	
	public Event viewSpecificEvent() {
		Event specificEvent = viewSpecificEvent();
		try {
			Connection con = DbConnection.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select from Event where EID = (?)");
			ResultSet rs3 = pstmt.executeQuery();
					while(rs3.next()) {
						Event se = new Event();
						se.setEID(rs3.getInt("EID"));
						se.setDay(rs3.getString("day"));
						se.setTime(rs3.getString("time"));
						se.setLocation(rs3.getString("location"));
						specificEvent.add(se);	//Why????	
					}
			
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return specificEvent;
	}
}