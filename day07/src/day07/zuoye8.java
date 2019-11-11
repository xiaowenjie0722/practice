/*模拟用户登录。定义用户类，属性为用户名和密码；使用集合存储多个用户对象；
 * 录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败；
 * 登录失败时，当用户名错误，提示没有该用户； 
 * 登录失败时，当密码错误时，提示密码有误。*/
package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class zuoye8 {
static zuoye8 zy=new zuoye8();
String userString;
String passString;
int i=0;
int num=1;
ArrayList<String> userList=new ArrayList<String>();
ArrayList<String> passList=new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
zy.infomations();
	}
	public void infomations() {
		
		userList.add("155555");
		userList.add("255555");
		userList.add("355555");
		passList.add("123456");
		passList.add("223456");
		passList.add("323456");
		input();
	}
	public void display() {
		if (num==1) {
			System.out.println("没有该用户");
			input();
		}
    	else if (num==2) {
			System.out.println("密码有误");
			input();
		}
		else if (num==3) {
			System.out.println("登录成功");
		}
	}
    public void input() {
    	Scanner sc=new Scanner(System.in);
    	
		System.out.println("请输入用户名:");
		userString=sc.next();
		System.out.println("请输入密码:");
		passString=sc.next();
		pd();
	 display();
		
	}
    public void pd() {
		for (int i = 0; i < userList.size(); i++) {
		if (userString.equals(zy.userList.get(i))&&passString.equals(passList.get(i))) {
			num=3;
             break;
		}
		else if (userString.equals(zy.userList.get(i))) {	
				num=2;				
			}		
		}
		}    
}
	
  