package day16;

import java.io.File;

public class RecursionFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     File f=new File("D:\\BaiduNetdiskDownload");
     getFiles(f);
	}
    public static void getFiles(File f) {
    	File[] files=f.listFiles();
    	for(File file:files) {
    		if (file.isDirectory()) {
				getFiles(file);
			}
    	
				System.out.println(file);
		 
    	}
	}
}
