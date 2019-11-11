package day20;

import java.util.ArrayList;

import org.junit.Test;

public class xxx {

	@Test
	public void test() {
		//第一个队伍只要名字为3个字的成员姓名；
		//第一个队伍筛选之后只要前3个人；  
		ArrayList<String> one = new ArrayList<>(); 
		one.add("迪丽热巴"); 
		one.add("宋远桥"); 
		one.add("苏星河"); 
		one.add("石破天"); 
		one.add("石中玉"); 
		one.add("老子"); 
		one.add("庄子"); 
		one.add("洪七公"); 
		//第二个队伍只要姓张的成员姓名；
		//第二个队伍筛选之后不要前2个人；
		//将两个队伍合并为一个队伍；
		ArrayList<String> two = new ArrayList<>(); 
		two.add("古力娜扎"); 
		two.add("张无忌"); 
		two.add("赵丽颖"); 
		two.add("张三丰"); 
		two.add("尼古拉斯赵四"); 
		two.add("张天爱"); 
		two.add("张二狗"); 
		
//		//System.out.println("----------第一组-----------");
//		Stream<String> sa=one.stream().filter(a->a.length()==3).limit(3);
//		//sa.forEach(System.out::println);
//		//System.out.println("----------第二组-----------");
//		Stream<String> sb=two.stream().filter(b->b.startsWith("张")).skip(2);
//		//sb.forEach(System.out::println);
//		//System.out.println("----------两组合并-----------");
//		Stream.concat(sa, sb).map(name->new Person(name))
//		.forEach(System.out::println);

	}

}
