package day11;

public class timefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取for循环一次耗时多少（毫秒）
		long time1=System.currentTimeMillis();
       for (int i = 0; i < 9999; i++) {
	System.out.println(i);
	}
       long time2=System.currentTimeMillis();
       System.out.println(time2-time1);
	}

}
