//ģ�⹺��ƽ̨��¼
package day05;

import java.util.Scanner;

public class gouwu{
   static gouwu gw=new gouwu();
   boolean pd=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		  if (gw.pd==false) {
			  System.out.println("@@����������������������@@");
		}
		  System.out.println("**********��ӭʹ�û��ֹ���ƽ̨ϵͳ**********"); for(int i=0;i<14;i++)
		  { System.out.print(" "); } System.out.println("1.��¼ϵͳ"); for(int
		  i=0;i<14;i++) { System.out.print(" "); } System.out.println("2.�˳�");
		  System.out.println("*******************************************");
		  System.out.print("��ѡ���������֣�");
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
		System.out.println("**********��ӭʹ�û��ֹ���ƽ̨ϵͳ**********");
		for(int i=0;i<14;i++) {
			System.out.print(" ");
		}
		System.out.println("1.��¼ϵͳ");
		for(int i=0;i<14;i++) {
			System.out.print(" ");
		}
		System.out.println("2.�˳�");
		System.out.println("********************************");
		System.out.println("��ѡ����������1");
		System.out.print("�������û�����");
		String user=sc.next();
		System.out.print("���������룺");
		String pass=sc.next();
		if(user.equals("admin") && pass.equals("123")) {
		gw.sec();	
		}
		else {
			System.out.println("@@��û��Ȩ�޽���ϵͳ�������µ�¼@@");
			gw.denglu();
		}
	}
	public void quit() {
		System.out.println("�����˳�ϵͳ����ӭ�´ι��٣�");
	}
	public void sec() {
		Scanner sc=new Scanner(System.in);
	System.out.println("*****ϵͳ���˵�����ѡ����Ҫ�Ĳ���*****");
	System.out.println("*                  1.��Ա����                   *");
	System.out.println("*                  2.���빺��                   *");
	System.out.println("*                  3.��������                   *");
	System.out.println("*************************************");
	System.out.print("��ѡ����������");
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
		System.out.println("@@����������������������@@");
		gw.sec();
	}
	}
    public void huiyuan() {
    	Scanner sc=new Scanner(System.in);
		System.out.println("**********��ӭ������Ա����**********");
		System.out.println("\n\n      ƽ̨����ά���У������ڴ�");
		System.out.print("�������˵��밴1��");
		int num=sc.nextInt();
		if (num==1) {
			gw.sec();
		}
		else {
			System.out.println("@@����������������������@@");
			gw.huiyuan();
		}
	}
    public void gw() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("**********��ӭ������������**********");
		System.out.println("\n\n      ƽ̨����ά���У������ڴ�");
		System.out.print("�������˵��밴1��");
		int num=sc.nextInt();
		if (num==1) {
			gw.sec();
		}
		else {
			System.out.println("@@����������������������@@");
			gw.gw();
		}
	}
}
