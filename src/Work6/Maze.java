package Work6;

import java.util.LinkedList;
import java.util.Stack;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Maze {
int min = Integer.MAX_VALUE;  
private	int [][] maze; 
private int Maxlength=0;
private int MaxWidth=0;
private int endX=6;
private int endY=8;
int [][] mark;
int count=0;
int[][] next = new int[][] { //按右->下->左->上的顺序尝试  
    {1, 0},  
    {0, 1},  
    {-1, 0},  
    {0, -1}  
}; 

Stack stack =new Stack();

public void InitMaze()
{
	 this.maze = new int[][]
		 {   {1,1,1,1,1,1,1,1,1,1},
             {1,2,0,1,0,0,0,1,0,1},
             {1,0,0,1,0,0,0,1,0,1},
             {1,0,0,0,0,1,0,0,0,1},
             {1,0,1,1,1,0,0,0,0,1},
             {1,0,0,0,1,0,0,0,0,1},
             {1,0,1,0,0,0,0,1,3,1},
             {1,1,1,1,1,1,1,1,1,1}};
             this.Maxlength=maze.length;
             this.MaxWidth=maze[0].length;
      for (int i = 0; i <4; i++) {
		stack.push(i);
	}      
            
            System.out.println(MaxWidth);
            System.out.println(Maxlength);
             mark=this.maze;
   
	}
//返回最大长度
public int getMaxlength() {
	return Maxlength;
}
//返回最大宽度
public int getMaxWidth() {
	return MaxWidth;
}
//返回迷宫数组
public int[][] getMaze() {
	return maze;
}
public void dfs(int startX,int startY)
{
  int nextX, nextY;  
  int posible;  
  if(startX==endX&&startY==endY) {
	  System.out.println("执行");
	  count++;
	  System.out.println(count);
     Show(mark);
     return;
  }  
  for(posible = 0; posible < next.length; posible++) { //按右->下->左->上的顺序尝试  
      nextX = startX + next[posible][1];  
      nextY = startY + next[posible][0];

      if(nextX <0 || nextX >=8|| nextY <0 || nextY >= 10){  //超出边界  或者下个位置是一时
          continue;  
      } 
      if (maze[nextX][nextY]==3) {
		dfs(nextX, nextY);
		continue;
	}
      if(maze[nextX][nextY] == 0 && mark[nextX][nextY] == 0) {  //非障碍且未标记走过  
    	/*  System.out.println("下一步");
    	  Show(mark);*/
    	  mark[nextX][nextY]=6;
          dfs(nextX, nextY); //递归调用, 移动到下一格  
          mark[nextX][nextY]=0;
      }  
      
  }  
  
}
//显示数组
public static void Show(int [] [] a)
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

}

