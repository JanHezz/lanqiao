package Test1;

import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class Test9 {
	public static int[][] dir=new int[][] {{0,1},{1,0}}; //两个方向
	public static long num=0;//次数
 /*
  * 04届蓝桥杯   标题：地宫取宝
  * 
  * a 矩阵
  * max代表手中最大的值
  * startx starty 代表所在位置
  * k 代表符合条件的个数
  * you 自己拥有的个数
  * 
  */
	public static void Dfs(int [][] a,int max,int startx,int startY,int k,int you)
	{
		
		if (you>k) {
			return ;
		}
		if (startx==a.length-1&&startY==a[0].length-1) {
			if (you==k) {
				num++;	
				return;
			}
		}
		for(int i=0;i<dir.length;i++)
		{
			int nextx=startx+dir[i][0];
			int nexty=startY+dir[i][1];
			if (nextx<0||nexty<0||nextx>=a.length||nexty>=a[0].length) //越界
			{
				 continue;
			}
			if (max<a[nextx][nexty]) 
			{
				int temp=max;
				//拿
				max=a[nextx][nexty];
				Dfs(a, max, nextx, nexty, k, you+1);
				//不拿
				max=temp;
				Dfs(a, max, nextx, nexty, k, you);
			 }
			else 
			 {
				Dfs(a, max, nextx, nexty, k, you);
			 }
			}		
		}
		
public static void main(String[] args) {
	int m,n,k;
	Scanner in=new Scanner(System.in);
	m=in.nextInt();
	n=in.nextInt();
	k=in.nextInt();
	int [][] s=new int[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			s[i][j]=in.nextInt();
		}
	}
	Dfs(s , 0, 0, 0, 2, 0);//没拿第一个
	Dfs(s, 1, 0, 0, 2, 1);//拿了第一个
	System.out.println(num%1000000007);
	
}
}
