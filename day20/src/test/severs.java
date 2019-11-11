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
	System.out.println("severs接收到的消息是：");	
	ips.read(bytes);
		System.out.print(new String(bytes));
	
	
	OutputStream ops=socket.getOutputStream();
	System.out.println("severs将发送消息");
	ops.write("我靠".getBytes());
	System.out.println("severs发送消息完毕");
	ops.close();
	ips.close();
}
}
