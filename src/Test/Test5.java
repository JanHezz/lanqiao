package Test;

public class Test5 {
	public static int Judge(String a,String b)
	{
		if (a.length()==0||b.length()==0) {
			return 0;
		}
		if (a.charAt(0)==b.charAt(0))return Judge(a.substring(1), b.substring(1))+1;
		
		return Math.max(Judge(a, b.substring(1)), Judge(a.substring(1), b));
	}

   /*
    * ��̬�滮lcs�㷨
    * @
    */
	public static int [][] longestCommonSubsequence(String a,String b)
	{
		int [][] Mask=new int [a.length()+1][b.length()+1];//������¼���ȵ�
		for(int i=1;i<=a.length();i++)
		{
			for(int j=1;j<=b.length();j++)
			{
				if (a.charAt(i-1)==b.charAt(j-1)) {
					Mask[i][j]=Mask[i-1][j-1]+1;	//�������ô����ǰһ�����ӵ�ֵ��1				
				}
				else {
					Mask[i][j]=(Mask[i-1][j]>Mask[i][j-1]?Mask[i-1][j]:Mask[i][j-1]);
				}
				
			}
		}
		return Mask;
		
	}
	/*/
	 * a, b��Ӧ���ַ���
	 * mask ����̬�滮����
	 * al��bl�ַ����ĳ���
	 */
	public static void Print(int [][] mask,String a,String b,int aL,int bl)
	{
		if (aL==0||bl==0) {
			return ;
		}
		if (a.charAt(aL-1)==b.charAt(bl-1)) {
			
			Print(mask, a, b, aL-1, bl-1);
			System.out.print(a.charAt(aL-1));
		}
	 else  if (mask[aL][bl]<=mask[aL][bl-1]) {
			Print(mask, a, b, aL, bl-1);
		 }
		else {
			Print(mask, a, b, aL-1, bl);
		}
	}
    	   
       
public static void main(String[] args) {
	String a="bdcaba";
	String b="abcbdab";
	int  [][] re=longestCommonSubsequence(a, b);
	Print(re, a, b, a.length(), b.length());
	System.out.println();
	for(int i=0;i<re.length;i++)
	{
		for(int j=0;j<re[i].length;j++)
		{
			System.out.print(re[i][j]+" ");
		}
		System.out.println();
	}

}
}
