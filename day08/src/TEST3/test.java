package TEST3;

public class test {
     
    public static void main(String[] args) {
    	Sun s=new Sun();
    	s.doAnything();
    	Universe u=new Sun();
    	u.doAnything();
    	//����ת������������������ת��
    	Sun S=(Sun)u; 
    	S.shine();
    	S.doAnything();
	}
	
}
