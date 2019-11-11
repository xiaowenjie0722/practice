package buy;

public class Buy {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    Thread thread1=new Thread(new MyRunnable());
    Thread thread2=new Thread(new MyRunnable());
    Thread thread3=new Thread(new MyRunnable());
    Thread thread4=new Thread(new MyRunnable());
    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
	}

}
