package Work9;

public class Test2 {
	public static int num=1;
	/*
	 *  n 代表盘子的个数
	 *  A B C分别是三个轮盘 
	 * 
	 */
	//把编号为n盘子由 A 移像C
	public static void F(int n,char A,char B,char C)
	{   if (n==1) {//只有一个盘子时移动
		System.out.println("第"+(num++)+"次移动"+"把"+n+"号圆盘"+"由"+A+"移去"+C);
	}
	else {
		//把n-1个数移到b盘
		F(n-1, A, C, B);
		//把第n个盘子移去C
		System.out.println("第"+(num++)+"次移动"+"把"+n+"号圆盘"+"由"+A+"移去"+C);
		//把n-1个盘子由B移去C
		 F(n-1,B,A,C);
		
	}
	
		
	}
	public static void main(String[] args) {
		F(3,'A','B','C');
	}

}
