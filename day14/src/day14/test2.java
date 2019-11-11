package day14;

public class test2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=new Thread(new mythread("线程1"));
		thread.start();
System.out.println("world");
	}

}
