/*�ַ������ҡ�����¼��һ�����ַ�������¼��һ��С�ַ�����ͳ��С�ַ����ڴ��ַ����г��ֵĴ�����*/
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
	
	System.out.print("������ַ���:");
	String big=sc.next();
	System.out.print("����С�ַ���:");
	String small=sc.next();
	for (int i = 0; i < big.length()-small.length()+1; i++) {
		if (small.equals(big.substring(i, i+small.length()))) {
			num++;
		}
	}
	System.out.println("С�ַ����ڴ��ַ����г���"+num+"��");
}
}
