package com.lanqiao.practice1;

import java.util.Scanner;

/** 
 * �������� 
 *����һ��������n�����n!��ֵ�� 
 *����n!=1*2*3*��*n�� 
 * 
 *�㷨���� 
 *n!���ܴܺ󣬶�������ܱ�ʾ��������Χ���ޣ���Ҫʹ�ø߾��ȼ���ķ�����ʹ��һ������A����ʾһ��������a��A[0]��ʾa�ĸ�λ��A[1]��ʾa��ʮλ���������ơ� 
 *��a����һ������k��Ϊ������A��ÿһ��Ԫ�ض�����k����ע�⴦����Ӧ�Ľ�λ�� 
 *���Ƚ�a��Ϊ1��Ȼ���2����3�����˵�nʱ�����õ���n!��ֵ�� 
 * 
 *�����ʽ 
 *�������һ��������n��n<=1000�� 
 *�����ʽ 
 *���n!��׼ȷֵ�� 
 * 
 *�������� 
 *10 
 *������� 
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
	        	//ÿ��λ�ö���i
	            for (j = 0; j < array.length; j++)array[j] = array[j] * i;         
	            for (j = 0; j < array.length; j++){//ѭ���ж�������Ҫ��λ
	            	
	                if (array[j] > 9) {  //����9��λ
	                    array[j + 1] = array[j + 1] + array[j] / 10;  
	                    array[j] = array[j] % 10;  
	                }  
	                if (array[j] > 0) {  
	                    count = j ;  //����count��ֵ�ʹ������ֵ�Ǽ�λ
	                }  
	            }  
	        }  
	        for (i = count ; i >= 0; i--) {  
	            System.out.print(array[i]);  
	        }  
	    }  

}

