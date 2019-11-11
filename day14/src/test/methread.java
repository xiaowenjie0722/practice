package test;

public class methread extends Thread{
    boolean issubthread=true;
	public synchronized void subthread()  {
		if (!issubthread) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 10; i++) {
			
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		issubthread=false;
	       notify();
	}
    public synchronized void maintread() {
    	if (issubthread) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		issubthread=true;
		notify();
	}
}
