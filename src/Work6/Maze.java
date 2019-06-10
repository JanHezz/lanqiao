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
int[][] next = new int[][] { //����->��->��->�ϵ�˳����  
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
//������󳤶�
public int getMaxlength() {
	return Maxlength;
}
//���������
public int getMaxWidth() {
	return MaxWidth;
}
//�����Թ�����
public int[][] getMaze() {
	return maze;
}
public void dfs(int startX,int startY)
{
  int nextX, nextY;  
  int posible;  
  if(startX==endX&&startY==endY) {
	  System.out.println("ִ��");
	  count++;
	  System.out.println(count);
     Show(mark);
     return;
  }  
  for(posible = 0; posible < next.length; posible++) { //����->��->��->�ϵ�˳����  
      nextX = startX + next[posible][1];  
      nextY = startY + next[posible][0];

      if(nextX <0 || nextX >=8|| nextY <0 || nextY >= 10){  //�����߽�  �����¸�λ����һʱ
          continue;  
      } 
      if (maze[nextX][nextY]==3) {
		dfs(nextX, nextY);
		continue;
	}
      if(maze[nextX][nextY] == 0 && mark[nextX][nextY] == 0) {  //���ϰ���δ����߹�  
    	/*  System.out.println("��һ��");
    	  Show(mark);*/
    	  mark[nextX][nextY]=6;
          dfs(nextX, nextY); //�ݹ����, �ƶ�����һ��  
          mark[nextX][nextY]=0;
      }  
      
  }  
  
}
//��ʾ����
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

