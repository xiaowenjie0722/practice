//模拟购物平台登录
package day05;

import java.util.Scanner;

public class gouwu{
   static gouwu gw=new gouwu();
   boolean pd=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		  if (gw.pd==false) {
			  System.out.println("@@您的输入有误，请重新输入@@");
		}
		  System.out.println("**********欢迎使用欢乐购物平台系统**********"); for(int i=0;i<14;i++)
		  { System.out.print(" "); } System.out.println("1.登录系统"); for(int
		  i=0;i<14;i++) { System.out.print(" "); } System.out.println("2.退出");
		  System.out.println("*******************************************");
		  System.out.print("请选择，输入数字：");
		  int num=sc.nextInt();
          if(num==1) { 
          gw.denglu();
		  }
          else if(num==2){ 
        	  gw.quit();
          }
          else {
          gw.pd=false; 
		  gw.main(null);
		 }
	}
	public void denglu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("**********欢迎使用欢乐购物平台系统**********");
		for(int i=0;i<14;i++) {
			System.out.print(" ");
		}
		System.out.println("1.登录系统");
		for(int i=0;i<14;i++) {
			System.out.print(" ");
		}
		System.out.println("2.退出");
		System.out.println("********************************");
		System.out.println("请选择，输入数字1");
		System.out.print("请输入用户名：");
		String user=sc.next();
		System.out.print("请输入密码：");
		String pass=sc.next();
		if(user.equals("admin") && pass.equals("123")) {
		gw.sec();	
		}
		else {
			System.out.println("@@您没有权限进入系统，请重新登录@@");
			gw.denglu();
		}
	}
	public void quit() {
		System.out.println("您已退出系统，欢迎下次光临！");
	}
	public void sec() {
		Scanner sc=new Scanner(System.in);
	System.out.println("*****系统主菜单，请选择您要的操作*****");
	System.out.println("*                  1.会员中心                   *");
	System.out.println("*                  2.进入购物                   *");
	System.out.println("*                  3.试试手气                   *");
	System.out.println("*************************************");
	System.out.print("请选择，输入数字");
	int num=sc.nextInt();
	if(num==3) {
		Qipai.main(null);
	}
	else if (num==2) {
		gw.gw();
	}
	else if(num==1){
		gw.huiyuan();
	}
	else {
		System.out.println("@@您的输入有误，请重新输入@@");
		gw.sec();
	}
	}
    public void huiyuan() {
    	Scanner sc=new Scanner(System.in);
		System.out.println("**********欢迎来到会员中心**********");
		System.out.println("\n\n      平台正在维护中，敬请期待");
		System.out.print("返回主菜单请按1：");
		int num=sc.nextInt();
		if (num==1) {
			gw.sec();
		}
		else {
			System.out.println("@@您的输入有误，请重新输入@@");
			gw.huiyuan();
		}
	}
    public void gw() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("**********欢迎来到购物中心**********");
		System.out.println("\n\n      平台正在维护中，敬请期待");
		System.out.print("返回主菜单请按1：");
		int num=sc.nextInt();
		if (num==1) {
			gw.sec();
		}
		else {
			System.out.println("@@您的输入有误，请重新输入@@");
			gw.gw();
		}
	}
}
