/*定义ArrayList集合，存入多个字符串。删除长度大于5的字符串，打印删除后的集合。*/
package day07;

import java.util.ArrayList;

public class zuoye7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> arr=new ArrayList<String>();
     arr.add("abc");
     arr.add("abcd");
     arr.add("abcde");
     arr.add("abcdef");
     arr.add("abcds");
     for(String s:arr) {
    	if (s.length()>5) {
			arr.remove(s);
		} 
     }
     System.out.println(arr);
	}

}
