package com.work.dataStruct.test;

public class TestQuene {
	
 static	int isCorrect(int i, int j, int [][]Q)
	  {
	     int s, t;
	      for(s=i,t=0; t<4; t++)
	         if(Q[s][t]==1 && t!=j)
	              return 0;//�ж���
	     for(t=j,s=0; s<4; s++)
	         if(Q[s][t]==1 && s!=i)
	            return 0;//�ж���
	     for(s=i-1,t=j-1; s>=0&&t>=0; s--,t--)
        if(Q[s][t]==1)
	             return 0;//�ж����Ϸ�
	    for(s=i+1,t=j+1; s<4&&t<4;s++,t++)
	         if(Q[s][t]==1)
	             return 0;//�ж����·�
	     for(s=i-1,t=j+1; s>=0&&t<4; s--,t++)
	        if(Q[s][t]==1)
	            return 0;//�ж����Ϸ�
	    for(s=i+1,t=j-1; s<4&&t>=0; s++,t--)
	        if(Q[s][t]==1)
	            return 0;//�ж����·�
	 
	   return 1;//���򷵻�
	 }
 
static void Queue(int j, int [][]Q)
  {
      int i,k;
     if(j==4){//�ݹ��������
          for(i=0; i<4; i++){
                  //�õ�һ���⣬����Ļ����ʾ
             for(k=0; k<4; k++)
                  System.out.print( Q[i][k]);
              System.out.println();
          }
         System.out.println();
          return ;
   }
      for(i=0; i<Q.length; i++){
          if(isCorrect(i, j, Q)==1){//���Q[i][j]���Է��ûʺ�
        	  Q[i][j]=1;
              Queue(j+1, Q);//�ݹ��������������ռ���
              Q[i][j]=0;//���������ʵ�ֻ��ݵ���һ��
          }
      }
  }
	
	public static void main(String[] args) {
	
		int[][] quene=new int [4][4];
		Queue(0, quene);
		
	}
	

}
