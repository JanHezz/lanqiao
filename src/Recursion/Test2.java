package Recursion;

public class Test2 {
	//���
	//ͳ�ƴ�n��ȡm��(���Ż�����)��
	public static int F(int n,int m)
	{
		if (n<m)return 0;//�򲻹���
		if(n==m)return 1;//ʣ����պ���m��
		if(m==0)return 1;//���Ҫ�õ�����Ϊ0
		return F(n-1, m-1)+F(n-1, m);//������ĸ���  һ�����Ǹ���   �������Ǹ���
			//4 2  4 3
		// 3  1  4 2  3  2  3  3   
	}
	
	//ȫ����
	public static void Arrange(char[] a,int start)
	{   
		if(start==a.length-1)//��һ��ݹ鵽ͷʱ���
		{  
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		for(int i=start;i<a.length;i++)
		{
			 char temp=a[start];a[start]=a[i];a[i]=temp; //����
			 Arrange(a, start+1);
			 temp=a[start];a[start]=a[i];a[i]=temp;//����
			
		}
	}
	//�ж���ͬ������ʱ
	//ע�������еĸ����� �м�ɼ������˳������ͬ���ַ�
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
