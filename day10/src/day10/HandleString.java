package day10;

import java.util.Scanner;

public class HandleString implements HandleAble{
	String num;
	@Override
	public void HandleString(String num) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("1:取整数部分");
		System.out.println("2:保留指定位小数，四舍五入");
		System.out.println("please choose the idea:");
		int c1=sc.nextInt();
		int x=num.indexOf(".");
		if (c1==1) {
			System.out.println(num.substring(0,x));
		}
		else if (c1==2) {
			System.out.println("请输入要保留几位小数：");
			
			int c2=sc.nextInt();
			String str1=num.substring(0, x);
			String str2=num.substring(x+1, x+c2+1);
			if (c2==num.length()-str1.length()-1) {
				System.out.println(num.substring(0, x+c2+1));
			}else {
				String str3=num.substring(x+c2+1, x+c2+2);
				int c3=Integer.valueOf(str1).intValue(); 
				int c4=Integer.valueOf(str2).intValue();
				int c5=Integer.valueOf(str3).intValue();
				
			    if (c5<5&&c5>=0) {
					System.out.println(c3+"."+c4);
				}
				else if(c5>=5&&c5<10){
			
				System.out.println(c3+"."+(c4+1));
				}
			}
		}	
	}
}

