package com.lanqiao.Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 
 * ��1��ʿ����:����һ��n*m�����̣�����������һ����һ���й�������,���ߵĹ���Ϊ:1.��������  2.��ֻ�������ߡ���N,M ����֮��,�ҳ�һ�������½ǵ����Ͻǵ�·��������:���� N=4,M=4�����:·���ĸ�ʽ:(1,1)->(2,3)->(4,4)����������·��,�����"no"
 * 
 * @author  Jan
 2018��5��16��
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
