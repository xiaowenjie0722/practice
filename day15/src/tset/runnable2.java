package tset;

public class runnable2 implements Runnable{
	static int num2=0;
	 Object test;
		
		public runnable2(Object test) {
			this.test = test;
		}
	public void run() {
		// TODO Auto-generated method stub
		synchronized (test) {
			System.out.println("循环前:"+num2);
			for (int i =1000; i < 2000; i++) {
				  num2+=i;
			}
			 System.out.println("num2sout"+num2);
		}
		
		
	}

}
