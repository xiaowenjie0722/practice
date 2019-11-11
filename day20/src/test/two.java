package test;

public class two implements Runnable {
	int i;
	@Override
	public void run() {
		i+=1;
		System.out.println(i);
	}
}