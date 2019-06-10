package com.lanqiao.dynamicplanning;

/**
 * 

Nλͬѧվ��һ�ţ�������ʦҪ�����е�(N-K)λͬѧ���У�ʹ��ʣ�µ�Kλͬѧ�ųɺϳ����Ρ�

�ϳ�������ָ������һ�ֶ��Σ���Kλͬѧ���������α��Ϊ1��2����K�����ǵ���߷ֱ�ΪT1��T2������TK�� �����ǵ��������T1<...<Ti>Ti+1>��>TK(1<=i<=K)��

��������ǣ���֪����Nλͬѧ����ߣ�����������Ҫ��λͬѧ���У�����ʹ��ʣ�µ�ͬѧ�ųɺϳ����Ρ�

 * @author  Jan
 2018��5��16��
 *
 */
public class Test1 {
	
	public static void main(String[] args) {
		
		int n=8;
		int [] a=new int [] {186,186, 150, 200, 160, 130, 197, 220};
		int []up=new int[100];
		int []down=new int[100];
		for(int i=1;i<=n;++i)  
	    {   
	      up[i]=1; 
	    }
		for (int i =1; i <n; i++) {
			for(int j=1;j<i;j++)
			{
				if (a[j]<a[i]) {
					up[i]=up[j]+1;
				}
			}
		}
		for (int i =n-1; i >=1; i--) {
			for(int j=n-1;j>i;j--)
			{
				if (a[j]>a[i]) {
					down[i]=down[j]+1;
				}
			}
		}
		int max=1;
		for (int i = 1; i <=n; i++) {
			
			if ((up[i]+down[i])>max) {
				max=up[i]+down[i];
			}
		}
		System.out.println(max);
				
	}

}
