/* 1. 模拟农学院动物医疗系统信息。
  2. 定义抽象家禽类(Poultry)
      1. 私有成员变量：动物种类(name)，症状(symptom)，年龄(age)， 病因（illness）
      2. 提供空参和带参构造方法
      3. 成员方法：
          1. 抽象方法症状(showSymptom)
          2. 普通方法基本信息(showMsg)
          3. 提供setXxx和getXxx方法
  3. 定义普通鸭子类(Duck)
      1. 提供空参和带参构造方法
      2. 重写showSymptom方法，打印症状信息。
*/
package day08;

import java.util.Scanner;

public abstract class Poultry {
private String name;
private String symptom;
private int age;
private String illness;
public Poultry(String name,String symptom,int age,String illness) {
	this.name=name;
	this.symptom=symptom;
	this.age=age;
	this.illness=illness;
}

public abstract void showSymptom();
public void showMsg() {
	setXxx();
	getXxx();
}
public void setXxx() {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入动物种类:");
	name=sc.next();
	System.out.println("请输入症状:");
	symptom=sc.nextLine();
	System.out.println("请输入年龄:");
	age=sc.nextInt();
	System.out.println("请输入病因:");
	illness=sc.nextLine();
}
public void getXxx() {
	System.out.println("动物种类:"+name);
	System.out.println("症状:"+symptom);
	System.out.println("年龄:"+age);
	System.out.println("病因:"+illness);
	
}
}
