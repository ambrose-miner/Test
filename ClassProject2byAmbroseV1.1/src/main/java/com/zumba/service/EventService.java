package com.zumba.service;

import java.util.List;

import com.zumba.bean.Event;
import com.zumba.dao.EventDao;

public class EventService {

	EventDao bd = new EventDao();
	
	
		public List<Event> viewAlleventDetails() {
			return bd.viewAllevent(); 
		}
		
		public List<Event> viewEventsForMember(int MID) {
			return bd.viewEventsForMember(MID);
		}
		
		public Event viewSpecificEvent(int EID) {
			return bd.viewSpecificEvent(EID);
		}
}