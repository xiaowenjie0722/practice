package day19;

import java.util.function.Predicate;

public class PredicateDemo {
public static void strLength(Predicate<String> predicate,Predicate<String> predicate1) {
	boolean flag=predicate.or(predicate1).test("就那我可就必须今晚");
	System.out.println("字符串包含我晚吗："+flag);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    strLength((a)->a.contains("我"),(a)->a.contains("晚"));
	}

}
