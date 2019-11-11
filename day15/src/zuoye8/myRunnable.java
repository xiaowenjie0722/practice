package zuoye8;

public class myRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("我需要一个老师");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("教师:小星星");
		System.out.println("教我java,教完后，老师回到了办公室");
	}


}
