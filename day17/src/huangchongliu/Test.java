//�����������󣬲��ô���ʵ��
//ʵ��һ����֤��С����Ҫ�����£�
//1. ����Ŀ��Ŀ¼���½�һ���ļ���data.txt,����¼��3���ַ�����֤�룬
//������data.txt�У�Ҫ��һ����֤��ռһ�У�
//2. ����¼��һ����Ҫ��У�����֤�룬����������֤����data.txt�д��ڣ�
//�ڿ���̨��ʾ��֤�ɹ�����������ڿ���̨��ʾ��֤ʧ��

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
     System.out.print("��������֤��: ");
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
    	 System.out.println("��֤ʧ��");
    	 Test.main(null);
	}else if (num==2) {
		 System.out.println("��֤�ɹ�");
	}
    
     
	}

}
