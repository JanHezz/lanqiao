package Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test16 {
	public static int f(int line ,int row)
	{
		if (row==0) {
			return 1;
		}
		if (line==row) {
			return 1;
		}
		return f(line-1,row)+f(line-1, row-1);	
	}
	public static void main(String[] args) throws ParseException {
		int [][]a=new int[10][10];
		for(int i=0;i<a.length;i++)
		{
			a[i][0]=1;
			a[i][i]=1;
			for(int j=1;j<i;j++)
			{
				a[i][j]=a[i-1][j]+a[i-1][j-1];
			}
			
		}
	
	for(int i=0;i<a.length-1;i++)
	{
		for(int k=a.length-1;k>i;k--)
		{
			System.out.print("  ");
		}
		for(int j=0;j<=i;j++)
		{
			System.out.print(f(i,j)+"   ");
		}
		System.out.println();
	}
  double f=3.141652;
  Date date=new Date();
  date=new SimpleDateFormat("yyyy-MM-dd").parse("2018-03-12");
  System.out.println(new SimpleDateFormat("yyyyÄêMMÔÂddÈÕ").format(date));
 
	}
}
