package day13;
//以前我们都确定参数个数
//现在不确定参数个数
public class VariaParam {
public static void main(String[] args) {
	int[] arr=new int[] {1,2,3,4};
	int sum=getSun(arr);
	System.out.println(sum);
}
    public static int getSun(int...arr) {
    	int s=0;
    	for(int a:arr) {
    		s=s+a;
    	}
    	return s;
    }
}
