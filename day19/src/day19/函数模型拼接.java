package day19;

import java.util.function.Function;

public class ����ģ��ƴ�� {
    public static void pingjie(Function<String, String> one,Function<String, Integer> two,Function<Integer, Integer> three) {
    	String str = "����ӱ,20"; 
    	one.andThen(two).andThen(three).apply(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pingjie((s)->s.split(",")[1], (s)->Integer.valueOf(s), (s)->s+=100);
		System.out.println();
	}

}
