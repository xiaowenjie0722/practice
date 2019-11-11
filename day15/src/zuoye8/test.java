package zuoye8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {
public static void main(String[] args) {
	ExecutorService service=Executors.newFixedThreadPool(6);//6表示同时进行的线程数
	myRunnable myRunnable=new myRunnable();
	Thread t=new Thread(myRunnable);
	t.start();
	for (int i = 0; i < 100; i++) {
		service.submit(myRunnable);
	}
	
	
}
}
