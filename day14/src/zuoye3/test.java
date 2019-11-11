/*请编写程序，分别打印主线程的名称和子线程的名称。
	要求使用两种方式实现：
		第一种方式：继承Thread类。
		第二种方法：实现Runnable接口。*/

package zuoye3;

public class test {
public static void main(String[] args) {
	MyThread myThread=new MyThread("main");
	myThread.start();
	Thread thread=new Thread(new MRunnable("线程1 线程2"));
	thread.start();
}
}
