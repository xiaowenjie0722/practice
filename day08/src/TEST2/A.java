package TEST2;

public interface A {
	String str="str";
public abstract void showA();
private static void show10(String str) {
	for (int i = 0; i <10; i++) {
		System.out.print(str);
	}
	
}
public static void showB10() {
	show10(str);
}
public default void showC10() {
	show10(str);
}
}
