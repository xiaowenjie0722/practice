package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class client {
	public static void main(String[] args) throws IOException {
		Socket socket=new Socket("127.0.0.1",8888);
		OutputStream ops=socket.getOutputStream();
		ops.write("大傻叉，摄像机八号线彼此厮杀不错".getBytes());       
		InputStream ips=socket.getInputStream();
		byte[] bytes=new byte[1024];
		while ((ips.read(bytes))!=-1) {
			System.out.println(new String(bytes));
		}
		ips.close();
		ops.close();
		System.out.println("client关闭");
	}

}
