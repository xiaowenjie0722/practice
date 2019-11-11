package netcopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServersDowm {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
ServerSocket serverSocket=new ServerSocket(999);
Socket socket=serverSocket.accept();
InputStream ips=socket.getInputStream();
byte[] bytes=new byte[1024];
BufferedInputStream bis=new BufferedInputStream(ips);
File file =new File("D:\\xxx.jpg");
if (!file.exists()) {
	file.createNewFile();
}
BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\xxx.jpg"));
int len;
while((len=bis.read())!=-1) {
	bos.write(len);
}
System.out.println("ÉÏ´«Íê±Ï");
ips.close();
bos.close();
	}

}
