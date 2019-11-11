package zuoye6;

public class Test06 {
public int start = 1;
public int end = 99;
public static void main (String[] args) {
new Test06().method();
 }
public void method() {
Runnable06 a=new Runnable06();
Thread t = new Thread(a);
t.start();
}
}