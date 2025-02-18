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
import com.zumba.service.MemberService;

//TODO:rename with capitals
@WebServlet("/eventController")
public class eventController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public eventController() {
        super();
    }
    MemberService ms = new MemberService();
    EventService es = new EventService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Event> listOfEvent = es.viewAlleventDetails();
		HttpSession hs = request.getSession();
		hs.setAttribute("Event", listOfEvent);
		response.sendRedirect("viewAllEvent.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userAction = request.getParameter("userAction");
		if 
			(userAction == "viewSpecificEvent") {			//test == vs .=
			int EID = Integer.parseInt(request.getParameter("EID")); // will this need a throws exception or try catch??
			Event ie = es.viewSpecificEvent(EID);
			HttpSession hs = request.getSession();
			hs.setAttribute("Event", ie);
			List<Member> listOfMemberInEvent = ms.viewAllMembersInEvent(EID);
			hs.setAttribute("Member", listOfMemberInEvent);
			response.sendRedirect("viewSpecificEvent.jsp");
		}else if
			(userAction == "addEvent") {
			
			
			String eventDay = request.getParameter("day");
			String eventTime = request.getParameter("time");
			String eventLocation = request.getParameter("location");
				
			Event ne = new Event();
			ne.setDay(eventDay);
			ne.setTime(eventTime);
			ne.setLocation(eventLocation);
			es.addNewEvent(ne);
			
			doGet(request, response);
		}else { //left for Expansion
			
			doGet(request, response);//left for Expansion
		}
		
	}

}