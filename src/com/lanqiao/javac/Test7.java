package com.lanqiao.javac;

import java.util.Arrays;
import java.util.Scanner;

public class Test7 {
	public static int mNorth[];
	public static int mWest[];
	public static int[][] dir=new int [][] {{0,1},{0,-1},{1,0},{-1,0}};//·½Ïò
	public static Boolean Junge(int[] north,int [] west)
	{
		for(int i=0;i<north.length;i++)
		{
			if (north[i]!=mNorth[i]) {
				return false;
			}
			if (west[i]!=mWest[i]) {
				return false;
			}
		}
		return true;	
	}
	public static void Dfs(int [][]grid,int x,int y,int [][] mask,int[] north,int west[],String path)
	{	
		path+=grid[x][y]+"  ";
	
		if (x==grid.length-1&&y==grid[0].length-1) {
			if (Junge(north, west)) {
				System.out.println(path);
				System.out.println(Arrays.toString(north));
				System.out.println(Arrays.toString(west));
				return;
			}
		}

		for (int i = 0; i < dir.length; i++) {
			int nextx=x+dir[i][0];
			int nexty=y+dir[i][1];
			if (nextx<0||nextx>=grid.length||nexty<0||nexty>=grid[0].length) {
				continue ;
			}
			if (mask[nextx][nexty]!=-1) 
			{
				mask[nextx][nexty]=-1;
				north[nexty]++;
				west[nextx]++;
				Dfs(grid, nextx, nexty, mask, north, west,path);
				mask[nextx][nexty]=grid[nextx][nexty];
				north[nexty]--;
				west[nextx]--;
			}	
		}
	}
	public static void main(String[] args) {
		 int[][] mGrid;
	     int[][] mMask;
	     int num=0;
	     Scanner in=new Scanner(System.in);
	     int n=in.nextInt();
	     mGrid=new int [n][n];
	     mMask=new int [n][n];
	     for(int i=0;i<mGrid.length;i++)
	     {
	    	 for(int j=0;j<mGrid[i].length;j++)
	    	 {
	    		 mGrid[i][j]=num++;
	    	 }
	     }
	     mNorth=new int[n];
	     mWest=new int[n];
	    for(int i=0;i<mNorth.length;i++)
	    {
	    	mNorth[i]=in.nextInt();
	    }
	    for(int i=0;i<mWest.length;i++)
	    {
	    	mWest[i]=in.nextInt();
	    }
	     mMask[0][0]=-1;
	    int []a=new int [n];
	    int []b=new int[n];
	    a[0]=1;
	    b[0]=1;
	    Dfs(mGrid, 0, 0, mMask, a, b, "");
		
	}

}
