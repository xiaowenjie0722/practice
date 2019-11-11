/*一组大乐透号码由10个1-99之间的数字组成，定义方法，打印大乐透号码信息。package day04;*/
package day04;

public class zuoye1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			int num=(int) (1+Math.random()*99);
			System.out.print(num+" ");
		}

	}

}
