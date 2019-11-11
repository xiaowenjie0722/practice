/*1. 模拟教学管理系统师生信息。
 2. 定义Person类。
    1. 属性：姓名、年龄
    2. 构造方法：无参构造方法，有参构造方法
    3. 成员方法：getXxx方法，setXxx方法，显示基本信息showMsg方法
 3. 定义Teacher类，继承Person
    1. 属性：学科
    2. 构造方法：无参构造方法，有参构造方法
    3. 成员方法：getXxx方法，setXxx方法，讲课方法
 4. 定义Student类，继承Person
    1. 属性：分数
    2. 构造方法：无参构造方法，有参构造方法
    3. 成员方法：getXxx方法，setXxx方法，考试方法*/


package day08;

import java.util.Scanner;

public class Person {
String name;
int age;
public Person(String name,int age){
	this.name=name;
	this.age=age;
}
public void setXxx() {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入姓名：");
	name=sc.next();
	System.out.println("请输入年龄：");
	age=sc.nextInt();
}
public void getXxx() {
	System.out.println("姓名："+name);
	System.out.println("年龄："+age);
}
public void showMsg() {
	setXxx();
	getClass();
}
}
