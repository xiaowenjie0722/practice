package day16;

public class Diguiji {
    int num;
    static int sum=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(getsum(5)); 
	}
    public static int getsum(int num) {
    	if (num==1) {
			return sum=1;
		}
    	else {
    		return sum=getsum(num-1)*num;
		}
    	
	}
}
