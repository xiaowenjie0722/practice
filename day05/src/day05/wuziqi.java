package day05;

import java.util.Scanner;

public class wuziqi{
	static wuziqi wzq=new wuziqi();
	String [][] qp=new String[10][10];
	int length;
	int height;
    int user=0;
	 public static void main(String[] args) {
		
		 //初始化棋盘（填充数组）  qp[][]  全部等于*
		 //打印棋盘  两个for循环   输出qp[i][k]
		 //开始下棋   先判断这轮是黑还是白棋在下，之后获取x,y  令qp[x][y]=黑色或者白色
		 //判断游戏结束		 
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
		System.out.println("第"+(wzq.user%2+1)+"位用户请输入行列数：");
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
	 //打印到空棋盘中
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

