package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class test3 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
ObjectInputStream ois=new ObjectInputStream(new FileInputStream("a.txt"));
test1 e=(test1)ois.readObject();
System.out.println(e.name+e.age);
	}

}
