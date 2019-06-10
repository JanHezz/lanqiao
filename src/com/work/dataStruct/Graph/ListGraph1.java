package com.work.dataStruct.Graph;

public class ListGraph1 {
	   Vertex[] vertexLists;//邻接表数组
	    int size;
	    boolean direct=false;
	    public ListGraph1(char[] vertexs,char[][] edges,boolean direct){
            this.direct=direct;
	        size=vertexs.length;
	        this.vertexLists=new Vertex[size];//确定邻接表大小
	        //设置邻接表头节点
	        for(int i=0;i<size;i++){
	            this.vertexLists[i]=new Vertex(vertexs[i]);
	        }
	        //存储边信息
	        for(char[] c:edges){
	           int p1=getPosition(c[0]);
	           vertexLists[p1].add(c[1]);
	           if (!direct) {
				int p2=getPosition(c[1]);
	           vertexLists[p2].add(c[0]);
			}
	           
	        }

	    }

	    //跟据顶点名称获取链表下标
	    private int getPosition(char ch) {
	        for(int i=0; i<size; i++)
	            if(vertexLists[i].ch==ch)
	                return i;
	        return -1;
	    }

	    //遍历输出邻接表
	    public void print(){
	       for(int i=0;i<size;i++){
	           Vertex temp=vertexLists[i];
	           while(temp!=null){
	               System.out.print(temp.ch+" ");
	               temp=temp.next;
	           }
	           System.out.println();
	       }
	    }
	

	
	

	class  Vertex
	{
	 Vertex next;
	 char ch;

     Vertex(char ch){//初始化方法
         this.ch=ch;
     }
     void add(char ch){//加到链表尾
         Vertex node=this;
         while(node.next!=null){
             node=node.next;
         }
         node.next=new Vertex(ch);
     }
		
	}
	
}

