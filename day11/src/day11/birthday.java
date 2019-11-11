package day11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class birthday {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String bornBirth="2000年8月8日";
		//字符串转date类型
		SimpleDateFormat format=new SimpleDateFormat("yyyy年MM月dd日");
		Date birthDate=format.parse(bornBirth);
		//当前日期
      Date date=new Date();
      //获取出生与当前的毫秒数并将毫秒数转化为天数
   long secone= date.getTime()-birthDate.getTime();
   System.out.println(secone/1000/60/24);
   
}
}