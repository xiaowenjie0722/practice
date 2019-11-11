package zuote3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 User us=new User();
		 waiter wt=new waiter();
for (int i = 0; i < 50; i++) {
	us.setId(i+1);
    if (i+1>=10&&i+1<=19) {
		wt.setFilter(1);
		us.setPeople("v1");
	}
    else if (i+1>=20&&i+1<=29) {
		wt.setFilter(2);
		us.setPeople("v2");
	}
    else {
		wt.setFilter(3);
		us.setPeople("v0");
	}
    System.out.println("接待员"+wt.getFilter()+" 用户id:"+us.getId()+" 用户类型"+us.getPeople());
}
	}

}
