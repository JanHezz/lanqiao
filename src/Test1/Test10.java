package Test1;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test10 {
	public static  void init(int [][] a)
	{
		for(int i=1;i<a.length;i++)
		{
			for(int j=1;j<a[i].length;j++)
			{
				a[i][j]=1;
			}
		}
		
	}
	public static  void print(int [][] a)
	{
		for(int i=1;i<a.length;i++)
		{
			for(int j=1;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}
	public static void Q(int [][] a,int x,int y)
	{
		
		for(int i=1;i<a.length;i++)
		{   
			int hang=i*x;
			if (hang>=a.length) {
				continue;
			}
			for(int k=1;k<a[i].length;k++)
			{   int lie=k*y;
			  if (lie>=a[i].length){
			    	continue ;
			     }
			 if (a[hang][lie]==1) {
				  a[hang][lie]=0;
			     }
			 else {
				a[hang][lie]=1;
			   }
		    }
		}
	}
	public static void Began(int [][ ] a)
	{
		for(int i=1;i<a.length;i++)
		{
			for (int j = 1; j < a[0].length; j++) {
				Q(a, i, j);
			}
		}
	}
	public static int judge(int[][] a)
	{
         int count=0;
		for(int i=1;i<a.length;i++)
		{
			for (int j = 1; j < a[0].length; j++) {
				if (a[i][j]==0) {
					count++;
				}
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int [][] a=new int[n+1][m+1];
		init(a);
		Began(a);
		System.out.println(judge(a));
	    
	   
		
		
	}
	
/*	private static BigInteger sqrt(BigInteger n) { 
		   if (n.compareTo(new BigInteger("3"))==0) {//3是特殊情况
			return new BigInteger("1");
		}
        BigInteger two = BigInteger.valueOf(2);  
        BigInteger prv = n.divide(two); 
        BigInteger now = prv.add(n.divide(prv)).divide(two);  
     
        while (prv.compareTo(now) > 0) {  
            prv = now;  
            now = prv.add(n.divide(prv)).divide(two);  
        }  
        System.out.println(now);
       return now;  
    
    }  
    public static void main(String[] args) {  
    	
        Scanner sc = new Scanner(System.in);  
        BigInteger n = sqrt(sc.nextBigInteger());  
        BigInteger m = sqrt(sc.nextBigInteger());  
        System.out.println(n.multiply(m));  
    }  */

}
