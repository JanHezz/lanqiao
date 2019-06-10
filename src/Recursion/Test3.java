package Recursion;

public class Test3 {
	//求反串
	//s:当前串
	public static String F(String s)
	{
		if (s.length()<=1) return s;
		return F(s.substring(1))+s.charAt(0);
	}

	//求得杨辉三角第 m 层 第 n个元素
	public static int PascalTriangle(int m,int n)
	{
		if(n==0)return 1;//第一列元素为1
		if(m==n)return 1;//最后一个元素为1
		return PascalTriangle(m-1, n)+PascalTriangle(m-1, n-1);
	}
     public static void main(String[] args) {
		System.out.println(F("abcd"));
		for(int j=0;j<10;j++)
		{
		for(int k=9;k>j;k--)
		{
				System.out.print("  ");
		}
		for(int i=0;i<=j;i++)
		{
			System.out.print(PascalTriangle(j, i)+"   ");
		}
		System.out.println();
		}
	}
}
