package com.lanqiao.dynamicplanning;

/**
 * 给定两个字符串str1，str2，在给定三个整数ic,dc,rc，分别代表插入，删除和替换一个字符的代价。返回将str1

编辑成str2的代价，比如，str1="abc",str2="adc",ic=5,dc=3,rc=2,从str1到str2，将'b'换成'd'代价最小，所以返回2.
 * @author  Jan
 * 
 * 
 * 
 * a、首先将str1[i-1]删除，变成str1[0...i-2],然后将str1[0...i-2]变成str2[0...j-1],那么dp[i-1][j]就代表从str1[0..i-2]到str2[0...j-1]的最小代价，所以：dp[i][j] = dp[i-1][j]+dc;


b、同理也可以是从str1[0...i-1]变成str2[0...j-2]，然后在插入str2[j-1],dp[i][j-1]就代表从str1[0...i-1]变成str2[0...j-2]的最小大家，所以：dp[i][j] = dp[i][j-1]+ic;


c、如果str[i-1] == str2[j-1],则只需要将str1[0...i-2]变成str2[0...j-2]，此时dp[i][j] = dp[i-1][j-1];


d、如果str1[i-1]!=str2[j-1],则我们只需要将str1[i-1]替换成str2[j-1],此时dp[i][j] = dp[i-1][j-1]+rc;


 2018年5月17日
 *
 */
public class test8 {
	public static void main(String[] args) {
		String str1 = "ab12cd3";  
	    String str2 = "abcdf";	  
	    int m=str1.length();
	    int n=str2.length();
	    int dp[][]=new int [m+1][n+1];//把m变成n
	    
	    int ic=5,dc=3,rc=2;
	    for (int i = 1; i <=m; i++) {
	    	dp[i][0]=dc*i;
	    	
		}
	    for (int i = 1; i <=n; i++) {
			dp[0][i]=ic*i;
		}
	    
	    for(int i=1;i<=m;i++)
	    {
	    	for(int j=1;j<=n;j++)
	    	{
	    		int x=Math.min(dc+dp[i][j-1], ic+dp[i-1][j]);
	    		
	    		if (!str1.substring(i-1, i).equals(str2.substring(j-1, j)))
	    		{
	    			dp[i][j]=Math.min(rc+dp[i-1][j-1],x);
				}
	    		else {
					dp[i][j]=Math.min(dp[i-1][j-1], x);
				}
	    	}	
	    }
	    System.out.println(dp[m][n]);	
	}

}
