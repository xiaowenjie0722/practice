/*定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，姓名和年龄相同的人看做同一人不存储。*/
package day12;

import java.util.HashSet;


public class Human {
	 String name;
     int age;
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Human hm1=new Human("献祭流",21);
     Human hm2=new Human("哈哈哈",21);
     Human hm3=new Human("献祭流",21);
     Human hm4=new Human("献祭流",15);
     HashSet<Human> human=new HashSet<Human>();
     human.add(hm1);
     human.add(hm2);
     human.add(hm3);
     human.add(hm4);
     for(Human str:human) {
    	 System.out.println(str.name+" "+str.age);
     }
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
