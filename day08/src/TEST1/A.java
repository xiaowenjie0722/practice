/* 1. ����ӿ�A����ͨ��Bʵ�ֽӿ�A
  2. A�ӿ��У�������󷽷�showA�� 
  3. A�ӿ��У�����Ĭ�Ϸ���showB��
  4. B���У���дshowA����
  5. �������У�����B����󣬵���showA������showB������
*/
package TEST1;

public interface A {
public abstract void showA();
public default void showB() {
	System.out.println("���Ǹ����");
}
}
