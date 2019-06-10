package Practice;

import java.util.Scanner;

public class Test21 {
	
	public static void F(int [][] grid,int startx,int starty,String dir,int k )
	{ 
		
		if (k==0) {
			System.out.println(startx+"  "+starty);
			return ;
		}
		int dire=Judge(dir);
		switch (dire) {
		case 1://ио
			if (grid[startx][starty]==1) {
				grid[startx][starty]=0;
				dir="R";
				F(grid, startx, starty+1, dir, k-1);
			}
			else {
				grid[startx][starty]=1;
				dir="L";
				F(grid, startx, starty-1, dir, k-1);
			}
			break;
		case 2://об
			if (grid[startx][starty]==1) {
				grid[startx][starty]=0;
				dir="L";
				F(grid, startx, starty-1, dir, k-1);
			}
			else {
				grid[startx][starty]=1;
				dir="R";
				F(grid, startx, starty+1, dir, k-1);
			}
			break;
		case 3://вС
			if (grid[startx][starty]==1) {
				grid[startx][starty]=0;
				dir="U";
				F(grid, startx-1, starty, dir, k-1);
			}
			else {
				grid[startx][starty]=1;
				dir="D";
				F(grid, startx+1, starty, dir, k-1);
			}
			break;
		case 4://ср
			if (grid[startx][starty]==1) {
				grid[startx][starty]=0;
				dir="D";
				F(grid, startx+1, starty, dir, k-1);
			}
			else {
				grid[startx][starty]=1;
				dir="U";
				F(grid, startx-1, starty, dir, k-1);
			}
			break;

		default:
			break;
		}
		
		
		
		
		
	}
	public static int Judge(String s)
	{
		if (s.equals("U")) {
			return 1;
		}
		else if (s.equals("D")) {
			return 2;
		}else if (s.equals("L")) {
			return 3;
		}
		else if (s.equals("R")) {
			return 4;
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	   int n=input.nextInt();
	   int m=input.nextInt();
	   int grid[][]=new int[n][m];
	   System.out.println(grid.length);
	   System.out.println(grid[0].length);
	   for(int i=0;i<n;i++)
	   {
		   input=new Scanner(System.in);
		   for(int j=0;j<m;j++)
		   {
			   grid[i][j]=input.nextInt();
		   }
	   }
	   int startx,starty,k;
	   String dir;
	   startx=input.nextInt();
	   starty=input.nextInt();
	   dir=input.next();
	   k=input.nextInt();
	  
	   F(grid, startx, starty, dir, k);
	}

}
