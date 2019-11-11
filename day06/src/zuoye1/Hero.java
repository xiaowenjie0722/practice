/*创建一个LOL中的英雄类和怪物类，要求：
怪物类中加入生命值属、等级属性，生命值=等级*1000
英雄类中加入“经验值”，“等级”，“攻击力”等属性变量，加入“击打”方法，击打的目标是怪物，击打的结果是怪物的生命值-英雄攻击力*/
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
		System.out.println("英雄：SP:"+hr.EX+" Level:"+hr.Level+" Atk:"+hr.Atk);
		System.out.print("请输入SP:");
		hr.EX=sc.nextInt();
		System.out.print("请输入Level:");
		hr.Level=sc.nextInt();
		System.out.print("请输入Atk:");
		hr.Atk=sc.nextInt();
		System.out.println("怪物：HP:"+ms.HP+" Level:"+ms.Level);
		System.out.print("请输入Level:");
		ms.Level=sc.nextInt();
		ms.HP = ms.Level*1000;
		hr.information();
	}
	public void information() {
		Scanner sc=new Scanner(System.in);
		System.out.println("英雄：SP:"+hr.EX+" Level:"+hr.Level+" Atk:"+hr.Atk);	
		System.out.println("怪物：HP:"+ms.HP+" Level:"+ms.Level);
		if (ms.HP<=0) {
			System.out.println("Monster is Dead!\n");
		}else {
			 System.out.print("是否攻击？Y/N:");
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
