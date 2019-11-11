/*字符数组：{'a','l','f','m','f','o','b','b','s','n'}，定义printCount方法，统计每个字符出现的次数并打印到控制台。*/
package day04;

public class zuoye3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCount() ;
	}
	public static  void printCount() {
		char[] zi= {'a','l','f','m','f','o','b','b','s','n'};
		int a=0;
		for(int i=0;i<zi.length;i++) {
			a=1;
			if(zi[i]!=' ') {
				for(int j=i+1;j<zi.length;j++) {
					if(zi[i]==zi[j]) {
						a++;
						zi[j]=' ';
					}
										
				}
				System.out.println(zi[i]+"出现"+a+"次");	
			}
							
		}
		
	}

}
