package Practice;




public class Test27 {
	static int[] num=new int[4];
	public static int count=0;
	//�±���������   ��Ӧ��ֵ���������
	public static int IsLegal(int n)
	{
		for(int i=0;i<n;i++)
		{
			//Math.abs(num[i]-num[n])==Math.abs(n-i))����ж�б�ߵ�
			if (num[i]==num[n]||Math.abs(num[i]-num[n])==Math.abs(n-i)) {
				return 0;
			}
		}
		return 1;
	}
	public static void Serch(int n)
	{
		for(int i=0;i<num.length;i++)
		{   
			num[n]=i;
			if (IsLegal(n)==1) {
				if (n==num.length-1) {
					count++;
				}
				else {
					Serch(n+1);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Serch(0);
		System.out.println(count);
	}

}
