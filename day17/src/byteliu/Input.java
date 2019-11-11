//项目需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
//可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
package byteliu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("请输入信息: ");
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    File file=new File("info.txt");
    if (!file.exists()) {
		file.createNewFile();
	}
    BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));
    if (str.equals("886")) {
		bw.close();
	}
    else {
    	 bw.write(str);
    	 bw.newLine();
    	 bw.close();
    	 Input.main(null);
	}
	}
}
