package test;

public class three implements Runnable {
int i;
	@Override
	public void run() {
		i-=1;
		System.out.println(i);
	}

}
