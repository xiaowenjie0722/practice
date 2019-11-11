package TEST3;

public class test {
     
    public static void main(String[] args) {
    	Sun s=new Sun();
    	s.doAnything();
    	Universe u=new Sun();
    	u.doAnything();
    	//向下转型有条件，需先向上转型
    	Sun S=(Sun)u; 
    	S.shine();
    	S.doAnything();
	}
	
}
