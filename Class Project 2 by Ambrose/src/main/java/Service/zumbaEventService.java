import bean.zumbaEvent;
import bean.zumbaMember;
import dao.zumbaEventsDao;
import dao.zumbaMembersDao;

import Service.zumbaMemberService;

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
		public String Reschedule(zumbaEvent RescheduleEvent) {
	
			zumbaEvent RescheduleEvent = new zumbaEvent();
			RescheduleEvent.setday(RescheduleEvent.getday());
			RescheduleEvent.settime(RescheduleEvent.gettime());
			RescheduleEvent.setlocation(RescheduleEvent.getlocation());
			output = ZEDao.Reschedule(RescheduleEvent);
		}
	
	
}
