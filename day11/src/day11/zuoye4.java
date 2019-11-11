/*获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08。*/
package day11;

import java.text.SimpleDateFormat;
import java.util.Date;


public class zuoye4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date date=new Date();
SimpleDateFormat sFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String time=sFormat.format(date);
System.out.println(time);
}

}
