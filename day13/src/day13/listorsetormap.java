package day13;


import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class listorsetormap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> set=new HashSet<>();
set.add("A");
set.add("A");
set.add("A");
System.out.println(set);
//接口set提供的静态方法
Set<String> set2=Set.of("1","2","5");
System.out.println(set2);
//接口map提供的静态方法
Map<String, String> map=Map.of("1","2","b","h");
System.out.println(map);
//list提供的方法
List<String> list= List.of("1","2","5");
System.out.println(list);

	}

}
