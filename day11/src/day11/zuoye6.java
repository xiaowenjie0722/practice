/*使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日*/
package day11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class zuoye6 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
String time="2018-03-04";
SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd");
Date date=sDateFormat.parse(time);
System.out.println(date);
	}

}
