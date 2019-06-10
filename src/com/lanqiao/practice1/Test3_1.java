package com.lanqiao.practice1;

import java.util.ArrayList;
import java.util.List;
/**
 * 2.题目分析

　　1.砝码重量都是三的次方，故先转为3进制数

　　2.由于每个砝码只有一个，故当有为2的数时，可将本位变为-1，然后前一位+1。

　　3.遍历所有的位，使得没有哪一位的值为2.
 * @author  Jan
 2018年5月18日
 *
 */
public class Test3_1 {
	public static void main(String[] args) {
     int weight[]=new int [] {1,3,9,27,81};	
     
     int n=5;
     char [] num=Integer.toString(19, 3).toCharArray();
   
     System.out.println(Integer.toString(19, 3));
    List<Integer> list=new ArrayList<Integer>();
     for (int i =num.length-1;i>=0; i--){
    	 if (num[i]=='2') {
			if (i==0) {
				list.add(-1);
				list.add(1);
			}
			else {
				list.add(-1);
				num[i-1]+=1;	
			}
		}
    	 else {
			list.add(num[i]-'0');
		}
	}
    StringBuffer sb=new StringBuffer();
     for (int i =list.size()-1; i >=0; i--) {
			if (list.get(i)<0) {
				sb.append(weight[i]*list.get(i)+"");
			}
			if (list.get(i)>0) {
				sb.append("+"+weight[i]*list.get(i));
			}	 
	}
     sb.deleteCharAt(0);
     System.out.println(sb.toString());
     
     
		
	}

}
