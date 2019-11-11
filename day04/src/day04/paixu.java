package day04;

import java.util.Scanner;

public class paixu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length-1;i++) {
			System.out.println("请输入第"+(i+1)+"个数：");
			a[i]=sc.nextInt();	
		}
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int b:a) {
			System.out.println(b);
		}
	}

}
