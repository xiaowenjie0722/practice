package tset;

public class runnable1 implements Runnable{
	 static int num1=0;
	 Object test;
		
		public runnable1(Object test) {
			this.test = test;
		}
@Override
	public  void run() {
		// TODO Auto-generated method stub
	 synchronized (test) {
		 System.out.println("循环前:"+num1);
		 for (int i = 1; i <1000; i++) {
				num1+=i;				
			}
		 System.out.println("num1sout"+num1);
		 
		}

	}
		
}
