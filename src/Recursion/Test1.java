package Recursion;

public class Test1 {
	//�����begin��ʼa����ĺ�
	public static int Add(int [] a,int begin)
	{
		if(begin==a.length) return 0;
		return a[begin]+Add(a, begin+1);
	}
	//�����end��ʼa����ĺ�
		public static int Add1(int [] a,int end)
		{
			if(end<0) return 0;
			return a[end]+Add1(a, end-1);
		}
		// ���ַ������ A���� start ��end�ĺ�
		public static int Add2(int [] a,int start,int end)
		{
			int mid=(start+end)/2;
		 if (mid<=start) {//
			
			 return a[start];
		}
	     //start    end
		 //0         5
		 //0   3      3      5
		 // 0  1    3  4          1      3             4 5 
		 // ���  0      3    // 1  2  2  3  //   ���  4
		                     // ��� 1   2  
			return Add2(a, start, mid)+Add2(a, mid, end); //���ַ�

	
			
			
		}
	
	//�ж������ַ����ǲ������
	public static boolean Judde(String s1,String s2)
	{
		//c  bcd
	
if(s1.length()!=s2.length())return false;//�жϳ���
if(s1.length()==0)return true;//����Ϊ0��ʾ���
if (s1.charAt(0)!=s2.charAt(0))return false;//�ж�����ĸ

return Judde(s1.substring(1), s2.substring(1));//ȥ������ĸ
	}
	public static void main(String[] args) {
	     System.out.println(Judde("abc", "abcd"));
	    System.out.println(Judde("abc", "abc"));
	   /*	int [] a=new int [] {0,1,2,3,4};
	    	System.out.println(Add(a, 0));
	    	System.out.println(Add1(a, a.length-1));
	    	System.out.println(Add2(a, 0,a.length));*/
	}

}

