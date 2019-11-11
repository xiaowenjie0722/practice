package day03;

public class zuoye5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="J";
for(int i=0;i<5;i++) {
	int key=i%3;
	switch(key) {
	case 0:
		str=str+'a';
		break;
	case 2:
		str=str+'V';
		break;
	}
}
System.out.println(str);
	}

}
