/*��Ŀ���ж�100��500֮�䣬��Щ����ˮ�ɻ�����
 * ��ˮ�ɻ�����ָһ�� n λ������ ( n��3 )������ÿ��λ�ϵ�����
 * �� n ����֮�͵��������������磺1^3 + 5^3+ 3^3 = 153����*/
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
