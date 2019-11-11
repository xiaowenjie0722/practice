/*用程序判断2018年2月14日是星期几*/
package day11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class zuoye7 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
String dateString="2018年2月14日";
SimpleDateFormat sFormat=new SimpleDateFormat("yyyy年MM月dd日");
Date date=sFormat.parse(dateString);
Calendar calendar=Calendar.getInstance();
calendar.setTime(date);
int week=calendar.get(Calendar.DAY_OF_WEEK);
System.out.println(dateString+"是星期"+week);
	}

}
