/*英雄的级别最低为0，最高为30级，经验值最低为0，最高为30级时的经验值
该类中要求有一个含有参数的构造函数，参数为英雄的经验值，初始化时要保证经验值在要求范围之内，通过经验值计算英雄的级别，英雄的级别计算公式如下：
N=当前级别，EXP（经验值）=30（N^3+5N）-80
构建一个无参的构造方法，将经验值设置为0
利用英雄类无参和带有参数的构造函数分别构建英雄对象，并输出英雄的等级和经验值。*/

package zuoye2;

public class Hero {
	int Level;
	int EXP;
	int N;
	boolean pd=true;

public Hero(int EXP) {
	this.EXP=EXP;
}
//输入EX,计算等级  
public void input() {
		for(int i = 0;i<31;i++) {
	    if (EXP>=30*(i*i*i+5*i)-80&&EXP<30*((i+1)*(i+1)*(i+1)+5*(i+1))-80) {
	    	N=i;
			System.out.println("EXP:"+EXP+" 等级:"+N);
		}
}
}
}
