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


@WebServlet("/memberController")
public class memberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public memberController() {
        super();
    }
    
	
		MemberService ms = new MemberService();
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			List<Member> listOfMember = ms.viewAllMemberDetails();
			HttpSession hs = request.getSession();
			hs.setAttribute("Member", listOfMember);
			response.sendRedirect("viewAllMember.jsp");
			response.getWriter().append("Served at: ").append(request.getContextPath());
			 
	}
		
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String userAction = request.getParameter("userAction");
			int EID = Integer.parseInt(request.getParameter("EID"));
			List<Member> listOfMemberInEvent = ms.viewAllMembersInEvent(EID);
			HttpSession hs = request.getSession();
			hs.setAttribute("Member", listOfMemberInEvent);
			response.sendRedirect("viewSpecificEvent.jsp");
			
			if  (userAction == "addMember") {
				hs.setAttribute("Member", ms);
			
				String day = request.getParameter("f_name");
				String time = request.getParameter("l_name");
				String location = request.getParameter("email");
				
				Member ne = new Member();
				ne.setF_name("f_name");
				ne.setL_name("l_name");
				ne.setEmail("email");
			}else {
			
		
		doGet(request, response);
	}

}
