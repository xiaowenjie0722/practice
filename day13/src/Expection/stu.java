/*每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
如果老师给学生赋值一个负数,抛出一个自定异常*/

package Expection;

import java.util.Scanner;


public class stu  {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		MyException me=new MyException();
       int stuNum=22;
       String stuName="xxx";
       int stuScore=0;
       Scanner sc=new Scanner(System.in);
       System.out.print("请输入分数:");
       try {
    	   stuScore=sc.nextInt();
    	   me.divide(stuScore);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());	
	}
    finally {
    	if (stuScore>=0) {
    		System.out.println("学号:"+stuNum+" 姓名:"+stuName+" 分数:"+stuScore);
		}
	}  
       
	}

}
