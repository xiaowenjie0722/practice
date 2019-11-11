/*二、ArrayList集合中有如下内容： {33,11,77,55}，使用Collections.sort()对
 * ArrayList集合中的数据进行排序，并打印出排序后的结果。*/
package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class collections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> num=new ArrayList<>();
num.add(33);
num.add(11);
num.add(77);
num.add(55);
Collections.sort(num);
System.out.print("升序为:");
for(int i:num)
System.out.print(i+" ");
System.out.println();
Collections.sort(num, new Comparator<Integer>() {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
});
System.out.print("降序为:");
for(int i:num) {
	System.out.print(i+" ");
}
	}

}
