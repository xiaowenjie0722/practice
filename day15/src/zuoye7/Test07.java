package zuoye7;
public class Test07 implements Runnable {
        int num;
public Test07(int num) {
		super();
		this.num = num;
	}

public static void main(String[] args) {
  Thread t = new Thread(new Test07(10));
  t.start();
 }

@Override
public void run() {
	// TODO Auto-generated method stub
	for (int i = 0; i < num; i++) {
		   System.out.println(i);
		  }
}
}

