package day04;

import java.util.Scanner;

public class max {
	public static void main(String[] args) {
		max sc=new max();
		
max.maximizing();	
}
	public static void maximizing() {
		int[] arr=new int[10];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("请输入第"+(i+1)+"个数");
			arr[i]=s.nextInt();
		}
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
		{max=arr[i];}	
		}
		System.out.println(max);	
	}
}
