/*����һ��LOL�е�Ӣ����͹����࣬Ҫ��
�������м�������ֵ�����ȼ����ԣ�����ֵ=�ȼ�*1000
Ӣ�����м��롰����ֵ�������ȼ��������������������Ա��������롰���򡱷����������Ŀ���ǹ������Ľ���ǹ��������ֵ-Ӣ�۹�����*/
package zuoye1;

import java.util.Scanner;
public class Hero {
   int EX;
   int Level;
   int Atk;
   Monster ms=new Monster();
   static Hero hr=new Hero();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hr.input();
	}
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ӣ�ۣ�SP:"+hr.EX+" Level:"+hr.Level+" Atk:"+hr.Atk);
		System.out.print("������SP:");
		hr.EX=sc.nextInt();
		System.out.print("������Level:");
		hr.Level=sc.nextInt();
		System.out.print("������Atk:");
		hr.Atk=sc.nextInt();
		System.out.println("���HP:"+ms.HP+" Level:"+ms.Level);
		System.out.print("������Level:");
		ms.Level=sc.nextInt();
		ms.HP = ms.Level*1000;
		hr.information();
	}
	public void information() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ӣ�ۣ�SP:"+hr.EX+" Level:"+hr.Level+" Atk:"+hr.Atk);	
		System.out.println("���HP:"+ms.HP+" Level:"+ms.Level);
		if (ms.HP<=0) {
			System.out.println("Monster is Dead!\n");
		}else {
			 System.out.print("�Ƿ񹥻���Y/N:");
		      String anser=sc.next();
		      if (anser.equals("Y")||anser.equals("y")) {
				hr.Attack();
			}
		}
	     
	}
	public void Attack() {
	ms.HP-=hr.Atk;
	hr.information();
	}

}
