package day19;

import java.util.function.Predicate;

public class PredicateDemo {
public static void strLength(Predicate<String> predicate,Predicate<String> predicate1) {
	boolean flag=predicate.or(predicate1).test("�����ҿɾͱ������");
	System.out.println("�ַ�������������"+flag);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    strLength((a)->a.contains("��"),(a)->a.contains("��"));
	}

}
