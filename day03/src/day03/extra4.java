/*题目：求1-100之间，有哪些数是完数。【完全数（Perfect number），又称完美数或完备数，
 * 是一些特殊的自然数。它所有的真因子（即除了自身以外的约数）的和（即因子函数），
 * 恰好等于它本身。例如：6=1+2+3】*/
package day03;

public class extra4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  for(int i=1;i<=100;i++) {
	 int sum = 0;
	for(int k=1;k<i;k++) {
		if(i%k==0) {
			sum = sum+k;
		}
	}
	if(sum == i)
	System.out.println(i);
	}

}}
