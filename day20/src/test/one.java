package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class one {
public static void main(String[] args) {
	ExecutorService service=Executors.newFixedThreadPool(2);
	two two=new two();
	three three=new three();
	for (int i = 0; i < 1000; i++) {
		service.submit(two);
		service.submit(three);
	}
	
	
}
}
