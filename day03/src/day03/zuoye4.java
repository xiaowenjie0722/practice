package day03;

public class zuoye4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int jj=20;int a=0;int b=0;
for(int ii=0;ii<jj;ii+=2) {
	jj--;
	if(ii%3==0) {
		a=ii;
		System.out.println(ii+"Hello");
	}
	else {
		b=ii;
		System.out.println(b+"World");
	}
}
System.out.println("a*b="+a*b);
	}

}
