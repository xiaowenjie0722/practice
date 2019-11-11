/* 1. 定义接口A，普通类B实现接口A
  2. A接口中，定义抽象方法showA。 
  3. A接口中，定义默认方法showB。
  4. B类中，重写showA方法
  5. 测试类中，创建B类对象，调用showA方法，showB方法。
*/
package TEST1;

public interface A {
public abstract void showA();
public default void showB() {
	System.out.println("这是父类的");
}
}
