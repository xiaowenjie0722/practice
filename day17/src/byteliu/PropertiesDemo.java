//����һ���ı��ļ�score.txt����֪�������Ǽ�ֵ����ʽ�ģ����ǲ�֪��������ʲô��
//��дһ�������ж��Ƿ���"lisi"�����ļ����ڣ�����о͸ı���ʵΪ"100"
//score.txt�ļ��������£�
//zhangsan = 90
//lisi = 80
//wangwu = 85

package byteliu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties properties=new Properties();
FileReader fr=new FileReader("score.txt");
BufferedReader br=new BufferedReader(fr);
String str;
File file=new File("score.txt");
while ((str=br.readLine())!=null) {
	String[] split=str.split("\\ = ");
	properties.setProperty(split[0], split[1]);
}
properties.replace("lisi", "100");
FileWriter fw=new FileWriter("score.txt");
BufferedWriter bw=new BufferedWriter(fw);
Set<String> strings=properties.stringPropertyNames();
for(String key:strings) {
	bw.write(key+" = "+properties.getProperty(key));
	bw.newLine();
}
bw.close();
	}

}
