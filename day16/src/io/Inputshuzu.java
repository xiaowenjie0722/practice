package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;


public class Inputshuzu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:\\c.txt");
		file.createNewFile();
    FileInputStream fis=new FileInputStream("D:\\xxx.txt");
    byte[] bytes=new byte[2];
    String str = "";
    while (fis.read(bytes)!=-1) {
	 str+=new String(bytes);
	}
    FileWriter fileWriter=new FileWriter(file);
    fileWriter.write(str);
    fileWriter.close();
	}
   
}
