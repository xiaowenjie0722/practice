/*��Ŀ����1-100֮�䣬����Щ��������������ȫ����Perfect number�����ֳ����������걸����
 * ��һЩ�������Ȼ���������е������ӣ����������������Լ�����ĺͣ������Ӻ�������
 * ǡ�õ������������磺6=1+2+3��*/
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
