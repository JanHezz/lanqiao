package com.lanqiao.dynamicplanning;

/**
 * 

N位同学站成一排，音乐老师要请其中的(N-K)位同学出列，使得剩下的K位同学排成合唱队形。

合唱队形是指这样的一种队形：设K位同学从左到右依次编号为1，2…，K，他们的身高分别为T1，T2，…，TK， 则他们的身高满足T1<...<Ti>Ti+1>…>TK(1<=i<=K)。

你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形。

 * @author  Jan
 2018年5月16日
 *
 */
public class Test1 {
	
	public static void main(String[] args) {
		
		int n=8;
		int [] a=new int [] {186,186, 150, 200, 160, 130, 197, 220};
		int []up=new int[100];
		int []down=new int[100];
		for(int i=1;i<=n;++i)  
	    {   
	      up[i]=1; 
	    }
		for (int i =1; i <n; i++) {
			for(int j=1;j<i;j++)
			{
				if (a[j]<a[i]) {
					up[i]=up[j]+1;
				}
			}
		}
		for (int i =n-1; i >=1; i--) {
			for(int j=n-1;j>i;j--)
			{
				if (a[j]>a[i]) {
					down[i]=down[j]+1;
				}
			}
		}
		int max=1;
		for (int i = 1; i <=n; i++) {
			
			if ((up[i]+down[i])>max) {
				max=up[i]+down[i];
			}
		}
		System.out.println(max);
				
	}

}
