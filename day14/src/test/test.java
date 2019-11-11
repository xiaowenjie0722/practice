package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       methread m=new methread();
       new Thread() {

		@Override
		public void run() {
			for (int i = 0; i < 50; i++) {
            m.subthread();
			}
		}
    	   
       }.start();
       new Thread() {

		@Override
		public void run() {
			for (int i = 0; i < 50; i++) {
            m.maintread();
			}
		}
    	   
       }.start();
	}

}
