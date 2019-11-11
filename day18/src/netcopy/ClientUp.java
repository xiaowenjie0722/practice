package netcopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientUp {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
    Socket socket=new Socket("127.0.0.1",999);
    Scanner sc=new Scanner(System.in);
    System.out.print("请输入上传地址: ");
    String url=sc.nextLine();
    File file=new File(url);
   // InputStream ips=socket.getInputStream();
    BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
    
    OutputStream ops=socket.getOutputStream();
    BufferedOutputStream bos=new BufferedOutputStream(ops);
    int len;
    
    while((len=bis.read())!=-1) {
    	 bos.write(len);
    }
    bis.close();
    ops.close();
	}

}
