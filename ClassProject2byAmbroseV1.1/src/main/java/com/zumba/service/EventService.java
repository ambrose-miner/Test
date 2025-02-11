package com.zumba.service;

import java.util.List;

import com.zumba.bean.Event;
import com.zumba.dao.EventDao;

public class EventService {

	EventDao bd = new EventDao();
	
	
		public List<Event> viewAlleventDetails() {
			return bd.viewAllevent(); 
		}
		
		public List<Event> viewEventsForMember() {
			return bd.viewEventsForMember();
		}
		
		public Event viewSpecificEvent() {
			return bd.viewSpecificEvent();
		}
}