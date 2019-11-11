package day20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class testDome {
public static void main(String[] args) {
	ExecutorService service=Executors.newFixedThreadPool(6);
	test ts=new test();
	service.submit(ts);
	service.submit(ts);service.submit(ts);service.submit(ts);service.submit(ts);service.submit(ts);service.submit(ts);service.submit(ts);service.submit(ts);service.submit(ts);service.submit(ts);
}
}
