package huangchongliu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class GBK {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
InputStreamReader isr=new InputStreamReader(new FileInputStream("a.txt"),"UTF-8");//以UTF-8格式读取
int num;
while ((num=isr.read())!=-1) {
	System.out.print((char)num);
}
	
	}

}
