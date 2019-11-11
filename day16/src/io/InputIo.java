package io;

import java.io.FileInputStream;
import java.io.IOException;


public class InputIo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
    FileInputStream fis=new FileInputStream("D:\\a.txt");
   int k;
while ((k=fis.read())!=-1) {
	System.out.print(k+" ");	
}
	}

}
