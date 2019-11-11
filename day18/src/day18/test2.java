package day18;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class test2 {
public static void main(String[] args) throws IOException {
	test1 t1=new test1("¡˘¿…", 16);
	File file=new File("a.txt");
	if (!file.exists()) {
		file.createNewFile();
	}
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
	oos.writeObject(t1);
	oos.close();
}
}
