package day11;

import java.util.Calendar;

public class CalendarAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Calendar calendar=Calendar.getInstance();
	      int year=calendar.get(Calendar.YEAR);
	      int month=calendar.get(Calendar.MONTH)+1;
	      int day=calendar.get(Calendar.DAY_OF_MONTH);
	      System.out.println(year+"年"+month+"月"+day+"日");
	      //给日期加3天
	      calendar.add(Calendar.DAY_OF_MONTH, 2);
	      //给年份减1年
	      calendar.add(Calendar.YEAR, -1);
	    
	      System.out.println(calendar.get(Calendar.YEAR)+"年"+month+"月"+calendar.get(Calendar.DAY_OF_MONTH)+"日");
	}

}
