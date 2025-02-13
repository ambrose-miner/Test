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
			response.getWriter().append("Served at: ").append(request.getContextPath()); //What does this line do???
			
			List<Member> listOfMemberInEvent = ms.viewAllMembersInEvent(int EID); // Why does it not like this parameter???
			hs.setAttribute("Member", listOfMemberInEvent);
			response.sendRedirect("viewSpecificEvent.jsp"); // do I need to do more to get this to also show the Event details?
															// its already getting the EID
	}
		
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter pw = response.getWriter(); 
			String f_name = request.getParameter("f_name");
			String l_name = request.getParameter("l_name");
			String email = request.getParameter("email");
		
		doGet(request, response);
	}

}
