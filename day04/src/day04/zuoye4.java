/*统计高于平均分的分数有多少个。定义数组[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]，定义getAvg方法，获取一个数组中的平均数。*/
package day04;

public class zuoye4 {
int s=0;
float avg;
int j=0;
int [] a= {95,92,75,56,98,71,80,58,91,91};
	public static void main(String[] args) {
	zuoye4 sc=new zuoye4();	
		sc.getAvg();
		 for(int i=0;i<10;i++) {
		    	if(sc.a[i]-sc.avg>0) {
		    		sc.j=sc.j+1;
		    	}
		    }
		    System.out.println("高于平均分的分数有"+sc.j+"个");
	}
	public void getAvg() {
	for(int i=0;i<a.length;i++) {
		 s=s+a[i];
	}
	 avg=s/a.length;
	System.out.println("平均数为："+avg);
	}

}
