package Service;

import bean.zumbaMember;
import bean.zumbaEvent;
import dao.zumbaEventsDao;
import dao.zumbaMembersDao;

import Service.zumbaEventsService;

public class zumbaMemberService {
	zumbaMembersDao ZMDao = new zumbaMembersDao();
	zumbaEventService ZEServ = new zumbaEventService();

	public String Join(zumbaMember joinMember) {
		
		String output="";
		
		zumbaMember joinMember = new zumbaMember();
		
		joinMember.setname(joinMember.getname());
		joinMember.setemail(joinMember.getemail());
		output = ZMDao.join(joinMember);

	}
	public String Edit(zumbaMember EditMember) {
		
		zumbaMember EditMember = new zumbaMember();
		EditMember.setday(EditMember.getname());
		EditMember.settime(EditMember.getemail());
		
		output = ZMDao.Edit(EditMember);
	}
	
}
