package com.zumba.service;

import java.util.List;

import com.zumba.bean.event;
import com.zumba.dao.eventDao;

public class eventService {

	eventDao bd = new eventDao();
	
	
	public List<event> viewAlleventDetails() {
		return bd.viewAllevent();	// after retrieve if need any business logic we can apply and return 
	}
}