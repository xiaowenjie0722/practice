package zuoye6;



public class Runnable06 extends Test06 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = start; i <=end; i++) {
			System.out.println(i);
		}
	}

}
