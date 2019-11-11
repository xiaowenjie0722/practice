/*五、请使用Map集合存储自定义数据类型Car做键，对应的价格做值。并使用keySet和entrySet两种方式遍历Map集合。*/
package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<String, Integer> map=new HashMap<String, Integer>();
     map.put("奔驰",1000000 );
     map.put("宝马",900000 );
     map.put("大众",120000 );
     map.put("雪弗兰",89000 );
     map.put("五菱宏光",35000 );
  for(String str:map.keySet()) {
	  System.out.print(str+" ");
  }
  System.out.println();
   for(Entry<String, Integer> str:map.entrySet())
    System.out.println(str);
	}

}
