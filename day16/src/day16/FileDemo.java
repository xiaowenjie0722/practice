package day16;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//new file只创建文件对象，不创建文件
File file=new File("D:\\BaiduNetdiskDownload\\xxx.txt");
//创建文件
System.out.println(file.createNewFile());
//判断是否为文件
System.out.println(file.isFile());
//判断是否为目录
System.out.println(file.isDirectory());
//判断文件是否存在
System.out.println(file.exists());
//返回绝对路径
System.out.println(file.getAbsolutePath());
//转化为路径字符串
System.out.println(file.getPath());
//返回文件的名字
System.out.println(file.getName());
//返回文件的长度
System.out.println(file.length());

/*-----------------------------------------*/
File file2=new File("D:\\BaiduNetdiskDownload\\dd");
//创建文件夹
System.out.println(file2.mkdir());
//创建多级目录
File file3=new File("D:\\BaiduNetdiskDownload\\dd\\a\\b\\c");
System.out.println(file3.mkdirs());
//删除
System.out.println(file3.delete());
//数组遍历
String[] filename=file2.list();
for(String s:filename) {
	System.out.println(s);
	//文件遍历
	File[] files=file2.listFiles();
	for(File f:files) {
		System.out.println(f);
	}
}
	}

}
