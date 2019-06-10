package com.lanqiao.Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 
 * 例1骑士游历:设有一个n*m的棋盘，在棋盘上任一点有一个中国象棋马,马走的规则为:1.马走日字  2.马只能向右走。当N,M 输入之后,找出一条从左下角到右上角的路径。例如:输入 N=4,M=4，输出:路径的格式:(1,1)->(2,3)->(4,4)，若不存在路径,则输出"no"
 * 
 * @author  Jan
 2018年5月16日
 *
 */

  
public class Depth1 {
	public static int [][] dir=new int[][] {{1,2},{2,1},{1,-2},{2,-1}};
	static void dfs(int startx,int starty,int [][] dir,int grid[][],List<String> s)
	{
		
		if (startx==grid.length-1&&starty==grid[0].length-1) {
			for (int i = 0; i < s.size(); i++) {
				System.out.print(s.get(i));
			}
			System.out.println();
			return ;
		}
		
		for(int i=0;i<dir.length;i++)
		{
			int nextx=startx+dir[i][0];
			int nexty=starty+dir[i][1];
		
			if (nextx>=grid.length||nexty>=grid[0].length||nextx<0||nexty<0){
				continue;
			}       
                    s.add(nextx+"--->"+nexty+"  ");
                    int end=s.size()-1;
					dfs(nextx, nexty, dir, grid,s);
					s.remove(end);
			    	
			
		}
		
	}
	public static void main(String[] args) {
		int grid[][]=new int [4][4];
		
	List<String> s=new ArrayList<String>();
	s.add(0+"--->"+0+" ");
			dfs(0, 0, dir, grid,s);
		
	}
	

}
