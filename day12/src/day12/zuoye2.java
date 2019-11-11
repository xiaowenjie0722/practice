/*给定以下代码，请定义方法listTest()统计集合中指定元素出现的次数，
 * 如"a": 2,"b": 2,"c" :1, "xxx":0。*/
package day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class zuoye2 {
String list;
String letter;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Collection<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		System.out.println("a:"+listTest(list, "a"));	
		System.out.println("b:"+listTest(list, "b"));	
		System.out.println("c:"+listTest(list, "c"));
		System.out.println("xxx:"+listTest(list, "xxx"));
		

	}
	public static int listTest(Collection<String> list, String letter) {
		int num=0;
		for (String str:list) {
			if (str.equals(letter)) {
				num+=1;
			}
		}
		return num;
	
	}

}
