package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class test3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
   FileOutputStream fos=new FileOutputStream("D:\\c.txt",true);
   byte[] bytes=new byte[] {13,105,32,108,111,118,101,32,106,97,118,97};
   fos.write(bytes);
   File file=new File("D:\\D.txt");
   file.createNewFile();
   Thread.sleep(2000);
   FileOutputStream fos1=new FileOutputStream("D:\\D.txt");
   for (int i = 0; i < 5; i++) {
	   byte[] bytes1=new byte[] {105,32,108,111,118,101,32,106,97,118,97,13};
	   fos1.write(bytes1);
}
	}

}
