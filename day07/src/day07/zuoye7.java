/*����ArrayList���ϣ��������ַ�����ɾ�����ȴ���5���ַ�������ӡɾ����ļ��ϡ�*/
package day07;

import java.util.ArrayList;

public class zuoye7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> arr=new ArrayList<String>();
     arr.add("abc");
     arr.add("abcd");
     arr.add("abcde");
     arr.add("abcdef");
     arr.add("abcds");
     for(String s:arr) {
    	if (s.length()>5) {
			arr.remove(s);
		} 
     }
     System.out.println(arr);
	}

}
