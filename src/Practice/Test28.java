package Practice;

import java.util.Scanner;

public class Test28 {
	public static int min=100;
	public static void Caculate(int [][] grid,int startX,int StartY,int Sum,int count,int [][] mask)
	{
		
		if (Sum==0) {
			if (count<min) {
				min=count;
				return ;
			}
		}
		if (Sum<0) {
			return ;
		}
		
		
		if (startX>=0&&StartY>=0&&startX<grid.length&&StartY<grid[startX].length) {
			if (mask[startX][StartY]==0) {//寻过的格子就不选了
				
				Sum-=grid[startX][StartY];
				count++;
				mask[startX][StartY]=1;
				Caculate(grid, startX-1, StartY, Sum, count,mask);
				Caculate(grid, startX+1, StartY, Sum, count,mask);
				Caculate(grid, startX, StartY+1, Sum, count,mask);
				Caculate(grid, startX, StartY-1, Sum, count,mask);
				mask[startX][StartY]=0;
			}
				
				
			}
				return ;
		}
	
		
	
	public static void main(String[] args) {
	   int [][] a=new int[3][4];
	   int sum=0;
	   for(int i=0;i<a.length;i++)
	   {
		   Scanner input=new Scanner(System.in);
		   for(int j=0;j<a[i].length;j++)
		   {
			   a[i][j]=input.nextInt();
			   sum+=a[i][j];
			   System.out.print(a[i][j]+"  ");
		   }
		   System.out.println();
	   }
	   System.out.println(sum);
	   Caculate(a, 0, 0, sum/2, 0,new int [3][4]);
	   System.out.println(min);
		/*
		 *  1 1 1 1

1 30 80 2

1 1 1 100
		 */
	}

}
