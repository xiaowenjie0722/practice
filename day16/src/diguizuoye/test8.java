package diguizuoye;

import java.io.File;

public class test8 {
    int num;
    int sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File f=new File("D:\\格式工厂 4.5.0");
        getname(f);
	}
    public static void getname(File f) {
		File[] files=f.listFiles();
		for(File file:files) {
			if (file.isFile()) {
				System.out.println(file.getName());
			}
//			else {
//				getname(file);
//			}
		}
	}
}
