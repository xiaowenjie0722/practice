/*��Ŀ���ж�10-105֮���ж��ٸ����������������������
 * �������ֳ�Ϊ����������Ϊ�ڴ���1����Ȼ���У�
 * ����1�����������ⲻ������������������*/
package day03;

public class extra2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int j;
	        for (int i = 10; i <= 105; i++) // 1��������������ֱ�Ӵ�2��ʼѭ��
	        {
	            j = 2;
	            while (i % j != 0) {
	                j++; // ����2��i�������Ƿ��ܱ�i�������粻�ܾ��Լ�
	            }
	            if (j == i) // ���б�����������ʱ���ж����ǲ�������
	            {
	                System.out.println(i); // ����Ǿʹ�ӡ������
	            }
	        }
	}

}
