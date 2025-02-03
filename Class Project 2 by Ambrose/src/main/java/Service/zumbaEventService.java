import bean.zumbaMember;
import bean.zumbaEvent;
import dao.zumbaEventsDao;
import dao.zumbaMembersDao;

import Service.zumbaMembersService;

public class zumbaMemberService {
	zumbaEventsDao ZEDao = new zumbaEventsDao();
	zumbaEventService ZEServ = new zumbaEventService();

	public String Schedual(zumbaEvent SchedualEvent) {
		
		String output="";
		
		zumbaEvent SchedualEvent = new zumbaEvent();
		
		SchedualEvent.setday(SchedualEvent.getday());
		SchedualEvent.settime(SchedualEvent.gettime());
		SchedualEvent.setlocation(SchedualEvent.getlocation());
		output = ZEDao.Schedual(SchedualEvent);
		

	}
}
