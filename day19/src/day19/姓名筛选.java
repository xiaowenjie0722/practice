package day19;

import java.util.function.Predicate;

public class ����ɸѡ {
    public static void shaixuan(Predicate<String> name,Predicate<String> sex) {
    	String[] array = { "�����Ȱ�,Ů", "��������,Ů", "�������,��", "����ӱ,Ů" }; 
    	for(String str:array) {
    		boolean pd=name.and(sex).test(str);
    		if (pd==true) {
				System.out.println(str.substring(0,str.indexOf(","))+" "+str.substring(str.indexOf(",")+1,str.length()));
			}
    	}
	}
	public static void main(String[] args) {
	shaixuan((a)->a.indexOf(",")>=4, (b)->b.substring(b.indexOf(",")+1,b.length()).equals("Ů"));
	}

}
