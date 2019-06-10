package Practice;

public class Test12 {
/**
 * 求两个串的所有子串中能够匹配上的最大长度是多少。
      比如："abcdkkk" 和 "baabcdadabc"，
      可以找到的最长的公共子串是"abcd",所以最大公共子串长度为4。
 */
public static int F(String s1,String s2)
{
	int max=0;
	int[][] a=new int[s1.length()+1][s2.length()+1];
	char[] c1=s1.toCharArray();
	char[]c2=s2.toCharArray();
	for(int i=1;i<=s1.length();i++)
	{
		for(int j=1;j<=s2.length();j++)
		{
			if (c1[i-1]==c2[j-1]) {
				a[i][j]=a[i-1][j-1]+1;
				if (a[i][j]>max) {
					max=a[i][j];
				}
			}
			
		}
	
	}
		return max;
	}
public static void main(String[] args) {
	System.out.println(F("abcdkkk", "baabcdadabck"));
}
 	
}
