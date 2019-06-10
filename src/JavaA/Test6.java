package JavaA;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
	/* 蓝桥杯
	 * 牌型种数
	 * JavaA组
	 */
	public static int count=0;
	public static void Dfs(int type,int num)
	{
		if (type>14) {//牌型只有13种
			return;
		}
		if (num>13) {
			return;
		}
		if (num==13) {
			count++;
			return;
		}
		for(int i=0;i<=4;i++)//没个牌型只有四张
		{
			Dfs(type+1, num+i);//type牌型  num表示收中的排数 
		}
	}
	public static void main(String[] args) {
		Dfs(1, 0);//第一种牌型 
      System.out.println(count);	  
	}

}
