/*��Ŀ���ж�һ�������Ǽ�λ�������������������*/
package day03;

import java.util.Scanner;

public class extra5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
Scanner num=new Scanner(System.in);
System.out.println("������һ��������");
i=num.nextInt();
for(int n=1;n>0;n++) {
if(i/(int)Math.pow(10,n-1)>=1&&i/(int)Math.pow(10,n)==0 ) {
	System.out.println("����"+n+"λ��");
}

	}}

}
