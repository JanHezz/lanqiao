package com.lanqiao.dynamicplanning;

/**
 * ���������ַ���str1��str2���ڸ�����������ic,dc,rc���ֱ������룬ɾ�����滻һ���ַ��Ĵ��ۡ����ؽ�str1

�༭��str2�Ĵ��ۣ����磬str1="abc",str2="adc",ic=5,dc=3,rc=2,��str1��str2����'b'����'d'������С�����Է���2.
 * @author  Jan
 * 
 * 
 * 
 * a�����Ƚ�str1[i-1]ɾ�������str1[0...i-2],Ȼ��str1[0...i-2]���str2[0...j-1],��ôdp[i-1][j]�ʹ����str1[0..i-2]��str2[0...j-1]����С���ۣ����ԣ�dp[i][j] = dp[i-1][j]+dc;


b��ͬ��Ҳ�����Ǵ�str1[0...i-1]���str2[0...j-2]��Ȼ���ڲ���str2[j-1],dp[i][j-1]�ʹ����str1[0...i-1]���str2[0...j-2]����С��ң����ԣ�dp[i][j] = dp[i][j-1]+ic;


c�����str[i-1] == str2[j-1],��ֻ��Ҫ��str1[0...i-2]���str2[0...j-2]����ʱdp[i][j] = dp[i-1][j-1];


d�����str1[i-1]!=str2[j-1],������ֻ��Ҫ��str1[i-1]�滻��str2[j-1],��ʱdp[i][j] = dp[i-1][j-1]+rc;


 2018��5��17��
 *
 */
public class test8 {
	public static void main(String[] args) {
		String str1 = "ab12cd3";  
	    String str2 = "abcdf";	  
	    int m=str1.length();
	    int n=str2.length();
	    int dp[][]=new int [m+1][n+1];//��m���n
	    
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
