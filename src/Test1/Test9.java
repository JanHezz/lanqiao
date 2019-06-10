package Test1;

import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class Test9 {
	public static int[][] dir=new int[][] {{0,1},{1,0}}; //��������
	public static long num=0;//����
 /*
  * 04�����ű�   ���⣺�ع�ȡ��
  * 
  * a ����
  * max������������ֵ
  * startx starty ��������λ��
  * k ������������ĸ���
  * you �Լ�ӵ�еĸ���
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
			if (nextx<0||nexty<0||nextx>=a.length||nexty>=a[0].length) //Խ��
			{
				 continue;
			}
			if (max<a[nextx][nexty]) 
			{
				int temp=max;
				//��
				max=a[nextx][nexty];
				Dfs(a, max, nextx, nexty, k, you+1);
				//����
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
	Dfs(s , 0, 0, 0, 2, 0);//û�õ�һ��
	Dfs(s, 1, 0, 0, 2, 1);//���˵�һ��
	System.out.println(num%1000000007);
	
}
}
