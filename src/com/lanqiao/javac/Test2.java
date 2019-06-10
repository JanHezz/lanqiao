package com.lanqiao.javac;

import javax.swing.plaf.TreeUI;

public class Test2 {
	public static long min(long a,long b,long c)
	{
		long temp=a>b?b:a;
		return temp>c?c:temp;
		
	}
	
	public static void main(String[] args) {
    long[] index=new long[3];//对应数的倍数 0 -3  1-5 2-7
    long [] vc=new long[10000];
               vc[0]=1;
    int temp=1;
 
          for(int i=1;i<vc.length;i++)
          { //取得对应的倍数
        	  long a=3*vc[(int) index[0]];
        	  long b=5*vc[(int) index[1]];
        	  long c=7*vc[(int) index[2]];
        	  long temp1=min(a, b, c);//取得最小值
        	  /*
        	   * 举例说明
        	   * 3  5 7
                 9  5 7
                 9  15 7
                 9  15 21
        	   * 
        	   * 
        	   */
        
        	  if (temp1==a) {//是该数对应的的倍数加一
				index[0]++;
        	  }
			 if(temp1==b) {
				index[1]++;
			 }
        	 if (temp1==c) {
				index[2]++;
			}
        	if (String.valueOf(temp1).equals("59084709587505")) {
				System.out.println(temp);
				break;
			}
        	  vc[temp]=temp1;
        	  temp++;
          }
          }
    
	}


