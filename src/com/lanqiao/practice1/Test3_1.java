package com.lanqiao.practice1;

import java.util.ArrayList;
import java.util.List;
/**
 * 2.��Ŀ����

����1.���������������Ĵη�������תΪ3������

����2.����ÿ������ֻ��һ�����ʵ���Ϊ2����ʱ���ɽ���λ��Ϊ-1��Ȼ��ǰһλ+1��

����3.�������е�λ��ʹ��û����һλ��ֵΪ2.
 * @author  Jan
 2018��5��18��
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
