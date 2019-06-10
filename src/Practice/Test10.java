package Practice;

import java.util.Scanner;

public class Test10 {
	/*
	 * 移动距离

X星球居民小区的楼房全是一样的，并且按矩阵样式排列。其楼房的编号为1,2,3...
当排满一行时，从下一行相邻的楼往反方向排号。
比如：当小区排号宽度为6时，开始情形如下：

1    2  3   4    5   6
12 11 10  9   8   7
13 14 15 .....

我们的问题是：已知了两个楼号m和n，需要求出它们之间的最短移动距离（不能斜线方向移动）

输入为3个整数w m n，空格分开，都在1到10000范围内
要求输出一个整数，表示m n 两楼间最短移动距离。

	 * 
	 *///row 列   m     n
	public static int F(int row,int m,int n)
	{
		 int distance=0;
		 int hang1=1;
		 int lie1=0;
		 int hang2=1;
		 int lie2=0;
if (m%row==0) {
	hang1=m/row;
}
else {
	hang1=m/row+1;
}
if (n%row==0) {
	hang2=n/row;
}
else {
	hang2=n/row+1;
}
if (hang1%2==0) {
	lie1=row-m%row+1;
	if (m%row==0) {
		lie1=1;
	}
}
else {
	lie1=m%row;
	if (m%row==0) {
		lie2=row;
	}
}
if (hang2%2==0) {
	lie2=row-n%row+1;
	if (n%row==0) {
		lie2=1;
	}
}
else {
	lie2=n%row;
	if (n%row==0) {
		lie2=row;
	}
}
		 distance=Math.abs(lie1-lie2)+Math.abs(hang1-hang2);	 
		System.out.println(hang1+" "+" "+hang2+" "+lie1+" "+lie2);
		return distance;
	}
	 public static int distance(int N, int a, int b){ 
     int i1 = 0; 
	 int i2 = 0; 
	 int j1 = 0; 
	 int j2 = 0; 
 if(a%N != 0) i1 = a/N; 
 else i1 = a/N-1; 
 if(b%N != 0) i2 = b/N;
 else i2 = b/N-1;
 if(i1%2!=0) j1 = a-i1*N-1;
 else j1 = (i1+1)*N-a;
 if(i2%2!=0) j2 = b-i2*N-1;
 else j2 = (i2+1)*N-b; 
 System.out.println(i1+" "+" "+i2+" "+j1+" "+j2);
 int distance = Math.abs(i1-i2) + Math.abs(j1-j2); return distance; }



	
	public static void main(String[] args) {
	
		System.out.println(F(6,8,2));
	}

}
