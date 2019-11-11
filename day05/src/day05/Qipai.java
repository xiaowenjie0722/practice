package day05;

import java.util.Random;
import java.util.Scanner;



public class Qipai {
   static Qipai qp=new Qipai();
   String p1;
   String p5;
   String p50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] pk=new String[52];
		int[] num={1,2,3,4,5,6,7,8,9,10,11,12,13};
		String[] design= {"方块","梅花","红桃","黑桃"};
		int k=0;
//做牌
for (int i = 0; i < 13; i++) {
	for(int j=0;j<4;j++) {
		pk[k]=design[j]+num[i];
		k++;
	}
}
//洗牌
Random rd=new Random();
for (int n = 0; n<52; n++) {
	int sj=rd.nextInt(52);
	String temp=pk[n];
	pk[n]=pk[sj];
	pk[sj]=temp;
}
//发牌
for (int m=0; m<52; m++) {
	if (m==4||m==0||m==49) {
		System.out.println("第"+(m+1)+"张牌是："+pk[m]);
	}
}
qp.p1=pk[0];
qp.p5=pk[4];
qp.p50=pk[49];
System.out.println("返回主菜单请按1：");
System.out.println("再来一把请按2：");
int num1=sc.nextInt();
if (num1==1) {
	gouwu.gw.sec();
}
else if (num1==2) {
	qp.main(null);
}
else {
	qp.re();
}
	}
	//输入有误重输入
	public void re() {
    Scanner sc=new Scanner(System.in);	
	System.out.println("第1张牌是："+qp.p1);
	System.out.println("第5张牌是："+qp.p5);	
	System.out.println("第50张牌是："+qp.p50);
	System.out.println("@@您的输入有误，请重新输入@@");
	System.out.println("返回主菜单请按1：");
	System.out.println("再来一把请按2：");
	int num1=sc.nextInt();
	if (num1==1) {
		gouwu.gw.sec();
	}
	else if (num1==2) {
	    qp.main(null);	
	}
	else {
		qp.re();
	}
	}
}
