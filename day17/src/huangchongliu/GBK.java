package huangchongliu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class GBK {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
InputStreamReader isr=new InputStreamReader(new FileInputStream("a.txt"),"UTF-8");//��UTF-8��ʽ��ȡ
int num;
while ((num=isr.read())!=-1) {
	System.out.print((char)num);
}
	
	}

}
