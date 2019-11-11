package zuoye6;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
		
   Mthread mthread1=new Mthread();
   Mthread mthread2=new Mthread();
   Thread thread1=new Thread(new MRunnable());
   Thread thread2=new Thread(new MRunnable());
  
	   mthread1.start();
	   mthread2.start();
	   thread1.start();
	   thread2.start();

	}

}
