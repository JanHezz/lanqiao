package Work4;

import java.util.ArrayList;

public class Test {
	
	//public static ArrayList<String> A=new ArrayList<String>();
	//public static ArrayList<String> B=new ArrayList<String>();
  	
	

//	public static String[] A= new String[]{"a","c","g","h","j"};
//	public static String[] B= new String[]{"c","d","f","h","k"};
	
	//判断是否存在该元素
	public static boolean IsExist(String a,ArrayList<String> A)
	{
		for(int i=0;i<A.size();i++)
		{
			if (a.equals(A.get(i))) {
				return true;
			}
		}
		return false;
	}
	//插入数据
	public static void Insert(String a,int index,ArrayList<String> A)
	{
		A.add(index, a);

	}
	//在A集合中插入B中不存在A的元素
	public static void union(ArrayList<String> A,ArrayList<String>B)
	{
		int Lena=A.size(); int Lenb=B.size();
		for (int i = 0; i < Lenb; i++) {
			if (!IsExist(B.get(i), A)) {
				
				Insert(B.get(i), Lena++, A);
			}
		}
		for(int i=0;i<A.size();i++)
		{
           System.out.println(A.get(i));
	   }
	  }
	//归并两个数组
	public static int[] MergeList(int [] a,int [] b )
	{
		int lena=a.length-1;
		int lenb=b.length-1;
		int [] c=new int[lena+lenb+2];
		int i=0,j=0,k=0;
		while(i<=lena&&j<=lenb)
		{
			if (a[i]<b[j]) {
				c[k++]=a[i++];	
			}
			else {
				c[k++]=b[j++];
			}
		}
		while(i<=lena)
		{
			c[k++]=a[i++];
		}
		while(j<=lenb)
		{
			c[k++]=b[j++];
		}
		return c;
	}
	//输出数组
	public static void Show(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
		System.out.println();
	}
	//动态分配空间
	public static void initList(int[] a) {
		int lenght=a.length;
		
		a=new int[lenght+1];
		System.out.println(a.length);
		
		
	}
	//在有序数组中插入数据
	public static void insert(int a ,int[] A)
	{
		int lena=A.length;
		int [] c=new int[lena+1];
  	int index=0;
		for(int i=0;i<A.length;i++)
     {
			c[i]=A[i];
	 }
		for(int i=0;i<A.length;i++)
		{
			if (a>=A[i]&&a<=A[i+1]) {
				index=i+1;
				break;
			}
			index=c.length;
		}
	//	3 5 8 11 15 16
		for(int i=c.length-1;i>index;i--)
		{
			c[i]=c[i-1];
		}
		c[index]=a;
		Show(c);
	}
	//删除数据
	public static void Delete(int index,int [] a)
	{
		int[] b=new int[a.length-1];
		for(int i=index-1;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		for(int i=0;i<b.length;i++)
	     {
				b[i]=a[i];
		 }
		Show(b);
		
	}
	//排序
	public static void Sort(int [] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if (a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		
	}
public static void main(String[] args) {
ArrayList<String> A=new ArrayList<String>();
ArrayList<String> B=new ArrayList<String>();
  	
//一
//a c g h k
// b f k d a
	A.add("a");
	A.add("c");
	A.add("g");
	A.add("h");
	A.add("k");
	B.add("b");
	B.add("f");
	B.add("k");
	B.add("d");
	B.add("a");
	union(A, B);
//二
	/*int [] a=new int[] {3,5,8,11};
	int [] b=new int[] {2,6,8,9,11,15,20};
	
	
	int[] c=MergeList(a, b);
	Show(c);*/
	
	//三
	int [] a=new int[] {1,2,4,5,6,7};
	int [] b=new int[] {8,9,3};
	//initList(a);
	//insert(3, a);
	//Delete(3, a);
	Sort(a);
	Sort(b);
	int[] c=MergeList(a, b);
	Show(c);
	

	
	
}
}
