package com.lanqiao.practice1;

public class Tets3_2 {
	static int k=5;
 static	int [] sign=new int [] {0,1,-1};
 static int [] weigt=new int [] {1,3,9,27,81};
	static void DFS(int n,String s,int sum)
	{
		if (n>=5) {
			if (sum==k) {
				System.out.println(s);
			}
			return;
		}
		for (int i = 0; i <sign.length; i++) {
			
			if (i==0) {
				DFS(n+1,s,sum);
			}
			else {
				DFS(n+1, s+""+weigt[n]*sign[i], sum+weigt[n]*sign[i]);
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		
		DFS(0, "", 0);
		
	}

}
