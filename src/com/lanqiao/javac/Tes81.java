package com.lanqiao.javac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Tes81 {
   static int n,m,k,ans=0;
   static int mod=1000000007;
   static String[]S,num;
   static int[] start;
  
   static HashSet<String> result = new HashSet<String>();


   static void dfs(int ind ){
       if(ind==n){

           ArrayList<String> set = new ArrayList<String>();
           StringBuffer[] s = new StringBuffer[n];
           for(int i = 0;i < n;i++)
               s[i] = new StringBuffer("");
           for(int i = 0;i < n;i++) {
               if(!num[i].equals("")) {
                   if(!set.contains(num[i])) {
                       set.add(num[i]);
                       s[set.size() - 1].append(i);
                       s[set.size() - 1].append(start[i]);
                   } else {
                       int j = set.indexOf(num[i]);
                       s[j].append(i);
                       s[j].append(start[i]);
                   }
               }
           }

           for(int i = 0;i < n;i++) {
               if(s[i].toString().length() == m * 2) {
                   if(!result.contains(s[i].toString())){

                       ans = (ans + 1) % mod;
                       result.add(s[i].toString());

                   }
               }
           }

           return;
       }
       String str=S[ind];
       num[ind]="";
       dfs(ind+1);
       for(int i=0;(i+k)<=str.length();i++){
           String tmp=str.substring(i,i+k);
           num[ind]=tmp;
           start[ind] = i;
           dfs(ind+1);
       }
   }
   public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
     n = in.nextInt();
     m = in.nextInt();
     k = in.nextInt();
     S = new String[n];
     start=new int[n];
     for(int i = 0;i < n;i++)
         S[i] = in.next();

     num=new String[n];
    dfs(0);
    System.out.println(ans);
}
}
