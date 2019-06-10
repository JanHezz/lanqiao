package work7;

public class Test3 {
	//递归做加法加y次
public static int Muti(int x,int y)
{   //结束条件y==1时
	if (y==1) {
		return x;		
	}
	if (y==0) {
		return 0;
	}//3
	return x+Muti(x, y-1);//y-1

	}
public static void main(String[] args) {
	System.out.println(Muti(4, 4));
}
}
