package day08;

import java.util.ArrayList;

public class testSUV extends SUV{
    
	public testSUV(String brand, int carlength, int price) {
		super(brand, carlength, price);
		// TODO Auto-generated constructor stub
	}
   
    
	public static void main(String[] args) {
		 SUV suv1=new SUV("SUV", 5555, 555555);
		 SUV suv2=new SUV("suv1", 2222, 222222);
		 SUV suv3=new SUV("suv2", 4555, 555555);
		 ArrayList<SUV> suv=new ArrayList<SUV>();
		 suv.add(suv1);
		 suv.add(suv2);
		 suv.add(suv3);
		 for (int i = 0; i < suv.size(); i++) {
			 //获取到集合中每个SUV对象
			 SUV s = suv.get(i);
			 //把每个Suv对象中的长度拿出来，与定义好的最大最小车型比较
			 s.judgment(s.carlength);
		}
		 
		 
	}
	/*
	 * public void pd() {
	 * 
	 * suv.get(1)=suv1;
	 * 
	 * }
	 */
}
