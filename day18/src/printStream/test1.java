package printStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class test1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
PrintStream ps=new PrintStream(new File("b.txt"));
System.setOut(ps);
System.out.println("abxjbaixcbacbiabº∏∞—ÕÊ“‚");
	}

}
