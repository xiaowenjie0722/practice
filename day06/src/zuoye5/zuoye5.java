/*�ַ������ҡ�����¼��һ�����ַ�������¼��һ��С�ַ�����ͳ��С�ַ����ڴ��ַ����г��ֵĴ�����*/
package zuoye5;
//String indxOf   subString
public class zuoye5 {
	char[] big= {'a','b','c','a','b'};
	char[] small= {'a','b'};
	int[] num=new int[small.length*(big.length-small.length+1)];
	int k=0;
	int n=0;
	int m=0;
	static zuoye5 zy=new zuoye5();
	public static void main(String[] args) {
		zy.number();
	}
	
    public void number() {
	for (int i = 0; i <big.length-small.length+1; i++) {
		for (int j = 0; j < small.length; j++) {
			if (small[j]==big[j+i]) {
				k++;
			}
			else {
				k=0;
			}
			num[n]=k;
			n++;
		}
	}
	pd();
	}
    public void pd() {
		for (int i = 0; i < small.length*(big.length-small.length+1); i++) {
			
			  if (num[i]==small.length) { m++; }
			 
		}
		 System.out.println(m); 
	}
}
