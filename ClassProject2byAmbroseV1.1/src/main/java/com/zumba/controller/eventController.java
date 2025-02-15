package com.zumba.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zumba.bean.Event;
import com.zumba.bean.Member;
import com.zumba.service.EventService;


@WebServlet("/eventController")
public class eventController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public eventController() {
        super();
    }

    EventService es = new EventService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Event> listOfEvent = es.viewAlleventDetails();
		HttpSession hs = request.getSession();
		hs.setAttribute("Event", listOfEvent);
		response.sendRedirect("viewAllEvent.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userAction = request.getParameter("userAction");
		if (userAction == "viewSpecificEvent") {			//test == vs .=
			int EID = Integer.parseInt(request.getParameter("EID")); // will this need a throws exception or try catch??
			Event ie = es.viewSpecificEvent(EID);
			HttpSession hs = request.getSession();
			hs.setAttribute("Event", ie);
			response.sendRedirect("viewSpecificEvent.jsp");
		}else { 
			String day = request.getParameter("day");
			String time = request.getParameter("time");
			String location = request.getParameter("location");
			
			
			Event ep = new Event();
			ep.setDay("day");
			ep.setTime("time");
			ep.setLocation("location");
		}
		doGet(request, response);
	}

}