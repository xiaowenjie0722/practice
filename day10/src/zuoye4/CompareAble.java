package zuoye4;

public interface CompareAble {
	
public default void compare() {
	 Apple a1=new Apple(2, "蓝色");
	 Apple a2=new Apple(1, "红色");
	 if (a1.size>a2.size) {
			System.out.println("大小："+a1.size+" 颜色："+a1.color);
		}
		else {
			System.out.println("大小："+a2.size+" 颜色："+a2.color);
		}
}
}