package zuoye3;

import java.util.Scanner;

public class chengyuan1 extends qunzhu{
	double cy1=100;
	String pd;
	static chengyuan1 cy=new chengyuan1();
public static void main(String[] args) {
	cy.qunzhu.main(null);
	cy.money();
}
public void money() {
	Scanner sc=new Scanner(System.in);
	System.out.println("��Ա1�����Ϊ:"+cy1);
	System.out.println("�Ƿ������");
	pd=sc.next();
	if (pd.equals("y")) {
		cy1+=c1;
	}
}
}
