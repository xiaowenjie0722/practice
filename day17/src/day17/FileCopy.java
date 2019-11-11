package day17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
FileInputStream fis=new FileInputStream("D:\\01 бли╚.m4p");
BufferedInputStream bis=new BufferedInputStream(fis);
File file=new File("бли╚.m4p");
if (!file.exists()) {
	file.createNewFile();
}
FileOutputStream fos=new FileOutputStream(file);
BufferedOutputStream bos=new BufferedOutputStream(fos);
byte[] bytes=new byte[1024*8];
int len =0;
while ((len = (bis.read(bytes)))!=-1) {
	bos.write(bytes,0,len);
}
bos.close();
fos.close();
bis.close();
fis.close();
long end=System.currentTimeMillis();
System.out.println(end-start);
	}
	

}
