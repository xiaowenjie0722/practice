package day08;

import java.util.Scanner;
public class Teacher extends Person {

	public Teacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
    String xueke;
    static Teacher tc=new Teacher("xxx", 15) { 	
    	
    };
   @Override
public void setXxx() {
	// TODO Auto-generated method stub
	super.setXxx();
	Scanner sc =new Scanner(System.in);
	 System.out.println("������ѧ�ƣ�");
 	xueke=sc.next();
}
@Override
public void getXxx() {
	// TODO Auto-generated method stub
	super.getXxx();
	System.out.println("ѧ�ƣ�"+xueke);
}
    public void jiangke() {
		System.out.println("����Ľ�");
	}
}
