package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class severs{
public static void main(String[] args) throws IOException {
	ServerSocket sever=new ServerSocket(8888);
	Socket socket=sever.accept();
	
	InputStream ips=socket.getInputStream();
	byte[] bytes=new byte[1024];
	System.out.println("severs���յ�����Ϣ�ǣ�");	
	ips.read(bytes);
		System.out.print(new String(bytes));
	
	
	OutputStream ops=socket.getOutputStream();
	System.out.println("severs��������Ϣ");
	ops.write("�ҿ�".getBytes());
	System.out.println("severs������Ϣ���");
	ops.close();
	ips.close();
}
}
