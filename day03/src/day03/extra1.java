/*��Ŀ����һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
 * С���ӳ����������º�ÿ��������һ�����ӡ��������Ӷ�������
 * Ҫ�����һ�������ӵ������Ƕ��١�*/
package day03;

public class extra1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x;//x��ʾ���ӵĶ���
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
