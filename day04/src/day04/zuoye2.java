/* ģ����һ�����У���ȡ��1�ţ���5�ţ���50���˿��ơ�*/
package day04;

import java.util.Random;

public class zuoye2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pk = new String[52];
		int[] num = new int[13];
		String[] design = { "����", "÷��", "����", "����" };
		// ����52����
		int k = 0;
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 13; i++) {
				pk[k] = design[j]+(i + 1) ;
				k++;
			}
		}
		
        //���ϴ��
		Random rd = new Random();
		int sjs;
		String temp;
		for(int i = 0;i<52;i++) {
			sjs = rd.nextInt(52); //��ȡһ�������			
			temp = pk[sjs];
			pk[sjs] = pk[i];
			pk[i] = temp;    ///����i���� ���������sjs�������ƽ���һ�ν���
		
		}
		System.out.println("��1�����ǣ�"+pk[0]);
		System.out.println("��5�����ǣ�"+pk[4]);
		System.out.println("��50�����ǣ�"+pk[49]);
		
	}
}
