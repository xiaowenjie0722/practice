package day05;

import java.util.Scanner;

public class wuziqi{
	static wuziqi wzq=new wuziqi();
	String [][] qp=new String[10][10];
	int length;
	int height;
    int user=0;
	 public static void main(String[] args) {
		
		 //��ʼ�����̣�������飩  qp[][]  ȫ������*
		 //��ӡ����  ����forѭ��   ���qp[i][k]
		 //��ʼ����   ���ж������Ǻڻ��ǰ������£�֮���ȡx,y  ��qp[x][y]=��ɫ���߰�ɫ
		 //�ж���Ϸ����		 
		 wzq.qipan();
	}
	 public void qipan() {
		 System.out.println("1 2 3 4 5 6 7 8 9 10");
		for (int i = 0; i < qp.length; i++) {
			for (int j = 0; j < qp.length; j++) {
				wzq.qp[i][j]="*";
				System.out.print(wzq.qp[i][j]+" ");
			}
			System.out.print(i+1);
			System.out.println();
		}
		wzq.input();
	}
	 public  void input() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("��"+(wzq.user%2+1)+"λ�û���������������");
		wzq.length=scanner.nextInt();
		wzq.height=scanner.nextInt();
		if (wzq.user%2==0) {
			wzq.qp[wzq.length-1][wzq.height-1]="0";	
		}
		else {
			wzq.qp[wzq.length-1][wzq.height-1]="X";
		}
		user++;
		wzq.print();
	}
	 //��ӡ����������
	 public void print() {
		 System.out.println("1 2 3 4 5 6 7 8 9 10");
			for (int i = 0; i < qp.length; i++) {
				for (int j = 0; j < qp.length; j++) {
					System.out.print(wzq.qp[i][j]+" ");
				}
				System.out.print(i+1);
				System.out.println();
			}
			wzq.input();
		}
	}

