package day14;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mythread mythread=new mythread("线程1");
		mythread mythread2=new mythread("线程2");
		mythread.start();
		mythread2.start();
        System.out.println("hello");
	}

}
