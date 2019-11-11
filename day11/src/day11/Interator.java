package day11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class Interator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Collection<String> collection=new ArrayList<>();
    collection.add("james");
    collection.add("ssss");
    collection.add("wwwww");
    //用迭代器取出集合元素
    Iterator<String> iterator=collection.iterator();
    //判断是否有下一位，有则输出
    while (iterator.hasNext()) {
		String eString=iterator.next();
		System.out.println(eString);
	}
    //增强for循环
    for(String str:collection) {
    	System.out.println(str);
    }
	}

}
