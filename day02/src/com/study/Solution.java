package com.study;

 public class Solution {
    static int num;
    static boolean pd=false;
    static int[] nums={4,1,2,1,2,4,5};
    public static void main(String[] args) {

        singleNumber(nums);
	}
    public static int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
               if(nums[i]==nums[j]&&i!=j){
                   pd=true;    
               } 
            }
            System.out.println(pd);
            if(pd==false){
                num=nums[i];
            }
            pd=false;
        }
		return num;
    }
}