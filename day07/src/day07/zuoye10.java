/*����findIndex��������ĳ�����У�����ĳԪ�أ����ص�һ�γ��ֵ�����������replace��������ĳ�����е�ĳԪ�أ�ȫ���滻Ϊ��Ԫ�ء�*/
package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class zuoye10 {
	ArrayList<String> arr=new ArrayList<String>();
	static zuoye10 zy=new zuoye10();
	String s="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   zy.arraylist();
   zy.findIndex(); 
   zy.replace();
	}
	public void arraylist() {
		   arr.add("a");
		    arr.add("e");
		    arr.add("c");
		    arr.add("d");
		    arr.add("e"); 
		    System.out.println(arr);
	}
   public void findIndex() {
	   Scanner sc=new Scanner(System.in);
	System.out.print("��������Ҫ���ҵ�Ԫ��:");
	String s=sc.next();
	System.out.print("����Ϊ:"+zy.arr.indexOf(s));
	System.out.println();
}
   public void replace() {
	   Scanner sc=new Scanner(System.in);
		System.out.print("��������Ҫ�滻��Ԫ��:"); String x=sc.next();
		System.out.print("��������Ҫ���ɵ�Ԫ��:"); String y=sc.next();
	    for(String i:arr) {
		  s=s+i;
	  }
	    s=s.replaceAll(x, y);
	    System.out.print(s);
}
}
