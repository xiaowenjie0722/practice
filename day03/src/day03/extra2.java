/*题目：判断10-105之间有多少个素数，并输出所有素数。
 * 【素数又称为质数，定义为在大于1的自然数中，
 * 除了1和它本身以外不再有其他因数的数】*/
package day03;

public class extra2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int j;
	        for (int i = 10; i <= 105; i++) // 1不是素数，所以直接从2开始循环
	        {
	            j = 2;
	            while (i % j != 0) {
	                j++; // 测试2至i的数字是否能被i整除，如不能就自加
	            }
	            if (j == i) // 当有被整除的数字时，判断它是不是自身
	            {
	                System.out.println(i); // 如果是就打印出数字
	            }
	        }
	}

}
