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
		List<String> c=new ArrayList<String>();//�ƶ�
	   while(A.length()>0&&B.length()>0)
	   {
		   String a=A.substring(0, 1);//ȡA��ͷ
		   int sAl=A.length();
		   A=A.substring(1,sAl);//ȥA��ͷ
		   String b=B.substring(0, 1);//ȡB��ͷ
		 
		   if (c.contains(a)) {//�ж��ƶ���û��A����ͷ
			int i=c.indexOf(a);//ȡ�������ƶѵ�λ��
			  A+=a;//��a�ӵ�ĩβ
			for(int j=c.size()-1;j>=i;j--)//���ƶ���ļӽ�ȥ
			{
				A+=c.get(j);
				c.remove(j);
			}
		   }
		   else {//�����ھͰ�a�ӵ��ƶ�
			c.add(a);
		}
		   if (A.length()==0) {
				System.out.println("Bʣ�µ���"+B);
			}
		   int sBl=B.length();//ȥB��ͷ
		    B=B.substring(1, sBl);
		   if (c.contains(b)) {//ͬ��
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
        //������
		if (B.length()==0) {
			System.out.println("Aʣ�µ���"+A);
		}
		
	   }
		
		
	}

}
