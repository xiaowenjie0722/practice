/*题目：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子。假如兔子都不死，
 * 要求输出一年内兔子的数量是多少。*/
package day03;

public class extra1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x;//x表示兔子的对数
	int a=1;
	int b=1;
for(int i=1;i<=2;i++) {
	x=1;
	System.out.println(x);
}
for(int i=3;i<=12;i++) {
	x=a+b;
	b=a;
	a=x;
	System.out.println(x);
}
	}

}
