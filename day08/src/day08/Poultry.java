/* 1. ģ��ũѧԺ����ҽ��ϵͳ��Ϣ��
  2. ������������(Poultry)
      1. ˽�г�Ա��������������(name)��֢״(symptom)������(age)�� ����illness��
      2. �ṩ�ղκʹ��ι��췽��
      3. ��Ա������
          1. ���󷽷�֢״(showSymptom)
          2. ��ͨ����������Ϣ(showMsg)
          3. �ṩsetXxx��getXxx����
  3. ������ͨѼ����(Duck)
      1. �ṩ�ղκʹ��ι��췽��
      2. ��дshowSymptom��������ӡ֢״��Ϣ��
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
	System.out.println("�����붯������:");
	name=sc.next();
	System.out.println("������֢״:");
	symptom=sc.nextLine();
	System.out.println("����������:");
	age=sc.nextInt();
	System.out.println("�����벡��:");
	illness=sc.nextLine();
}
public void getXxx() {
	System.out.println("��������:"+name);
	System.out.println("֢״:"+symptom);
	System.out.println("����:"+age);
	System.out.println("����:"+illness);
	
}
}
