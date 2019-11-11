/* 模拟在一副牌中，抽取第1张，第5张，第50张扑克牌。*/
package day04;

import java.util.Random;

public class zuoye2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pk = new String[52];
		int[] num = new int[13];
		String[] design = { "方块", "梅花", "黑桃", "红桃" };
		// 创建52张牌
		int k = 0;
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 13; i++) {
				pk[k] = design[j]+(i + 1) ;
				k++;
			}
		}
		
        //随机洗牌
		Random rd = new Random();
		int sjs;
		String temp;
		for(int i = 0;i<52;i++) {
			sjs = rd.nextInt(52); //获取一个随机数			
			temp = pk[sjs];
			pk[sjs] = pk[i];
			pk[i] = temp;    ///将第i张牌 与随机数（sjs）那张牌进行一次交换
		
		}
		System.out.println("第1张牌是："+pk[0]);
		System.out.println("第5张牌是："+pk[4]);
		System.out.println("第50张牌是："+pk[49]);
		
	}
}
