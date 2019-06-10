package com.work.dataStruct.test;

public class TestQuene {
	
 static	int isCorrect(int i, int j, int [][]Q)
	  {
	     int s, t;
	      for(s=i,t=0; t<4; t++)
	         if(Q[s][t]==1 && t!=j)
	              return 0;//判断行
	     for(t=j,s=0; s<4; s++)
	         if(Q[s][t]==1 && s!=i)
	            return 0;//判断列
	     for(s=i-1,t=j-1; s>=0&&t>=0; s--,t--)
        if(Q[s][t]==1)
	             return 0;//判断左上方
	    for(s=i+1,t=j+1; s<4&&t<4;s++,t++)
	         if(Q[s][t]==1)
	             return 0;//判断右下方
	     for(s=i-1,t=j+1; s>=0&&t<4; s--,t++)
	        if(Q[s][t]==1)
	            return 0;//判断右上方
	    for(s=i+1,t=j-1; s<4&&t>=0; s++,t--)
	        if(Q[s][t]==1)
	            return 0;//判断左下方
	 
	   return 1;//否则返回
	 }
 
static void Queue(int j, int [][]Q)
  {
      int i,k;
     if(j==4){//递归结束条件
          for(i=0; i<4; i++){
                  //得到一个解，在屏幕上显示
             for(k=0; k<4; k++)
                  System.out.print( Q[i][k]);
              System.out.println();
          }
         System.out.println();
          return ;
   }
      for(i=0; i<Q.length; i++){
          if(isCorrect(i, j, Q)==1){//如果Q[i][j]可以放置皇后
        	  Q[i][j]=1;
              Queue(j+1, Q);//递归深度优先搜索解空间树
              Q[i][j]=0;//这句代码就是实现回溯到上一层
          }
      }
  }
	
	public static void main(String[] args) {
	
		int[][] quene=new int [4][4];
		Queue(0, quene);
		
	}
	

}
