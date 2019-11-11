/*获取两个字符串的最大相同子串，例如abegad与acegab，最大相同子串为ega。*/
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
		   max=c3[i];	//max值
		   xb = i;
		}
    }

    for (int i = xb-max+1; i <= xb; i++) {
    	System.out.print(c1[i]);
	}
	}  
    }


