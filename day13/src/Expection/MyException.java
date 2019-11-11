package Expection;

public class MyException extends Exception{
public MyException() {
	super();
}
public MyException(String message) {
	super(message);
}
public int divide(int a) throws MyException {
	if (a<0) {
		throw new MyException("错误!分数不能为负数");
	}
	else {
		return a;
	}
}

}
