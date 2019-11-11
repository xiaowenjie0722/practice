package day03;

public class zuoye2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float discount=1;int totalPrice=550;
if(totalPrice>500) {
	discount=  (float) 0.5;
}
else if(totalPrice>=400&&totalPrice<500) {
	discount=(float) 0.6;
}
else if(totalPrice>=300&&totalPrice<400) {
	discount=(float) 0.7;
}
else if(totalPrice>=200&&totalPrice<300) {
	discount=(float) 0.8;
}
else {System.out.println("error!");}
System.out.println("totalPrice为："+totalPrice);
System.out.println("totalPrice与discount的积为："+totalPrice*discount);
	}

}
