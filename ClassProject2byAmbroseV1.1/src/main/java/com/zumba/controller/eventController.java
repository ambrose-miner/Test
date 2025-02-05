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

import com.zumba.bean.event;
import com.zumba.service.eventService;

/**
 * Servlet implementation class BatchController
 */
@WebServlet("/eventController")
public class eventController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public eventController() {
        super();
        // TODO Auto-generated constructor stub
    }

    eventService bs = new eventService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<event> listOfevent = bs.viewAlleventDetails();
		HttpSession hs = request.getSession();
		hs.setAttribute("event", listOfevent);
		response.sendRedirect("viewevent.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}