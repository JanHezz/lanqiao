package com.lanqiao.javac;

import java.util.Scanner;

public class test1 {
	 private static final Scanner input = new Scanner(System.in);  
	                                        //��       б           б         ��         ��           ��          б           б
	    private static final int move[][] = {{1,0},{1,1},{1,-1},{0,1},{0,-1},{-1,0},{-1,1},{-1,-1}};//�˸�����
	    private static final String split = "LANQIAO";  //ƥ����ַ�
	    private static final int arrayWidth = 100;  
	    private static final int arrayHeight = 100;  
	    private static int sum = 0;  
	    public static void main(String[] args){  
	        char[][] data = getCharArrayData(arrayWidth,arrayHeight);  
	            for(int i=0;i<data.length;i++){  
	                for(int j=0;j<data.length;j++){  //����ÿ��Ԫ��
	                    search(data,0,i,j,"",-1);  
	                }  
	            }  
	        System.out.println(sum);  
	        input.close();  
	    }  
	      
	    /** 
	    *   d���������ķ�����ĿҪ������������8���̶��ķ��� 
	    **/  
	    public static void search(char[][] data,int length,int x,int y,String temp,int d){  
	        if(x<0||x>arrayWidth-1||y<0||y>arrayHeight-1){  //�����߽�
	            return;  
	        }  
	        if(split.charAt(length) != data[x][y]){  //��һ���ǲ�����Ҫƥ����ַ�
	            return;  
	        }  
	        temp = temp + data[x][y];  
	        if(temp.equalsIgnoreCase(split)){ //ƥ�䵽�˽��
	            sum = sum + 1;  
	            return;  
	        }  
	        if(length == split.length()){  
	            return;  
	        }  
	        if(d==-1){  //�Ƿ��һ�εݹ��ǵĻ��а˸�����
	            for(int i=0;i<8;i++){  
	                search(data,length+1,x+move[i][0],y+move[i][1],temp,i);  
	            }  
	        }else{  //���ǵ�һ������֮ǰ�ķ�����
	            search(data,length+1,x+move[d][0],y+move[d][1],temp,d);  
	        }  
	    }  
	      
	    public static char[][] getCharArrayData(int x,int y){  
	        char[][] array = new char[x][y];  
	        for(int i=0;i<x;i++){  
	            String temp = input.next();  
	            for(int j=0;j<y;j++){  
	                array[i][j] = temp.charAt(j);  
	            }  
	        }  
	        return array;  
	    }  
	      
}
