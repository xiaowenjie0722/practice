package TEST1;

public class B implements A {
public void showA() {
	System.out.println("������д��");
}
static B b=new B();
public static void main(String[] args) {
	b.showA();
	b.showB();
}
}
