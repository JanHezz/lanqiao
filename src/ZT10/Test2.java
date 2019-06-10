package ZT10;

public class Test2 {
	public static void Print(int [][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int [][] a=new int[][]{
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		};
		int [][]copy=new int [a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				copy[j][i]=a[i][j];//行列互换
			}
		}
		Print(copy);
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				copy[i][j]=a[3-j][i];//行变成列
			}
		}
		Print(copy);
	}
	

}
