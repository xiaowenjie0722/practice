package day16;

public class DiguiJia {
    
    static int num=10;
    static int sum=getsum(num);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(sum);
	}
    public static int  getsum(int num) {
    	if (num==1) {
			return sum=1;
		}
    	else {
			return sum=getsum(num-1)+num;
			
		}
		
		
	}
}
