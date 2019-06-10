package com.lanqiao.practice2;


import java.util.ArrayList;

import java.util.Scanner;

public class Main {
	static int count=0;
static	int [][] grid;
	static void Init(int [][] grid,int x,int y)
	{

		
			for(int i=x-1;i<=x+1;i++)
			{
				for (int j = y-1; j <=y+1; j++) {
					if (i<0||j>=grid.length||i>=grid.length||j<0)continue;
					
					 grid[i][j]=11;
				}
			}	
		}
		
	public static boolean junge(int row,int col)
	{
		if (grid[row][col]==11) {
			return false;
		}
		
		for (int i = 0; i < grid.length; i++) //不能在同一行
		{
			if (grid[row][i]==12) {
				return false;
			}
		}
		for (int i = row,j=col;  i < grid.length&&j<grid.length;  i++,j++)//斜线右下
		{
			if (grid[i][j]==12) {
				return false;
			}
		}
		for (int i = row,j=col;i>=0&&j<grid.length; i--,j++) {//右上
			if (grid[i][j]==12) {
				return false;
			}
		}
		
		for (int i = row,j=col; i >=0&&j>=0; i--,j--)//左上 
		{
			if (grid[i][j]==12) {
				return false;
			}
			
		}
		
		for (int i = row,j=col; i < grid.length&&j>=0; i++,j--)//左下 
		{
			if (grid[i][j]==12) {
				return false;
			}
			
		}
		
		
		return true;
	}
	
	
static void F(int col)//n代表列数
{
    if (col>=grid.length) {
		count++;
		return ;
	} 	
       for (int i = 0; i <grid.length; i++) {
    	   if (junge(i, col)) {
			grid[i][col]=12;
			F(col+1);
			grid[i][col]=0;
		}
    	   
	 }
	
}
	
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt(),x=in.nextInt(),y=in.nextInt();
		
		grid=new int[n][n];
		Init(grid, x-1, y-1);
	
		F(0);
		System.out.println(count);

	}

}


	



