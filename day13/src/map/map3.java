/*三、请使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作。*/
package map;

import java.util.HashMap;
import java.util.Map;

public class map3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<Integer, String> map=new HashMap<Integer, String>();
     map.put(1,"dnsj" );
     map.put(2,"uuuu" );
     map.put(3,"xxjx" );
     map.remove(2);
     System.out.println(map);
     System.out.println(map.get(3));
	}
}
