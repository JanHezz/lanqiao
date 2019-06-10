package Recursion;

public class Test1 {
	//计算从begin开始a数组的和
	public static int Add(int [] a,int begin)
	{
		if(begin==a.length) return 0;
		return a[begin]+Add(a, begin+1);
	}
	//计算从end开始a数组的和
		public static int Add1(int [] a,int end)
		{
			if(end<0) return 0;
			return a[end]+Add1(a, end-1);
		}
		// 二分法计算从 A数组 start 到end的和
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
		 // 结果  0      3    // 1  2  2  3  //   结果  4
		                     // 结果 1   2  
			return Add2(a, start, mid)+Add2(a, mid, end); //二分法

	
			
			
		}
	
	//判断两个字符串是不是相等
	public static boolean Judde(String s1,String s2)
	{
		//c  bcd
	
if(s1.length()!=s2.length())return false;//判断长度
if(s1.length()==0)return true;//长度为0表示相等
if (s1.charAt(0)!=s2.charAt(0))return false;//判断首字母

return Judde(s1.substring(1), s2.substring(1));//去除首字母
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

