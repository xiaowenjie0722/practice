package day17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    FileReader fileReader=new FileReader("D:\\c.txt");
		BufferedReader bf=new BufferedReader(fileReader);
    String str;
    while ((str=bf.readLine())!=null) {
    	String s=str.substring(str.indexOf("id:"),str.indexOf(" "));
    	System.out.println(s);
		
	}
    
	}

}
