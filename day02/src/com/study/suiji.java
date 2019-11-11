package com.study;

import java.util.Scanner;

public class suiji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner num=new Scanner(System.in);
		System.out.println("请输入随机数的个数：");
		n=num.nextInt();
		for(int i=0;i<n;i++){
			System.out.print((int)(1+Math.random()*10)+" ");
			}
	}}
