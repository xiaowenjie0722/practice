package buy;







public class MyRunnable extends Buy implements Runnable{
   Object lock=new Object();
    static int num=100; 
	@Override
	public /* synchronized */ void run() {
		// TODO Auto-generated method stub
	
		while (num>0) {
			synchronized (lock) {
			if (num>0) {
				String name = Thread.currentThread().getName(); 
				System.out.println(name+" "+num--); 

			}
			
	
		
	}
	}
		
	

	}

}
