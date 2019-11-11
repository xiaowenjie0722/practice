package day03;

public class zuoye3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int r=10;r>0;) {
	int c=r;
	while(c>=0) {
		c=c-2;
		System.out.print("c="+c+" ");
	}
	r=r/c;
	System.out.println("\nr="+r);
}
	}

}
