/*定义一个方法listTest(ArrayList<Integer> al, Integer s)，
 * 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。*/
package day12;

import java.util.ArrayList;

public class zuoye8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> al=new ArrayList<>();
	     al.add(2);
	     al.add(3);
	     al.add(4);
	     al.add(5);
	     al.add(6);
	     al.add(7);
	     System.out.println("s在al里面第一次出现的索引是:"+listTest(al,8));
	}
    public static int listTest(ArrayList<Integer > al,Integer s){
    	int num=-1;
    	for(int i:al) {
    		if (s==i) {
				num=al.indexOf(i);
			}
    	}
		return num;
		
	}
}
