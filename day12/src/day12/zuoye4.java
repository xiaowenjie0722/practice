/*定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
 * 并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）*/
package day12;

import java.util.ArrayList;
import java.util.List;

public class zuoye4 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int j=0;
   List<Integer> num=new ArrayList<>();
   num.add(2);
   num.add(5);
   num.add(4);
   num.add(9);
   int[] numInt=new int[num.size()];
   for(int i:num) {
	  numInt[j]=i;
	  j+=1;
	}
   for (int i = 0; i < numInt.length; i++) {
	System.out.print(numInt[i]+" ");
}
  }
}
