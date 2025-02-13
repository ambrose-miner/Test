package com.zumba.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zumba.bean.Member;
import com.zumba.bean.MemberEvent;
import com.zumba.dao.MemberDao;
import com.zumba.resource.DbConnection;

public class MemberService {

	
	MemberDao md = new MemberDao();

	
		public List<Member> viewAllMemberDetails() {
			return md.viewAllMember();	
		}
	
		public List<Member> viewAllMembersInEvent(int EID){
			return md.viewMembersInEvent(EID);
		}

}
