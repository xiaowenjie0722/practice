package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class serverSocket {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//�������������󣬵ȴ�socket����
		ServerSocket serverSocket=new ServerSocket(668);
		Socket socket=serverSocket.accept();
		InputStream ips=socket.getInputStream();
		int len;
		byte[] bytes=new byte[1024];
		len=ips.read(bytes);
		System.out.println(new String(bytes));
		ips.close();
		//-------------�ظ���Ϣ------------
		OutputStream ops=socket.getOutputStream();
		byte[] replay="��Щ�����ܽ���Ǿ�".getBytes();
		ops.write(bytes);
		ops.close();
		}
		
	}


