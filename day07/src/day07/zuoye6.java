/*����¼��QQ���룬��֤��ʽ����ȷ�ԣ�������5��12λ���֣�0���ܿ�ͷ��*/
package day07;

import java.util.Scanner;

public class zuoye6 {
	boolean pd=true;
	static zuoye6 zy=new zuoye6();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      zy.input();
	}
    public void input() {
    	if (pd==false) {
			System.out.println("�������QQ�Ÿ�ʽ�������������룡");
		}
    	Scanner sc=new Scanner(System.in);
        System.out.print("������qq����:");
        String qq=sc.next();
        if (qq.length()>=5&&qq.length()<=12) {
        	if (qq.substring(0, 1).equals("0")) {
        		pd=false;
        		input();
		}
        else {
        	System.out.println("qq��ʽ��ȷ");
		}	
			}
			else {
				pd=false;
				input();
			}
		}   
	}

