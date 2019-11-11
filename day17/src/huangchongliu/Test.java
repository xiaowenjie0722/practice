//分析以下需求，并用代码实现
//实现一个验证码小程序，要求如下：
//1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，
//并存入data.txt中，要求一个验证码占一行；
//2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：
//在控制台提示验证成功，如果不存在控制台提示验证失败

package huangchongliu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     
	String str;
	Scanner sc=new Scanner(System.in);
     System.out.print("请输入验证码: ");
     str=sc.next();
     BufferedReader br=new BufferedReader(new FileReader("data.txt"));
     String str1;
     int num=1;
     while ((str1=br.readLine())!=null) {
		if (str.equals(str1)) {
			num=2;
			break;
		}
	}
     if (num==1) {
    	 System.out.println("验证失败");
    	 Test.main(null);
	}else if (num==2) {
		 System.out.println("验证成功");
	}
    
     
	}

}
