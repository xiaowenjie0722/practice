/*使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"。
 * 使用迭代器和增强for循环遍历LinkedHashSet。*/
package day12;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedHashSet<String> lHashSet=new LinkedHashSet<>();
  lHashSet.add("王昭君");
  lHashSet.add("王昭君");
  lHashSet.add("西施");
  lHashSet.add("杨玉环");
  lHashSet.add("貂蝉");
  //使用增强for循环
		 for(String str2:lHashSet) {
			 System.out.print(str2+" "); 
		}
		 System.out.println();
  //使用迭代器
 Iterator<String> iterator=lHashSet.iterator();
  while (iterator.hasNext()) {
	  String str1=iterator.next();
	System.out.print(str1+" ");
	}	
}
}
