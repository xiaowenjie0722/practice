package day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Generic {

	public static void main(String[] args) {
		//创建一个集合，子类实现
     Collection<String> collection=new ArrayList<>();
     collection.add("老铁");
     collection.add("双击");
     collection.add("没毛病");
     //迭代器迭代对象
     Iterator iterator=collection.iterator();
     while (iterator.hasNext()) {
			/* Object object=iterator.next(); */
    	 String str=(String) iterator.next();
		System.out.println(str);
		
	}
	}

}
