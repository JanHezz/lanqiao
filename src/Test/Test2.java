package Test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void Print(List<String> a)
	{
		System.out.println();
		for(int i=0;i<a.size();i++)
		{
			System.out.print(a.get(i));
		}
		 System.out.println();
	}
	
	public static void main(String[] args) {
		
		String A="HKJQKAK143265";
		String B="23KJQ4432KQ";
		List<String> c=new ArrayList<String>();//牌堆
	   while(A.length()>0&&B.length()>0)
	   {
		   String a=A.substring(0, 1);//取A排头
		   int sAl=A.length();
		   A=A.substring(1,sAl);//去A排头
		   String b=B.substring(0, 1);//取B排头
		 
		   if (c.contains(a)) {//判断牌堆有没有A的排头
			int i=c.indexOf(a);//取得他在牌堆的位置
			  A+=a;//把a加到末尾
			for(int j=c.size()-1;j>=i;j--)//把牌堆里的加进去
			{
				A+=c.get(j);
				c.remove(j);
			}
		   }
		   else {//不存在就把a加到牌堆
			c.add(a);
		}
		   if (A.length()==0) {
				System.out.println("B剩下的牌"+B);
			}
		   int sBl=B.length();//去B排头
		    B=B.substring(1, sBl);
		   if (c.contains(b)) {//同上
				int i=c.indexOf(b);
				  B+=b;
				for(int j=c.size()-1;j>=i;j--)
				{
					B+=c.get(j);
					c.remove(j);
				}
			}
		   else {
			c.add(b);
		}
        //输出结果
		if (B.length()==0) {
			System.out.println("A剩下的牌"+A);
		}
		
	   }
		
		
	}

}
