/*定义一个方法listTest(ArrayList<String> al, String s),
 * 要求使用contains()方法判断al集合里面是否包含s。*/
package day12;

import java.util.ArrayList;
import java.util.List;

public class zuoye5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> al=new ArrayList<>();
     al.add("a");
     al.add("f");
     al.add("b");
     al.add("n");
     al.add("s");
     al.add("m");
    System.out.println("集合中是否有“s”? "+listTest( al, "s"));
  //System.out.print(al.contains("s"));
 
     
	}
	public static boolean listTest(ArrayList<String> al, String s) {
		boolean pd = false;
		
		for(String str:al) {
		 pd=str.contains(s);
		
		 if (pd==true) {
			break;
		}
		}
		return pd;
		
	}
    
}
