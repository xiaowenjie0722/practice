/*定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。*/
package day12;

import java.util.ArrayList;

public class zuoye6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> al=new ArrayList<>();
	     al.add("a");
	     al.add("f");
	     al.add("b");
	     al.add("n");
	     al.add("m");
	     al.add("s");
	     System.out.println("al里面是否有元素?"+listTest(al));
	}
    public static boolean listTest(ArrayList<String> al) {
		boolean pd=false;
    	for(String str:al) {
			pd=!str.isEmpty();
		}
    	return pd;
	}
}
