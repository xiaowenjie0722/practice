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
//outputstream 子类实现
OutputStream ops=socket.getOutputStream();
byte[] bytes=new byte[1024];
bytes="残存将你撕成".getBytes();
ops.write(bytes);
//------------接受消息-------------
InputStream ips=socket.getInputStream();
int len;
byte[] recevie=new byte[1024];
ips.read(recevie);
System.out.println(new String(bytes));
ops.close();
ips.close();

	}

}
