package day08;

public class SUV extends Auto {
public SUV(String brand, int carlength, int price) {
		super(brand, carlength, price);
		// TODO Auto-generated constructor stub
	}
int smallstandard=4295;
int mediumstandard=5070;
public void judgment(int carlength) {
	if (carlength<=smallstandard) {
		System.out.println("С�ͳ�");
	}
	else if (carlength>smallstandard&&carlength<=mediumstandard) {
		System.out.println("���ͳ�");
	}
	else if (carlength>mediumstandard) {
		System.out.println("���ͳ�");
	}
}
}
