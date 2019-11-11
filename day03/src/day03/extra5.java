/*题目：判断一个整数是几位数，并按照逆序输出。*/
package day03;

import java.util.Scanner;

public class extra5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
Scanner num=new Scanner(System.in);
System.out.println("请输入一个整数：");
i=num.nextInt();
for(int n=1;n>0;n++) {
if(i/(int)Math.pow(10,n-1)>=1&&i/(int)Math.pow(10,n)==0 ) {
	System.out.println("这是"+n+"位数");
}

	}}

}
