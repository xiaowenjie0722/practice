package day11;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Collection<String> collection=new ArrayList<>();
       collection.add("xxx");
       collection.add("zzz");
       collection.add("xbb");
       System.out.println(collection);
       //判断集合中是否有某个元素
       System.out.println(collection.contains("xxx"));
       //删除集合中某个元素
       System.out.println(collection.remove("xxx"));
       //删除后显示集合
       System.out.println(collection);
       //集合中的元素个数
       System.out.println(collection.size());
       //转化为object数组
       Object[] objects=collection.toArray();
       //遍历数组
       for (int i = 0; i < objects.length; i++) {
		System.out.println(objects[i]);
	}
       //清空集合
       collection.clear();
       System.out.println(collection);
       //判断是否为空
       System.out.println(collection.isEmpty());
       
	}

}
