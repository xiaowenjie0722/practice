//链式编程
//Stream流
package day20;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list=new ArrayList<String>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.stream().filter(s->s.startsWith("张"))
        .filter(s->s.length()==3).forEach(System.out::println);
	}

}
