package Work5;

import java.awt.List;
import java.*;
import java.util.ArrayList;
import java.util.Collection;

public class Test {

	//判断是否存在该元素
	public static boolean IsExist(Integer a,ArrayList<Integer> A)
	{
		for(int i=0;i<A.size();i++)
		{
			if (a==A.get(i)) {
				return true;
			}
		}
		return false;
	}
	//插入元素
	
	public static void Insert(Integer a,ArrayList<Integer> A)
	{
		A.add(a);

	}
	//在A集合中插入B中不存在A的元素
		public static void union(ArrayList<Integer> A,ArrayList<Integer>B)
		{
			int Lena=A.size(); int Lenb=B.size();
		
			for (int i = 0; i < Lenb; i++) {
				if (!IsExist(B.get(i), A)) {
					
					Insert(B.get(i),A);
				}
			}
			for(int i=0;i<A.size();i++)
			{
	           System.out.println(A.get(i));
		   }
		  }
		//delete x-y 之间的值
		public static void IsXY(Integer x,Integer y, ArrayList<Integer> list)
		{
			if(x>y) {
				System.out.println(x+"必须小于"+y);
				return ;
			}
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i)>=x&&list.get(i)<=y) {
					list.remove(i);
			i-=1;
				}
			    }
			
		}
		//输出list的值
		public static void Show(ArrayList<Integer> list)
		{
			for (int i = 0; i <list.size(); i++) {
				System.out.print(list.get(i)+"  ");
			}
			System.out.println();
		}
		public static void Count(ArrayList<Integer> A,int m)
		{
			
			 int count=0;
			 int index=1;

			 int i=0;
			 boolean isbaoshu=false;
			 while(count<30)
			 {
				 isbaoshu=false;
				if (i>A.size()-1){
					
					i=0;
					}
				if (index==m) {
					System.out.println("第"+(count+1)+"个"+"是"+A.get(i)+"号");
					index=1;
					A.remove(i);
					count++;
					isbaoshu=true;
				
				}
           if (!isbaoshu) {
             	index++;
             	i++;
                }
			
				
	
			 }
		}
		public static void main(String[] args) {
		//第一题
	/*ArrayList<Integer> A=new ArrayList<Integer>();
		ArrayList<Integer> B=new ArrayList<Integer>();*/
		ArrayList<Integer> C=new ArrayList<Integer>();
		/*A.add(1);
		A.add(2);
		A.add(4);
		A.add(8);
		A.add(9);
		B.add(2);
		B.add(3);
		B.add(4);
		B.add(5);
		union(A, B);*/
			//第二题
/*for(int i=0;i<10;i++)
	{
		C.add(i);
	}
	IsXY(3, 4, C);
	Show(C);
			*/
			//第三题
		
		/*	Polynomial p1=new Polynomial();
			p1.AddItem(1, 0);
			p1.AddItem(2, 5);
			p1.Sort();
			p1.merge();
			p1.Print();
			
			Polynomial p2=new Polynomial();
		p2.AddItem(1, 0);
		p2.AddItem(2, 5);
		p2.AddItem(3, 4);
		
		p2.AddItem(2, 5);
		p2.Sort();
		p2.merge();
		p2.Print();
		Polynomial p3=new Polynomial();
		p3.AddPolynomial(p1.PolyList, p2.PolyList);
		p3.Print();*/
			
			//第四题
		ArrayList<Integer> mArrayList=new ArrayList<Integer>();
		for(int i=1;i<31;i++)
		{
			mArrayList.add(i);
		}
		Count(mArrayList, 5);
		
		}

}
