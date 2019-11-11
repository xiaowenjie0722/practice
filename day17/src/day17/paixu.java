package day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class paixu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileReader fr=new FileReader("xxx.txt");
BufferedReader bf=new BufferedReader(fr);
FileWriter fw=new FileWriter("r.txt");
BufferedWriter bw=new BufferedWriter(fw);
HashMap<String, String> map=new HashMap<String, String>(); 
String str;
while ((str=bf.readLine())!=null) {
String[] split=str.split("\\.");
map.put(split[0], split[1]);
}
bf.close();
for (int i = 1; i < map.size(); i++) {
	String key=String.valueOf(i);
	String value=map.get(key);
	bw.write(key+"."+value);
	bw.newLine();
}
bw.close();
	}

}
