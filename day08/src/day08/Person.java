/*1. ģ���ѧ����ϵͳʦ����Ϣ��
 2. ����Person�ࡣ
    1. ���ԣ�����������
    2. ���췽�����޲ι��췽�����вι��췽��
    3. ��Ա������getXxx������setXxx��������ʾ������ϢshowMsg����
 3. ����Teacher�࣬�̳�Person
    1. ���ԣ�ѧ��
    2. ���췽�����޲ι��췽�����вι��췽��
    3. ��Ա������getXxx������setXxx���������η���
 4. ����Student�࣬�̳�Person
    1. ���ԣ�����
    2. ���췽�����޲ι��췽�����вι��췽��
    3. ��Ա������getXxx������setXxx���������Է���*/


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
	System.out.println("������������");
	name=sc.next();
	System.out.println("���������䣺");
	age=sc.nextInt();
}
public void getXxx() {
	System.out.println("������"+name);
	System.out.println("���䣺"+age);
}
public void showMsg() {
	setXxx();
	getClass();
}
}
