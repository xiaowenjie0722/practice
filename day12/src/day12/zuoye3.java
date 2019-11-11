/*定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。*/
package day12;

import java.util.ArrayList;

public class zuoye3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] num= {1,2,3,4};
     ArrayList<Integer> arr=new ArrayList<Integer>();
     for (int i = 0; i < num.length; i++) {
		arr.add(num[i]);
	}
    
    	 System.out.println(arr);
    
	}

}
