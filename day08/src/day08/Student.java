package day08;

import java.util.Scanner;

public class Student extends Person {

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
    int score;
   static Student st=new Student("xax", 12) {
};
@Override
public void setXxx() {
	// TODO Auto-generated method stub
	super.setXxx();
	Scanner sc =new Scanner(System.in);
	System.out.println("�����������");
	score=sc.nextInt();
}
@Override
public void getXxx() {
	// TODO Auto-generated method stub
	super.getXxx();
	System.out.println("�����ǣ�"+score);
}
public void test() {
	System.out.println("��");
}
}
