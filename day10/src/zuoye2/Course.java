package zuoye2;

public class Course {
String couseName;
String teacher;
String student;
public String getCouseName() {
	return couseName;
}
public void setCouseName(String couseName) {
	this.couseName = couseName;
}
public String getTeacher() {
	return teacher;
}
public void setTeacher(String teacher) {
	this.teacher = teacher;
}
public String getStudent() {
	return student;
}
public void setStudent(String student) {
	this.student = student;
}

public static void main(String[] args) {
	Course cs=new Course();
	cs.show();
}
public void show() {
	Teacher tc=new Teacher();
	teacher=tc.name;
	student=tc.st.wrok;
	System.out.println("课程名称："+couseName);
	System.out.println("老师姓名："+teacher);
	System.out.println("到课情况："+student);
}
}
