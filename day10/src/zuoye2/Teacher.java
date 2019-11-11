package zuoye2;

public class Teacher {
 String name;
 Student st=new Student();
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
 public void countName() {
	
	st.setName("小明");
	
	st.setWrok("今日未出勤");
	
	System.out.println(st.name+st.wrok);	
	
}
}
