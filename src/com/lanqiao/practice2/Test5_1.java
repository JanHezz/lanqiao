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
	        	
	            c.set(a, i,13);//0表示1月，11表示12月  
	            
	            if (c.get(Calendar.DAY_OF_WEEK) == 6)//1表示周日...6表示周五，7表示周六  
	                sum++;  
	        }  
	        System.out.println(sum);  
	    }  

}
