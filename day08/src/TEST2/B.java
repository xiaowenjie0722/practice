package TEST2;

public class B implements A{

	@Override
	public void showA() {
		System.out.println("这是B重写");
	}
	public static void showD() {
		System.out.println("我是D");
	}

}
