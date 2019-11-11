package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     FileOutputStream fos=new FileOutputStream("D:\\a.txt");
//     fos.write(97);
     byte[] bytes=new byte[] {105,32,108,111,118,101,32,106,97,118,97};
     fos.write(bytes);
	}

}
