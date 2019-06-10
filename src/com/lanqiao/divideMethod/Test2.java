package com.lanqiao.divideMethod;

import java.time.Year;

/**
 * 求一元三次方程的解
 * @author  Jan
 2018年5月12日
 *
 */




public class Test2 {
	
	static double f(Double x)
	{
		
   return Math.pow(x, 3)+-5*Math.pow(x, 2)+-4*x+20.0;
		
	}
	
	static Double  begin(Double x1,Double x2)
	{
		if (Math.abs((x1-x2))<=0.001f) {
			return x1;
		}
		double mid=(x1+x2)/2;
		if (f(x1)*f(mid)<=0) {
			return begin(x1, mid);
		}
		else {
			return begin(x2, mid);
		}
		

		
	}

	public static void main(String[] args) {
	 for (int i = -100; i < 100; i++) {
		
		double x1=i,x2=i+1;
		if (f(x1)==0) {
			System.out.println(x1);
		}
		else if (f(x1)*f(x2)<0) {
		  System.out.println(String.format("0.2f%", begin(x1, x2)));
			}
		} 
			
		
		
		 
	}
	   
		
		
	
	}
	




