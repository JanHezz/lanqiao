package Work5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class Polynomial {
 public ArrayList<Item> PolyList=new ArrayList<Item>();
 //���ض���ʽ�ĳ���
 public int  PolyLength()
 {
	 return PolyList.size();
 }
 //��Ӷ���ʽ
 public void AddItem(int coefficient,int power)
 {
	 PolyList.add(new Item(coefficient, power));
 }
 //�������ʽ
 public void ShowPolynomial()
 {
	 for (int i = 0; i <PolyList.size(); i++) {
		System.out.print(PolyList.get(i).toString());
	}
	 System.out.println();
 }
 //�鲢
 public void AddPolynomial(ArrayList<Item> A,ArrayList<Item> B)
 {
	int aStart=0; int bStart=0;

	while(aStart<A.size()&&bStart<B.size())
	{
	 if (A.get(aStart).power==B.get(bStart).power) {
			PolyList.add(new Item(A.get(aStart).coefficient+B.get(bStart).coefficient, A.get(aStart).power));
			
			aStart++;
			bStart++;
		}
	 else  if (A.get(aStart).power<B.get(bStart).power) {
		       	PolyList.add(A.get(aStart));
		       	aStart++;
		}
		else {
			PolyList.add(B.get(bStart));
			bStart++;
		}
		
	}
	while(aStart<A.size())
	{
		PolyList.add(A.get(aStart));
       	aStart++;
	}
	while(bStart<B.size())
	{
		PolyList.add(B.get(bStart));
		bStart++;
	}
	
	
	 
	 
 }
 //�Ƚ�ָ���Ĵ�С
 public int  Compare(int power1,int power2)
 {
	 if (power1>power2) {
		return 1;
	}
	else  if (power1==power2) {
		
		return 0;
	}
	 else {
		return -1;
	}
		 
	
 }
 //�������ʽ 
 public void Print()
 {
	 for(int i=0;i<PolyList.size();i++)
	 {
		 if (i<PolyList.size()-1){
			 System.out.print(PolyList.get(i).toString()+"+");
		}
		 else {
			 System.out.print(PolyList.get(i).toString());
		}
		
	 }
	 System.out.println();
 }
 //�ϲ�ͬ����
 public void merge()
 {
	 for(int i=0;i<PolyList.size();i++)
	 {
		 for(int j=i+1;j<PolyList.size();j++)
		 {
			 if (PolyList.get(i).power==PolyList.get(j).power) {
				 PolyList.get(i).coefficient+=PolyList.get(j).coefficient;
				 PolyList.remove(j);
				
			}
		 }
	 }
 }
 //����
 public void Sort()
 {

	 Collections.sort(PolyList);
	 /*for(int i=0;i<PolyList.size();i++)
	 {
		 for(int j=i;j<PolyList.size()-1;j++)
		 {
			 if (PolyList.get(j).power>PolyList.get(j+1).power) {
				 Item item;
				 item=PolyList.get(j);
				 PolyList.add(j, PolyList.get(j+1));
				 PolyList.add(j+1, item);
				 
			}
			
			 
		 }
	 }*/

 }

}
 
