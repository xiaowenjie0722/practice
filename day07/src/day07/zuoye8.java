/*ģ���û���¼�������û��࣬����Ϊ�û��������룻ʹ�ü��ϴ洢����û�����
 * ¼���û������룬�Ա��û���Ϣ��ƥ��ɹ���¼�ɹ��������¼ʧ�ܣ�
 * ��¼ʧ��ʱ�����û���������ʾû�и��û��� 
 * ��¼ʧ��ʱ�����������ʱ����ʾ��������*/
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
			System.out.println("û�и��û�");
			input();
		}
    	else if (num==2) {
			System.out.println("��������");
			input();
		}
		else if (num==3) {
			System.out.println("��¼�ɹ�");
		}
	}
    public void input() {
    	Scanner sc=new Scanner(System.in);
    	
		System.out.println("�������û���:");
		userString=sc.next();
		System.out.println("����������:");
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
	
  