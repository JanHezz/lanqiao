
public class Zt8 {
	public static int f(int in,int out)//in代表等待进栈   out 代表等待出栈
	{
		if (in==0) {//全部进栈了
			return 1;
		}
		if(out==0)//等待出去为0 进一个
		return f(in-1, 1); 
		
		return f(in, out-1)+f(in-1, out+1);
	}         //不进     出去    进来一个   不出去
	public static void main(String[] args) {
		for(int i=1;i<=16;i++)
		{
			System.out.println(i+":"+"  "+f(i, 0));
		}
		
	}

}
