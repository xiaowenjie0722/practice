/*��ȡ�����ַ����������ͬ�Ӵ�������abegad��acegab�������ͬ�Ӵ�Ϊega��*/
package zuoye4;

public class zuoye4 {
	char[] c1= {'a','c','b','a','c','d'};
	char[] c2= {'d','f','b','a','c','b'};
	int[] c3=new int[c1.length];
	int k=0;
	int max=0;
	int xb=0;
	static zuoye4 zy=new zuoye4();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    zy.max();
	}
     public void max() {
    for (int i = 0; i < c1.length; i++) {
		if ((int)c1[i]==(int)c2[i]) {
			k=k+1;
		}
		else {
			k=0;
		}
		c3[i]=k;
    }
    for (int i = 0; i < c3.length; i++) {
		if (max<c3[i]) {
		   max=c3[i];	//maxֵ
		   xb = i;
		}
    }

    for (int i = xb-max+1; i <= xb; i++) {
    	System.out.print(c1[i]);
	}
	}  
    }


