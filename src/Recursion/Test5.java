package Recursion;

public class Test5 {
	//��ָ��sum���������
	/*err_sum�����sum
	 * a ��ϸ
	 * k ��ǰѡ�е��±�
	 * pre_sum��ǰ�ĺ�
	 * ischoose ��¼ѡ�����
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
		ischoose[k]=false;//��ȡ
		F(err_sum, a, k+1, Pre_sum, ischoose);
		ischoose[k]=true;//ȡ
		Pre_sum+=a[k];
		F(err_sum, a, k+1, Pre_sum, ischoose);
		Pre_sum-=a[k];
		ischoose[k]=false;//����
		
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
