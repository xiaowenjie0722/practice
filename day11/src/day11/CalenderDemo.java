package day11;

import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		Calendar.getInstance();
	// TODO Auto-generated method stub
      Calendar calendar=Calendar.getInstance();
      int year=calendar.get(Calendar.YEAR);
      int month=calendar.get(Calendar.MONTH)+1;
      int day=calendar.get(Calendar.DAY_OF_MONTH);
      System.out.println(year+"年"+month+"月"+day+"日");
      //修改年份为2020年
      calendar.set(Calendar.YEAR, 2020);
      int newyear=calendar.get(calendar.YEAR);
      System.out.println(newyear+"年"+month+"月"+day+"日");
	}

}
