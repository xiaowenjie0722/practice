package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class socketDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
Socket socket=new Socket("127.0.0.1",668);
//outputstream ����ʵ��
OutputStream ops=socket.getOutputStream();
byte[] bytes=new byte[1024];
bytes="�д潫��˺��".getBytes();
ops.write(bytes);
//------------������Ϣ-------------
InputStream ips=socket.getInputStream();
int len;
byte[] recevie=new byte[1024];
ips.read(recevie);
System.out.println(new String(bytes));
ops.close();
ips.close();

	}

}
