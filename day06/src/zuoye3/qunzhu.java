/*群主发普通红包。某群有多名成员，群主给成员发普通红包。普通红包的规则：
1. 群主的一笔金额，从群主余额中扣除，平均分成n等份，让成员领取。
2. 成员领取红包后，保存到成员余额中。
请根据描述，完成案例中所有类的定义以及指定类之间的继承关系，并完成发红包的操作。
*/
package zuoye3;

import java.util.Random;
import java.util.Scanner;

public class qunzhu {
	double qz=1000;//群主的余额
	int rp;//红包金额
	double c1;//发给成员1的金额
	double c2;//发给成员2的金额
	double cy1=100;
	double cy2=100;
	boolean pd=true;
	static qunzhu qunzhu=new qunzhu();
	public static void main(String[] args) {
		qunzhu.qz();
	}
   public void qz() {
	System.out.println("群主的余额为:"+qz);
	System.out.println("成员1余额为:"+cy1);
	System.out.println("成员2余额为:"+cy2);
	hongbao();
}
   public void hongbao() {
	   Scanner sc=new Scanner(System.in);
	   Random rd=new Random();
	   if (pd==false) {
		System.out.println("余额不足，请重新输入！");
	}
	   System.out.print("请输入红包金额:");
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
