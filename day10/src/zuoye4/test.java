package zuoye4;

import java.util.ArrayList;
import java.util.Scanner;

public class test extends Compare{
	 Work wk=new Work(); 
	 Apple a1=new Apple(5, "青色");
	 Apple a2=new Apple(3, "红色");
	@Override
	public void compare() {
		// TODO Auto-generated method stub
		if (a1.size>a2.size) {
			System.out.println("大小："+a1.size+" 颜色："+a1.color);
		}
		else {
			System.out.println("大小："+a2.size+" 颜色："+a2.color);
		}
	}
	class byColor{
		public void Color() {
			boolean pd=false;
			Scanner sc=new Scanner(System.in);
			System.out.print("请输入你想要的苹果的颜色：");
			String colorString=sc.next();
			ArrayList<Apple> arr=new ArrayList<Apple>();
			arr.add(a1);
			arr.add(a2);
			for (int i = 0; i < arr.size(); i++) {
				if (colorString.equals(arr.get(i).color)) {
					pd=true;
					System.out.println("a"+(i+1));
					break;
				}
			}
			if (pd==false) {
				System.out.println("抱歉，没有此颜色苹果");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test ts=new test();
		ts.compare();
		 
		 
		
		
	}

}
