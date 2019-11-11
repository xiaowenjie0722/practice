package day14;

public class mythread extends Thread{

	public mythread(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// 执行逻辑
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	

}
