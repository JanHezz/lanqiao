package Recursion;

public class Test2 {
	//组合
	//统计从n个取m个(不放回无序)的
	public static int F(int n,int m)
	{
		if (n<m)return 0;//球不够摸
		if(n==m)return 1;//剩余球刚好是m个
		if(m==0)return 1;//如果要拿的球数为0
		return F(n-1, m-1)+F(n-1, m);//特殊球的概念  一定拿那个球   跟不拿那个球
			//4 2  4 3
		// 3  1  4 2  3  2  3  3   
	}
	
	//全排列
	public static void Arrange(char[] a,int start)
	{   
		if(start==a.length-1)//当一层递归到头时输出
		{  
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		for(int i=start;i<a.length;i++)
		{
			 char temp=a[start];a[start]=a[i];a[i]=temp; //交换
			 Arrange(a, start+1);
			 temp=a[start];a[start]=a[i];a[i]=temp;//回溯
			
		}
	}
	//判断相同子序列时
	//注：子序列的概念是 中间可间隔按照顺序来相同的字符
	public static int Judge(String s1,String s2)
	{
		if (s1.length()==0||s2.length()==0)return 0;
		if(s1.charAt(0)==s2.charAt(0)) return Judge(s1.substring(1 ), s2.substring(1))+1;
		else {
			return Math.max(Judge(s1, s2.substring(1)), Judge(s1.substring(1), s2));
		}
	}
	public static void main(String[] args) {
		System.out.println(F(5,3));
		
	char[] a	="abc".toCharArray();
	Arrange(a, 0);
	System.out.println(Judge("acbx", "bacdsbdsx"));
	}

}
