package com.lanqiao.practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i=0;
		List<Integer> data=new ArrayList<Integer>();
		List<Integer> list=new ArrayList<Integer>();
		while(n-->0)
		{
			int num=in.nextInt();
			if (num==-1) {
				Collections.sort(list);
				data.add(list.get(i));
				i++;
			}
			else {
				list.add(num);
			}
	
		}
		for (Integer integer : data) {
			System.out.println(integer);
		}
	}

}
