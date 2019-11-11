package stream;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

public class FileOutputStreamdemo {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
      FileOutputStream fos=new FileOutputStream("a.txt",true);
	byte[] bytes=new byte[] {100,89,101};
	
	fos.write(bytes);
	}
}
