/*ͳ�Ƹ���ƽ���ֵķ����ж��ٸ�����������[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]������getAvg��������ȡһ�������е�ƽ������*/
package day04;

public class zuoye4 {
int s=0;
float avg;
int j=0;
int [] a= {95,92,75,56,98,71,80,58,91,91};
	public static void main(String[] args) {
	zuoye4 sc=new zuoye4();	
		sc.getAvg();
		 for(int i=0;i<10;i++) {
		    	if(sc.a[i]-sc.avg>0) {
		    		sc.j=sc.j+1;
		    	}
		    }
		    System.out.println("����ƽ���ֵķ�����"+sc.j+"��");
	}
	public void getAvg() {
	for(int i=0;i<a.length;i++) {
		 s=s+a[i];
	}
	 avg=s/a.length;
	System.out.println("ƽ����Ϊ��"+avg);
	}

}
