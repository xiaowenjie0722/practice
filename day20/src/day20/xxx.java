package day20;

import java.util.ArrayList;

import org.junit.Test;

public class xxx {

	@Test
	public void test() {
		//��һ������ֻҪ����Ϊ3���ֵĳ�Ա������
		//��һ������ɸѡ֮��ֻҪǰ3���ˣ�  
		ArrayList<String> one = new ArrayList<>(); 
		one.add("�����Ȱ�"); 
		one.add("��Զ��"); 
		one.add("���Ǻ�"); 
		one.add("ʯ����"); 
		one.add("ʯ����"); 
		one.add("����"); 
		one.add("ׯ��"); 
		one.add("���߹�"); 
		//�ڶ�������ֻҪ���ŵĳ�Ա������
		//�ڶ�������ɸѡ֮��Ҫǰ2���ˣ�
		//����������ϲ�Ϊһ�����飻
		ArrayList<String> two = new ArrayList<>(); 
		two.add("��������"); 
		two.add("���޼�"); 
		two.add("����ӱ"); 
		two.add("������"); 
		two.add("�����˹����"); 
		two.add("���찮"); 
		two.add("�Ŷ���"); 
		
//		//System.out.println("----------��һ��-----------");
//		Stream<String> sa=one.stream().filter(a->a.length()==3).limit(3);
//		//sa.forEach(System.out::println);
//		//System.out.println("----------�ڶ���-----------");
//		Stream<String> sb=two.stream().filter(b->b.startsWith("��")).skip(2);
//		//sb.forEach(System.out::println);
//		//System.out.println("----------����ϲ�-----------");
//		Stream.concat(sa, sb).map(name->new Person(name))
//		.forEach(System.out::println);

	}

}
