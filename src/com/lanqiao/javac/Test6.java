package com.lanqiao.javac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 赢球票

某机构举办球票大奖赛。获奖选手有机会赢得若干张球票。

主持人拿出 N 张卡片（上面写着 1~N 的数字），打乱顺序，排成一个圆圈。
你可以从任意一张卡片开始顺时针数数: 1,2,3.....
如果数到的数字刚好和卡片上的数字相同，则把该卡片收入囊中，从下一个卡片重新数数。
直到再无法收获任何卡片，游戏结束。囊中卡片数字的和就是赢得球票的张数。

比如：
卡片排列是：1 2 3
我们从1号卡开始数，就把1号卡拿走。再从2号卡开始，但数的数字无法与卡片对上，
很快数字越来越大，不可能再拿走卡片了。因此这次我们只赢得了1张球票。

还不算太坏！如果我们开始就傻傻地从2或3号卡片数起，那就一张卡片都拿不到了。

如果运气好，卡片排列是 2 1 3
那我们可以顺利拿到所有的卡片！

本题的目标就是：已知顺时针卡片序列。
随便你从哪里开始数，求最多能赢多少张球票（就是收入囊中的卡片数字之和）

输入数据：
第一行一个整数N(N<100)，表示卡片数目
第二行 N 个整数，表示顺时针排列的卡片

输出数据：
一行，一个整数，表示最好情况下能赢得多少张球票

比如：
用户输入：
3
1 2 3

程序应该输出：
1

比如：
用户输入：
3
2 1 3

程序应该输出：
6
 */

public class Test6 {
	public static int max=0;
	public static int Max(List mList)
	{
		int max=0;
		for(int i=0;i<mList.size();i++)
		{
			if ((int)mList.get(i)>max) {
				max=(int)mList.get(i);
			}
		}
		return max;
	}
	/*
	 * 求从第index数开始数能获得的最大值
	 * 
	 * mlist 数据源
	 * index 第几个数
	 * num 报的数
	 * sum  和
	 */
	public static void Dfs(List mList,int index,int num,int sum)
	{
		if (num>Max(mList)) {
			if (sum>=max) {
				max=sum;
			}
			return;
		}
		
		if (mList.size()==0) {
			if (sum>=max) {
				max=sum;
			}
			return ;
		}
		if (index>=mList.size()) {
			index=0;
		}
		if ((int)mList.get(index)==num) {
			sum+=num;
			mList.remove(index);
			Dfs(mList, index, 1, sum);
		}
		else {
			Dfs(mList, index+1, num+1, sum);
		}
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	 int n=0;
	 System.out.println("输入n的大小");
	 n=in.nextInt();
	 List mList=new ArrayList();
	 for(int i=0;i<n;i++)
	 {
		mList.add(in.nextInt());
	 }
		for(int i=0;i<n;i++)
		{  List list=new ArrayList();
			list.addAll(mList);
			Dfs(list, i, 1, 0);
		}
		System.out.println(max);
	}

}
