package zuoye5;

public class player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        player pl=new player();
        pl.select("1");
	}
    public void select(String str) {
    	warrior wr=new warrior();
    	mage mg=new mage();
    	System.out.println("1，武力角色");
    	System.out.println("2，法力角色");
		if (str.equals("1")) {
			wr.specialFight();
		}
		else if (str.equals("2")) {
			mg.specialFight();
		}
	}
}
