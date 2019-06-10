package com.work.dataStruct.Graph;

public class Graph2 {
	
	 char [] vertex;
	 int size;
	 int [][] maxtrix;
	 boolean directed=false;//有向无向
	
	 public Graph2(char[] vertex ,boolean directed)
	 
	 {   this.directed=directed;
		 this.vertex=vertex;
		 size=vertex.length;
		 maxtrix=new int[size][size];
	 }
	 public Graph2(char[] vertex,char[][]edges,boolean directed)
	 {
		 this.directed=directed;
		 this.vertex=vertex;
		 size=vertex.length;
		 maxtrix=new int[size][size];
		  for(char[] c:edges)
		  {
			  int p1=getPostion(c[0]);
			  int p2=getPostion(c[1]);
			  
			  maxtrix[p1][p2]=1;
			  if (!directed) {
				 maxtrix[p2][p1]=1;
			}
			 
			  
		  }
		 
	 }
	 public void setEndges(String va,String vb)
	 {
		  int p1=getPostion(va.toCharArray()[0]);
		  int p2=getPostion(vb.toCharArray()[0]);
		  maxtrix[p1][p2]=1;
		  if (!directed) {
			maxtrix[p2][p1]=1;
		}
		  
	 }
	 //返回是第几个顶点
	 int getPostion(char c)
	 {
		 for(int i=0;i<vertex.length;i++)
		 {
			 if (c==vertex[i]) {
				return i;
			}
		 }
		 return -1;
	 }
	 
	 public void print()
	 {
		 for(int i=0;i<vertex.length;i++)
		 {
			 for(int j=0;j<vertex.length;j++)
			 {
				 System.out.print(maxtrix[i][j]);
			 }
			 System.out.println();
		 }
	 }
	

}
