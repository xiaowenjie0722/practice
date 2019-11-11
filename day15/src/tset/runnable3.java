package tset;


public class runnable3 implements Runnable{
	static int num3=0;
	 Object test;
	
	public runnable3(Object test) {
		this.test = test;
	}
	public  void run() {
		// TODO Auto-generated method stub
		synchronized (test) {
			System.out.println("循环前:"+num3);
			for (int i = 2000; i < 3000; i++) {
				num3+=i;
			}	
			 System.out.println("num3sout"+num3);
		}
		
		
	}

}
