package com.lanqiao.practice2;

import java.util.Calendar;
import java.util.Scanner;

public class Test5_1 {
	   public static void main(String[] args) {  
	        Scanner sc = new Scanner(System.in);  
	        int a = sc.nextInt();  
	        int sum = 0;  
	        Calendar c = Calendar.getInstance();  
	        for (int i = 0; i < 12; i++) {  
	        	
	            c.set(a, i,13);//0��ʾ1�£�11��ʾ12��  
	            
	            if (c.get(Calendar.DAY_OF_WEEK) == 6)//1��ʾ����...6��ʾ���壬7��ʾ����  
	                sum++;  
	        }  
	        System.out.println(sum);  
	    }  

}
