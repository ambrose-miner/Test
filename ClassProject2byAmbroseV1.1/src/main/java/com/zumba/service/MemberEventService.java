package com.zumba.service;
import com.zumba.dao.MemberEventDao;
import com.zumba.bean.Member;
import com.zumba.bean.MemberEvent;

public class MemberEventService {
	MemberEventDao med = new MemberEventDao();
	
	
	
	public void addMemberToEvent(Member memberEvent) {
		med.addMemberToEvent(memberEvent);
	}
}
