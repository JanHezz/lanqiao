package com.lanqiao.Search;

/**
 *筛法求素数
 *先去掉2的倍数，再去掉3的倍数，再去掉4的倍数，……依此类推，最后剩下的就是素数。 
 * @author  Jan
 2018年5月16日
 *
 */
public class Testsieve {
      
static	int [] p=new int [10001];
	

	
	
	public static void main(String[] args) {
		
	
		for(int i=2;i<=10000;i++)
		{
	     p[i]=1;
		}
		for (int i = 2; i <=10000; i++) {
			if (p[i]==1) {
				
				for(int j=2;i*j<10000;j++)
				{
					p[i*j]=0;
				}
			}
		}
		int sum=0;
		for (int i = 2; i < 10000; i++) {
			sum+=p[i];
		}
		System.out.println(sum);
		
	}
}
	

