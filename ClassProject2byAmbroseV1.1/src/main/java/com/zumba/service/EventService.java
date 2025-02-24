package com.zumba.service;

import java.util.List;

import com.zumba.bean.Event;
import com.zumba.dao.EventDao;

public class EventService {

// private EventDao ed = new EventDao();
	
	
		public List<Event> viewAlleventDetails() {EventDao ed = new EventDao();
			return ed.viewAllevent(); 
		}
		
		public List<Event> viewEventsForMember(int MID) {EventDao ed = new EventDao();
			return ed.viewEventsForMember(MID);
		}
		
		public Event viewSpecificEvent(int EID) {EventDao ed = new EventDao();
			return ed.viewSpecificEvent(EID);
		}
		
		public void addNewEvent(Event event) {EventDao ed = new EventDao();
			ed.addNewEvent(event);
		}

		
}