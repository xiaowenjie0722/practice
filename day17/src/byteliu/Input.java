//��Ŀ�������û��ӿ���̨������Ϣ��������Ϣ�洢���ļ�Info.txt�С�
//�������������Ϣ��ÿ����Ϣ�洢һ�С����û����룺��886��ʱ�����������
package byteliu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("��������Ϣ: ");
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    File file=new File("info.txt");
    if (!file.exists()) {
		file.createNewFile();
	}
    BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));
    if (str.equals("886")) {
		bw.close();
	}
    else {
    	 bw.write(str);
    	 bw.newLine();
    	 bw.close();
    	 Input.main(null);
	}
	}
}
