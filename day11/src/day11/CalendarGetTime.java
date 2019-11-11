package day11;

import java.util.Calendar;
import java.util.Date;

public class CalendarGetTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getTime()  返回日期类型
		Calendar calendar=Calendar.getInstance();
		Date time=calendar.getTime();
		System.out.println(time);
	}

}
