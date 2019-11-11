package huangchongliu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class UTF8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file=new File("a.txt");
if (!file.exists()) {
	System.out.println(file.createNewFile());
}
OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
osw.write("Œ“∞Æjava");
osw.close();
	}

}
