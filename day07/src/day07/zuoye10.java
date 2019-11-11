/*定义findIndex方法，在某集合中，查找某元素，返回第一次出现的索引，定义replace方法，将某集合中的某元素，全部替换为新元素。*/
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
	System.out.print("请输入你要查找的元素:");
	String s=sc.next();
	System.out.print("索引为:"+zy.arr.indexOf(s));
	System.out.println();
}
   public void replace() {
	   Scanner sc=new Scanner(System.in);
		System.out.print("请输入你要替换的元素:"); String x=sc.next();
		System.out.print("请输入你要换成的元素:"); String y=sc.next();
	    for(String i:arr) {
		  s=s+i;
	  }
	    s=s.replaceAll(x, y);
	    System.out.print(s);
}
}
