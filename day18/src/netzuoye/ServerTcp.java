package netzuoye;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTcp {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(8888);
		Socket servers = serverSocket.accept();
		System.out.println("zzz");
		InputStream ips = servers.getInputStream();
		BufferedInputStream bis = new BufferedInputStream(ips);
		byte[] bytes1 = new byte[1024];
		
		int num;
		while ((num=bis.read())!=-1) {
			System.out.print(new String(bytes1));
		}
		System.out.println("zzz1");
		
		System.out.print(new String(bytes1));
		OutputStream ops = servers.getOutputStream();
	BufferedOutputStream bos = new BufferedOutputStream(ops);
		bos.write("ÐÖµÜ£¬ÄãÒ²Å£Åú£¡".getBytes());
		bos.close();
		ops.close();
		bis.close();
		ips.close();
	}

}
