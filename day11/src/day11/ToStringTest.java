package day11;

public class ToStringTest {
	static int i = 1;
    public static void main(String args[]){
        System.out.println("love " + new ToStringTest());
        ToStringTest a = new ToStringTest();
        a.i++;
        System.out.println("me " + a.i);
    }
    public String toString(){
        System.out.print("I ");
        return "java ";
    }

}
