package com.study;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char c1,c2,c3;
Scanner cr=new Scanner(System.in);
System.out.println("��һ���ַ���");
c1=cr.next().charAt(0);
System.out.println("�ڶ����ַ���");
c2=cr.next().charAt(0);
System.out.println("�������ַ���");
c3=cr.next().charAt(0);
int x=(int)(c1+c2+c3);
System.out.println("���Ϊ��"+x);
	}

}
