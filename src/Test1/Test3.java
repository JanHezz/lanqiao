package Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
	public static void Print(char [] s)
	{
		for(int i=0;i<s.length;i++ )
		{
			System.out.print(s[i]);
		}
		System.out.println();
	}
	/*public static void main(String[] args) {
		String msSourse="abcdefghijklmnopqrs";
		char [] mcArray;
	    String msTarget="";
		int count=0;
		while(count<106)//数据初始化
		{
			    msTarget+=msSourse;
				count++;	
		}
		mcArray=msTarget.toCharArray();
		System.out.println(mcArray.length);
		while (mcArray.length>1) {
			char[] a=new char[mcArray.length/2];
		   for(int i=0 , u=0;i<mcArray.length;i++)
		   {
			   if (i%2==0){
				 mcArray[i]='1';
			       }
			   else {
				a[u]=mcArray[i];
				u++;
			 }
		    }
			   if (a.length<=1) {
				   System.out.println(a[0]);
				break ;
			    }
			     mcArray= Arrays.copyOf(a, a.length);
			     Print(mcArray);
			   }
			
			  
		}*/
	 public static void main(String[] args) {  
		  
	        String str = "";  
	        for (int i = 1; i <= 19; i++)  
	            str += (char) (96 + i);  
	  
	        StringBuilder sb = new StringBuilder();  
	        for (int i = 0; i < 106; i++)sb.append(str); 
	        while (sb.length() > 1) {  
	            for (int i = 0; i < sb.length(); i++) 
	            {
	                sb.delete(i, i + 1);  
	            }  
	          System.out.println(sb);  
	    }  
		
	}
}


