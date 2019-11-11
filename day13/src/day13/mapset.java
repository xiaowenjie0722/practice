package day13;

import java.util.HashMap;
import java.util.Map;

public class mapset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aahhbax";
		int j=1;
 Map<Character, Integer> map=new HashMap<>();

 for (int i = 0; i < str.length(); i++) {
	char s=str.charAt(i);
	//判断是否第一次出现
	if (!map.containsKey(s)) {
		map.put(s, 1);
	}
	else {
		Integer num=map.get(s);
		map.put(s, ++num);
	}
}
 System.out.println(map);
 
 }

}
