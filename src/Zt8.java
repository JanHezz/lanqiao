
public class Zt8 {
	public static int f(int in,int out)//in����ȴ���ջ   out ����ȴ���ջ
	{
		if (in==0) {//ȫ����ջ��
			return 1;
		}
		if(out==0)//�ȴ���ȥΪ0 ��һ��
		return f(in-1, 1); 
		
		return f(in, out-1)+f(in-1, out+1);
	}         //����     ��ȥ    ����һ��   ����ȥ
	public static void main(String[] args) {
		for(int i=1;i<=16;i++)
		{
			System.out.println(i+":"+"  "+f(i, 0));
		}
		
	}

}
