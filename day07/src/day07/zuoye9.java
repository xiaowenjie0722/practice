/*随机验证码。随机生成十组六位字符组成的验证码；验证码由大小写字母、数字字符组成。*/
package day07;

import java.util.Random;

public class zuoye9 {
    int sj;
    String sum="";
    static zuoye9 zy=new zuoye9();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		zy.yzm();
	}
    public void yzm() {
		Random rd=new Random();
	for (int j = 0; j < 10; j++) {
		for (int i = 0; i < 6; i++) {
			int s1=rd.nextInt(26)+65;
			char sj1=(char)(s1);
			int s2=rd.nextInt(26)+97;
			char sj2=(char)(s2);
			int sj3=rd.nextInt(10);
			sj=rd.nextInt(3)+1;
			if (sj==1) {
				sum=sum+sj1;
			}
			else if (sj==2) {
				sum=sum+sj2;
			}
			else if (sj==3) {
				sum=sum+sj3;
			}
		}
	}
	System.out.println(sum);	
	}
}
