//获取某个目录下所有的含.java的文件
package day16;

import java.io.File;

public class isjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    File f=new File("D:\\idea workspace\\day16");
    getname(f);
	}
    public static void getname(File f) {
		File[] files=f.listFiles();
		for(File file:files) {
			if(file.isDirectory()){
				getname(file);
			}
			else{
				String str=file.getName();
				if (/*str.endsWith(".java")*/str.contains(".java")) {
					System.out.println(file);
				}
			}
		}
	}
}
