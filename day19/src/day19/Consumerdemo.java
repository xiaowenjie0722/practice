package day19;

import java.util.function.Consumer;

public class Consumerdemo {
public static void consumer(Consumer<String> difent,Consumer<String> input) {
	difent.andThen(input).accept("xxx");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] array = { "�����Ȱ�,Ů", "��������,Ů", "�������,��" }; 
	for(String str:array) {
		int num=str.indexOf(",");
		String name=str.substring(0, num);
		String sex=str.substring(num+1, str.length());
		 consumer((a)->{
			 a=name;
			 System.out.print("������"+a+" ");
		 }, (b)->{
			 b=sex;
			 System.out.print("�Ա�"+b+" ");
		 });
		 System.out.println();
	}
   
	}

}
