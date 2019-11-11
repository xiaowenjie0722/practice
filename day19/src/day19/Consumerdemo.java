package day19;

import java.util.function.Consumer;

public class Consumerdemo {
public static void consumer(Consumer<String> difent,Consumer<String> input) {
	difent.andThen(input).accept("xxx");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" }; 
	for(String str:array) {
		int num=str.indexOf(",");
		String name=str.substring(0, num);
		String sex=str.substring(num+1, str.length());
		 consumer((a)->{
			 a=name;
			 System.out.print("姓名："+a+" ");
		 }, (b)->{
			 b=sex;
			 System.out.print("性别："+b+" ");
		 });
		 System.out.println();
	}
   
	}

}
