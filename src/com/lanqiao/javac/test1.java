package com.lanqiao.javac;

import java.util.Scanner;

public class test1 {
	 private static final Scanner input = new Scanner(System.in);  
	                                        //下       斜           斜         左         右           上          斜           斜
	    private static final int move[][] = {{1,0},{1,1},{1,-1},{0,1},{0,-1},{-1,0},{-1,1},{-1,-1}};//八个方向
	    private static final String split = "LANQIAO";  //匹配的字符
	    private static final int arrayWidth = 100;  
	    private static final int arrayHeight = 100;  
	    private static int sum = 0;  
	    public static void main(String[] args){  
	        char[][] data = getCharArrayData(arrayWidth,arrayHeight);  
	            for(int i=0;i<data.length;i++){  
	                for(int j=0;j<data.length;j++){  //遍历每个元素
	                    search(data,0,i,j,"",-1);  
	                }  
	            }  
	        System.out.println(sum);  
	        input.close();  
	    }  
	      
	    /** 
	    *   d代表搜索的方向（题目要求，搜索方向是8个固定的方向） 
	    **/  
	    public static void search(char[][] data,int length,int x,int y,String temp,int d){  
	        if(x<0||x>arrayWidth-1||y<0||y>arrayHeight-1){  //超出边界
	            return;  
	        }  
	        if(split.charAt(length) != data[x][y]){  //下一个是不是需要匹配的字符
	            return;  
	        }  
	        temp = temp + data[x][y];  
	        if(temp.equalsIgnoreCase(split)){ //匹配到了结果
	            sum = sum + 1;  
	            return;  
	        }  
	        if(length == split.length()){  
	            return;  
	        }  
	        if(d==-1){  //是否第一次递归是的话有八个方向
	            for(int i=0;i<8;i++){  
	                search(data,length+1,x+move[i][0],y+move[i][1],temp,i);  
	            }  
	        }else{  //不是第一个继续之前的方向找
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
