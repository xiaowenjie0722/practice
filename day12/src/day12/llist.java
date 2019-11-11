/*向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫。*/
package day12;

import java.util.ArrayList;
import java.util.List;

public class llist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> list=new ArrayList<>();
     list.add("张三");
     list.add("李四");
     list.add("王五");
     list.add("二丫");
     list.add("钱六");
     list.add("孙七");
     for(String str:list) {
    	 System.out.print(str+" ");
     }
     System.out.println();
     int num=list.indexOf("二丫");
     list.set(num, "王小丫");
     for(String str:list) {
    	 System.out.print(str+" ");
     }
     	}

}
