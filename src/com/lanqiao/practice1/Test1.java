package com.lanqiao.practice1;

import java.util.Scanner;

/** 
 * 问题描述 
 *输入一个正整数n，输出n!的值。 
 *其中n!=1*2*3*…*n。 
 * 
 *算法描述 
 *n!可能很大，而计算机能表示的整数范围有限，需要使用高精度计算的方法。使用一个数组A来表示一个大整数a，A[0]表示a的个位，A[1]表示a的十位，依次类推。 
 *将a乘以一个整数k变为将数组A的每一个元素都乘以k，请注意处理相应的进位。 
 *首先将a设为1，然后乘2，乘3，当乘到n时，即得到了n!的值。 
 * 
 *输入格式 
 *输入包含一个正整数n，n<=1000。 
 *输出格式 
 *输出n!的准确值。 
 * 
 *样例输入 
 *10 
 *样例输出 
 *3628800 
 */
public class Test1 {
	  public static void main(String[] args) {  
	        Scanner sc = new Scanner(System.in);  
	        int number = sc.nextInt();  
	        int[] array = new int[10000];  
	        array[0] = 1;  
	       
	        int i, j;  
	        int count = 1;  
	        for (i = 1; i <= number; i++) { 
	        	//每个位置都乘i
	            for (j = 0; j < array.length; j++)array[j] = array[j] * i;         
	            for (j = 0; j < array.length; j++){//循环判断哪里需要进位
	            	
	                if (array[j] > 9) {  //大于9进位
	                    array[j + 1] = array[j + 1] + array[j] / 10;  
	                    array[j] = array[j] % 10;  
	                }  
	                if (array[j] > 0) {  
	                    count = j ;  //最终count的值就代表这个值是几位
	                }  
	            }  
	        }  
	        for (i = count ; i >= 0; i--) {  
	            System.out.print(array[i]);  
	        }  
	    }  

}

