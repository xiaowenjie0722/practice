package day07;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> students=new ArrayList<String>();
     Scanner sc=new Scanner(System.in);
     for (int i = 0; i < 3; i++) {
    	 String s=sc.next();
		students.add(s);
	}
     students.add("����");
     students.add("����");
     students.add(1,"����");
     students.set(0, "����");
     System.out.println(students);
     students.remove(0);
     System.out.println(students);
     System.out.println(students.size());
     System.out.println(students.get(1));
	}
        
}
