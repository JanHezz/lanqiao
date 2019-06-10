package Recursion;

public class Test5 {
	//求指定sum的排列组合
	/*err_sum错误的sum
	 * a 详细
	 * k 当前选中的下标
	 * pre_sum当前的和
	 * ischoose 记录选中与否
	 * 
	 */
	public static void F(int err_sum,int [] a,int k,int Pre_sum,boolean[] ischoose)
	{
		if(Pre_sum==err_sum)
		{
			for(int i=0;i<ischoose.length;i++)
			{
				if(ischoose[i])System.out.print(a[i]+" ");
			}
			System.out.println();
			return ;
		}
		if(k>=a.length)return ;
		ischoose[k]=false;//不取
		F(err_sum, a, k+1, Pre_sum, ischoose);
		ischoose[k]=true;//取
		Pre_sum+=a[k];
		F(err_sum, a, k+1, Pre_sum, ischoose);
		Pre_sum-=a[k];
		ischoose[k]=false;//回溯
		
	}
public static void main(String[] args) {
	int a[]=new int[] {3,2,4,3,1};
	//3  2  4 
	//   
	int sum=6;
	boolean[] Ischoose=new boolean[a.length];
	F(6,a,0,0,Ischoose);
}
}
