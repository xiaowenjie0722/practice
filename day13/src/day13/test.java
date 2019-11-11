package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class test {
   String name;
   int age;
	public test(String name, int age) {
	super();
	this.name = name;
	this.age = age;
	
}

	@Override
	public String toString() {
		return "test [name=" + name + ", age=" + age + "]";
	}

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
     test ts1=new test("nna", 18);
     test ts2=new test("www", 25);
     test ts3=new test("llb", 13);
     List<test> stu=new LinkedList<test>();
     stu.add(ts1);
     stu.add(ts2);
     stu.add(ts3);
     Collections.sort(stu,new Comparator<test>() {

		@Override
		public int compare(test o1, test o2) {
			
			return o1.age - o2.age;
		}
    	 
     });
     for(test str:stu){
     System.out.println(str);
    
     }
     
	}

}
