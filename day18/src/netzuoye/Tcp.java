package netzuoye;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class Tcp {

	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("127.0.0.1", 8888);
		OutputStream ops = socket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(ops);
		bos.write("°¥Ñ½Ñ½£¡ÄãÕæµÄÅ£Åú£¬ÐÖµÜ£¡".getBytes());
		
	InputStream isp = socket.getInputStream();
		BufferedInputStream bis = new BufferedInputStream(isp);
		byte[] bytes=new byte[1024];
		int num;
		while ((num=bis.read())!=-1) {
			System.out.print(new String(bytes));
		}
		
		
bis.close();
      isp.close();
        bos.close();
		ops.close();
      
	}

}
