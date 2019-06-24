package basicAPI;

import java.util.*;

public class CalendarEx {

	public static void main(String[] args) {
		
		// calendar 객체를 만드는 법
		Calendar now = Calendar.getInstance();
		
		TimeZone tz = now.getTimeZone();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int dayMonth = now.get(Calendar.DAY_OF_MONTH);
		int dayWeek = now.get(Calendar.DAY_OF_WEEK);
		int amPm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(tz);
		System.out.println(year);
		System.out.println(month + 1);	// month = 0, 1, 2...
		System.out.println(dayMonth);
		System.out.println(dayWeek);
		System.out.println(amPm);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);		
	}
}
