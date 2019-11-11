package tset;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service=Executors.newFixedThreadPool(3);
		Object test = new Object();
runnable1 r1=new runnable1(test);
runnable2 r2=new runnable2(test);
runnable3 r3=new runnable3(test);
	service.submit(r1);
	service.submit(r2);
	service.submit(r3);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("num1="+r1.num1);
	System.out.println("num2="+r2.num2);
	System.out.println("num3="+r3.num3);
	
}


	}


