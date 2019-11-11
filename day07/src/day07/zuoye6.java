/*键盘录入QQ号码，验证格式的正确性，必须是5—12位数字，0不能开头。*/
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
			System.out.println("你输入的QQ号格式有误，请重新输入！");
		}
    	Scanner sc=new Scanner(System.in);
        System.out.print("请输入qq号码:");
        String qq=sc.next();
        if (qq.length()>=5&&qq.length()<=12) {
        	if (qq.substring(0, 1).equals("0")) {
        		pd=false;
        		input();
		}
        else {
        	System.out.println("qq格式正确");
		}	
			}
			else {
				pd=false;
				input();
			}
		}   
	}

