package TEST1;

public class B implements A {
public void showA() {
	System.out.println("这是重写的");
}
static B b=new B();
public static void main(String[] args) {
	b.showA();
	b.showB();
}
}
