package byteliu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file=new File("score.txt");
if (!file.exists()) {
	file.createNewFile();
}
BufferedWriter bw=new BufferedWriter(new FileWriter(file));
bw.write("zhangsan = 90\nlisi = 80\nwangwu = 85\n");
bw.close();
	}

}
