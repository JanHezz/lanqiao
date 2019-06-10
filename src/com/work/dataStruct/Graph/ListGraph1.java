package com.work.dataStruct.Graph;

public class ListGraph1 {
	   Vertex[] vertexLists;//�ڽӱ�����
	    int size;
	    boolean direct=false;
	    public ListGraph1(char[] vertexs,char[][] edges,boolean direct){
            this.direct=direct;
	        size=vertexs.length;
	        this.vertexLists=new Vertex[size];//ȷ���ڽӱ��С
	        //�����ڽӱ�ͷ�ڵ�
	        for(int i=0;i<size;i++){
	            this.vertexLists[i]=new Vertex(vertexs[i]);
	        }
	        //�洢����Ϣ
	        for(char[] c:edges){
	           int p1=getPosition(c[0]);
	           vertexLists[p1].add(c[1]);
	           if (!direct) {
				int p2=getPosition(c[1]);
	           vertexLists[p2].add(c[0]);
			}
	           
	        }

	    }

	    //���ݶ������ƻ�ȡ�����±�
	    private int getPosition(char ch) {
	        for(int i=0; i<size; i++)
	            if(vertexLists[i].ch==ch)
	                return i;
	        return -1;
	    }

	    //��������ڽӱ�
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

     Vertex(char ch){//��ʼ������
         this.ch=ch;
     }
     void add(char ch){//�ӵ�����β
         Vertex node=this;
         while(node.next!=null){
             node=node.next;
         }
         node.next=new Vertex(ch);
     }
		
	}
	
}

