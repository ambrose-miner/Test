package com.zumba.controller;

import java.io.IOException;
import java.util.List;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.zumba.bean.MemberEvent;
import com.zumba.bean.Member;
import com.zumba.bean.Event;
import com.zumba.service.MemberService;
import com.zumba.service.EventService;

@WebServlet("/memberController")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MemberController() {
        super();
    }
    
	
		private MemberService ms = new MemberService();
		private EventService es = new EventService();
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			List<Member> listOfMember = ms.viewAllMemberDetails();
			HttpSession hs = request.getSession();
			hs.setAttribute("listAllMember", listOfMember);
			response.sendRedirect("viewAllMember.jsp");
			response.getWriter().append("Served at: ").append(request.getContextPath());
			 
	}
		
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String userAction = request.getParameter("userAction");
			if (userAction .equals("viewSpecificMember")) {
				
			int MID = Integer.parseInt(request.getParameter("MID"));
			Member im = ms.viewSpecificMember(MID);
			HttpSession hs = request.getSession();
			hs.setAttribute("specificMember", im);
			List<Event> listOfEventForMember = es.viewEventsForMember(MID);
			hs.setAttribute("listOfEvent", listOfEventForMember);
			response.sendRedirect("viewSpecificMember.jsp");
			
			}else if  (userAction .equals("addMember")) {
				
			
				String memberF_name = request.getParameter("f_name");
				String memberL_name = request.getParameter("l_name");
				String memberEmail = request.getParameter("email");
				
				Member nm = new Member();
				nm.setF_name(memberF_name);
				nm.setL_name(memberL_name);
				nm.setEmail(memberEmail);
				ms.addNewMember(nm);
				
				doGet(request, response);
			}else {
			
		
			doGet(request, response);
			}
		}
}
