package diguizuoye;

import java.io.File;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     File file=new File("D:\\a.txt"); 
     File file2=new File("a.txt");
     if (!file.isFile()) {
		file.createNewFile();
	}
     File file3=new File("D:\\bbb");
     System.out.println("����bbb�ļ���"+file3.mkdir());
     File file4=new File("D:\\ccc\\bbb\\aaa");
     System.out.println("�����༶�ļ���"+file4.mkdirs());
     System.out.println("ɾ��D���µ�a.txt"+file.delete());
     System.out.println("ɾ��aaa�ļ���"+file4.delete());
     File file5=new File("D:\\ccc\\bbb\\b.txt");
     file5.createNewFile();
     System.out.println(file5.getName());
     System.out.println(file5.getTotalSpace());
     System.out.println(file5.getAbsolutePath());
     System.out.println(file5.getParent());
     if (file5.isFile()) {
		System.out.println("b.txt��һ���ļ�");
	}
     else {
    	 System.out.println("b.txt����һ���ļ�");
	}
     if (file3.isDirectory()) {
		System.out.println("bbb��һ���ļ���");
	}
     else {
    	 System.out.println("bbb����һ���ļ���");
	}
	}

}
