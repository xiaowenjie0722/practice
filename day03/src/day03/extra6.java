/*题目：输出2000年到3000年中的闰年。*/
package day03;

public class extra6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=2000;i<=3000;i++) {
		if(i%400==0||i%4==0&&i%100!=0) {
			System.out.println(i);
		}
	}
	}
	}

