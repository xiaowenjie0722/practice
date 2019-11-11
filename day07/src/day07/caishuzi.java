package day07;

import java.util.Random;
import java.util.Scanner;

public class caishuzi {
    int sj;
    int num;
    int pd=0;
    static caishuzi ts=new caishuzi();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ts.suiji();
	}
	public void suiji() {
		Random rd=new Random();
		sj=rd.nextInt(100);
		input();
	}
	public void input() {
		if (pd==1) {
		System.out.println("大了");	
		}else if (pd==2) {
			System.out.println("小了");
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入：");
		num=sc.nextInt();
		guess();
	}
    public void guess() {
		
		
		if (num>sj) {
			pd=1;
			input();
		}
		else if (num<sj) {
			pd=2;
			input();
		}
		else {
			System.out.println("Bingo!");
		}
	}
}
