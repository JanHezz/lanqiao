package Test;

public class test4 {
	public static int F(int row,int col)
	{
		if (col==0) {
			return 1;
		}
		if (row==col) {
			return 1;
		}
		return F(row-1, col)+F(row-1, col-1);
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(F(i,j)+" ");
			}
			System.out.println();
		}
			
	}

}
