/*Ⱥ������ͨ�����ĳȺ�ж�����Ա��Ⱥ������Ա����ͨ�������ͨ����Ĺ���
1. Ⱥ����һ�ʽ���Ⱥ������п۳���ƽ���ֳ�n�ȷݣ��ó�Ա��ȡ��
2. ��Ա��ȡ����󣬱��浽��Ա����С�
�������������ɰ�����������Ķ����Լ�ָ����֮��ļ̳й�ϵ������ɷ�����Ĳ�����
*/
package zuoye3;

import java.util.Random;
import java.util.Scanner;

public class qunzhu {
	double qz=1000;//Ⱥ�������
	int rp;//������
	double c1;//������Ա1�Ľ��
	double c2;//������Ա2�Ľ��
	double cy1=100;
	double cy2=100;
	boolean pd=true;
	static qunzhu qunzhu=new qunzhu();
	public static void main(String[] args) {
		qunzhu.qz();
	}
   public void qz() {
	System.out.println("Ⱥ�������Ϊ:"+qz);
	System.out.println("��Ա1���Ϊ:"+cy1);
	System.out.println("��Ա2���Ϊ:"+cy2);
	hongbao();
}
   public void hongbao() {
	   Scanner sc=new Scanner(System.in);
	   Random rd=new Random();
	   if (pd==false) {
		System.out.println("���㣬���������룡");
	}
	   System.out.print("�����������:");
		rp=sc.nextInt();
		if (rp>=0&&rp<=qz) {
			int sj=rd.nextInt(rp);
			c1=sj;
			c2=rp-c1;
			qz-=rp;
			cy1+=c1;
			cy2+=c2;			
		}
		else {
			pd=false;
			
		}
		qz();
}
}
