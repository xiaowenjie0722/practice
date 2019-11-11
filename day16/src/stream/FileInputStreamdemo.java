package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    FileInputStream fis=new FileInputStream("a.txt");
    byte[] bytes=new byte[1024];
   System.out.println(fis.read(bytes));
   System.out.println(fis.available());
   
	}

}
