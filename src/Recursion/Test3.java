package Recursion;

public class Test3 {
	//�󷴴�
	//s:��ǰ��
	public static String F(String s)
	{
		if (s.length()<=1) return s;
		return F(s.substring(1))+s.charAt(0);
	}

	//���������ǵ� m �� �� n��Ԫ��
	public static int PascalTriangle(int m,int n)
	{
		if(n==0)return 1;//��һ��Ԫ��Ϊ1
		if(m==n)return 1;//���һ��Ԫ��Ϊ1
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
