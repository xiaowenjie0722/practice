package lambda1;

public class Test09 implements InvokeDirect {
public static void main(String[] args) {
// TODO 请使用Lambda【省略格式】调用invokeDirect方法
invokeDirect(()->{System.out.println("哈哈哈哈哈哈哈");});

 }

private static void invokeDirect(Director director) {
  director.makeMovie();
 }

@Override
public void makeMovie() {
	// TODO Auto-generated method stub
	
}
}
