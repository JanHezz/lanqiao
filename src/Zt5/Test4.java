package Zt5;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Test4 {
	public static char [] next=new char[] {'-','1'};//两个方向
	public static Character[][] innitial =new Character[3][4];
		public static int count=0;
		public static int min=100;
		public static int min_x=0, min_y=0;
		public static char m=' ';
		public static boolean right,left,top,bootom;
		public static boolean IsLegal(char c,int i,int j)//判断下一步是否合理
		{
			if (c=='-') {//如果是-这一行是否合理
				for(int k=j+1;k<4;k++)
				{
              if (innitial[i][k]=='1')
               {
			  		right=true;	
			     	break;
			   }
					if (innitial[i][k]=='-') {
						right=false;
						return false;
					}
				}
				for(int k=j-1;k>=0;k--)
				{
              if (innitial[i][k]=='1')
               {
			  	   left=true;	
			  		break;
               }
					if (innitial[i][k]=='-') {
						left=false;
						return false;
					}
				}
				return true;
			}
			if (c=='1') {//如果是1这一列是否合理
				for(int k=i+1;k<3;k++)
				{
					if (innitial[k][j]=='-') {
						top=true;
						break;
					}
					if (innitial[k][j]=='1') {
						top=false;
						return false;
					}
				}
				for(int k=i-1;k>=0;k--)
				{
					if (innitial[k][j]=='-') {
						bootom=true;
						break;
					}
					if (innitial[k][j]=='1') {
						bootom=false;
						return false;
					}
				}
			}
			return true;
		}
		
		public static void Junge()//列举出对手的能走所有步数
		{
			for(int i=0;i<innitial.length;i++)
			{
				for(int j=0;j<innitial[i].length;j++)
				{
					if (innitial[i][j]=='0') {
						for(int k=0;k<next.length;k++)
						{
							if (IsLegal(next[k], i, j)) {//合理count++
								count++;
							}
						}
						
					}
				}
			}
		}
	public static void Search()//模拟自己所有能走的步数
	{
		
		for(int i=0;i<innitial.length;i++)
		{
			for(int j=0;j<innitial[i].length;j++)
			{
				if (innitial[i][j]=='0') {
					for(int k=0;k<next.length;k++)
					{
						if (IsLegal(next[k], i, j)){//如果自己的这一步合理
							innitial[i][j]=next[k];//赋值
							 Junge();//列举对手的所有可能性
							if (min>count) {//记录第一步与最小步数
								min=count;
								min_x=i;
								min_y=j;
								m=next[k];	
							}
						}
						innitial[i][j]='0';//回溯
						count=0;
					}		
				}
			}
		}
		if (m==' ') {
			System.out.println("无解");
		}
		else {
			System.out.println(min_x+" "+min_y+" "+m);
			
		}	
		min=1000;
	}
	//
	public static void Print(Character[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print(a[i][j]);
			
			}
			System.out.println();
		}
	}
	public static void Start(List<Character[][]> list)
	{
		for (Character[][] character : list) {
		     
			for(int i=0;i<character.length;i++)
			{
				for(int j=0;j<character[i].length;j++)
				{
					innitial[i][j]=character[i][j];//给需要寻找的数组赋值
				
				}
			}
      Search();//赋值之后开始运行
			
		}
	}

	public static void main(String [] args)
	{
		List<Character[][]> list=new ArrayList<Character[][]>();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入n的大小");
		int n=input.nextInt();
		while(n>0)
		{
			Character[][] a=new Character[3][4];
			for (int i = 0; i < a.length; i++) {
			 input=new Scanner(System.in);
			 String	s=input.nextLine();
				for (int j = 0; j < s.length(); j++) {
					a[i][j]=s.charAt(j);
				}
			}
			list.add(a);
			n--;
		}
		Start(list);
		
		
	}

}
