package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;;

public class Collectiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list=new ArrayList<>();
list.add(8);
list.add(5);
list.add(9);
list.add(8);
list.add(10);
//采用collection工具类进行排序,默认升序排列
Collections.sort(list);
System.out.println(list);
//降序排列,利用重写comparator进行降序
Collections.sort(list, new Comparator<Integer>() {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
});
System.out.println(list);
	}

}
