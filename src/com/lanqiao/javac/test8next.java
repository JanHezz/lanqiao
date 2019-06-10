package com.lanqiao.javac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test8next {
 static int k=2;
 static int m=2;
 static int n=3;
 static char[][] mArrachar=new char[3][];
 static List<String>[]  mlist;

 static void delStr(int start,int l,String s,char[] source,List<String> mList)
 {
	 int k=start+l;
	 if (k>source.length) {
		return;
	}
	for (int i = start; i <k; i++) {
		s+=source[i];
	}
   mList.add(s);
 }
 
 
 public static void dfs(int start,int l)
 {
	
	
	 
 }
	public static void main(String[] args) {
		int k=2;
		String a="ATC";
		String b="TCG";
		String c="ACG";
		mlist=new ArrayList[3];
	      mArrachar[0]=a.toCharArray();
	      mArrachar[1]=b.toCharArray();
	      mArrachar[2]=b.toCharArray();
	      for(int i=0;i<3;i++)
	      {
	    	  for(int j=0;j<mArrachar[i].length;i++)
	    		{
	    		  delStr(j, 3, "", mArrachar[i],mlist[i]);
	    		 }
	      }
	     
		
		
	}

}
