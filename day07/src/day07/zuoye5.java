/*字符串查找。键盘录入一个大字符串，再录入一个小字符串，统计小字符串在大字符串中出现的次数。*/
package day07;

import java.util.Scanner;

public class zuoye5 {
	int num=0;
	static zuoye5 zy=new zuoye5();
	public static void main(String[] args) {
		zy.zifu();
	}
public void zifu() {
	Scanner sc=new Scanner(System.in);
	
	System.out.print("输入大字符串:");
	String big=sc.next();
	System.out.print("输入小字符串:");
	String small=sc.next();
	for (int i = 0; i < big.length()-small.length()+1; i++) {
		if (small.equals(big.substring(i, i+small.length()))) {
			num++;
		}
	}
	System.out.println("小字符串在大字符串中出现"+num+"次");
}
}
