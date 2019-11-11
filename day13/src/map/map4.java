/*四、往一个Map集合中添加若干元素。获取Map中的所有value，并使用增强for和迭代器遍历输出每个value。*/
package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer, String> map=new HashMap<Integer, String>();
	     map.put(1,"dnsj" );
	     map.put(2,"uuuu" );
	     map.put(3,"xxjx" );
	     System.out.println(map.values());
	     for(String str:map.values()) {
	    	 System.out.println(str);
	     }
	    Iterator<String> iterator=map.values().iterator();
	    while (iterator.hasNext()) {
			String str=iterator.next();
			System.out.println(str);
			
		}
	}

}
