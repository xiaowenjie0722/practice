/*题目：判断100到500之间，哪些数是水仙花数。
 * 【水仙花数是指一个 n 位正整数 ( n≥3 )，它的每个位上的数字
 * 的 n 次幂之和等于它本身。（例如：1^3 + 5^3+ 3^3 = 153）】*/
package day03;

public class extra3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; int b; int c;
for(int i=100;i<=500;i++) {
	a=i/100;
	b=i/10-a*10;
	c=i%10;
	if(i==a*a*a+b*b*b+c*c*c) {
		System.out.println(i);
	}
}
	}

}
