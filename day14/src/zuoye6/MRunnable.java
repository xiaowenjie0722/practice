package zuoye6;

public class MRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		
			
			i--;
			  System.out.print(Thread.currentThread().getName()+":");
			System.out.println(i);
		
		
		
	}

}
