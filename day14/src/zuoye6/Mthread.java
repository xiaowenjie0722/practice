package zuoye6;

public class Mthread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;

		
			   i++;
			   System.out.println(Thread.currentThread().getName()+":");
			   System.out.println(i);
	   
	  
	}
	
}