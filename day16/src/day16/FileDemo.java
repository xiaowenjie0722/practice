package day16;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//new fileֻ�����ļ����󣬲������ļ�
File file=new File("D:\\BaiduNetdiskDownload\\xxx.txt");
//�����ļ�
System.out.println(file.createNewFile());
//�ж��Ƿ�Ϊ�ļ�
System.out.println(file.isFile());
//�ж��Ƿ�ΪĿ¼
System.out.println(file.isDirectory());
//�ж��ļ��Ƿ����
System.out.println(file.exists());
//���ؾ���·��
System.out.println(file.getAbsolutePath());
//ת��Ϊ·���ַ���
System.out.println(file.getPath());
//�����ļ�������
System.out.println(file.getName());
//�����ļ��ĳ���
System.out.println(file.length());

/*-----------------------------------------*/
File file2=new File("D:\\BaiduNetdiskDownload\\dd");
//�����ļ���
System.out.println(file2.mkdir());
//�����༶Ŀ¼
File file3=new File("D:\\BaiduNetdiskDownload\\dd\\a\\b\\c");
System.out.println(file3.mkdirs());
//ɾ��
System.out.println(file3.delete());
//�������
String[] filename=file2.list();
for(String s:filename) {
	System.out.println(s);
	//�ļ�����
	File[] files=file2.listFiles();
	for(File f:files) {
		System.out.println(f);
	}
}
	}

}
