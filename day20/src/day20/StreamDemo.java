//��ʽ���
//Stream��
package day20;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list=new ArrayList<String>();
        list.add("���޼�");
        list.add("������");
        list.add("����");
        list.add("��ǿ");
        list.add("������");
        list.stream().filter(s->s.startsWith("��"))
        .filter(s->s.length()==3).forEach(System.out::println);
	}

}
