package Zt6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
	 static List<int[]> lis = new ArrayList<int[]>();  
	    // ����������   
	    public static void print(){  
	        for(int[] x:lis){  
	            for(int y:x){  
	                System.out.print(y);  
	            }  
	            System.out.println();  
	        }  
	    }  
	    // ����Ƿ����ظ�Ԫ��   
	    public static boolean check2(int[] n){  
	        if(lis.size()==0) return false;  
	        for(int i=0;i<lis.size();i++){  
	            int a = n[0]*100+n[1]*10+n[2];  
	            int b = lis.get(i)[3]*100+lis.get(i)[4]*10+lis.get(i)[5];  
	            if(a!=b){  
	                return false;  
	            }  
	        }  
	        return true;  
	    }  
	    // ���,����ӷ��ϵ����   
	    public static void check(int[] n){  
	        int a = n[0]*100+n[1]*10+n[2];  
	        int b = n[3]*100+n[4]*10+n[5];  
	        int c = n[6]*100+n[7]*10+n[8];  
	        if(a+b==c){  
	            if(!check2(n)){ // ������ظ�,�����   
	                lis.add(Arrays.copyOf(n, n.length));  
	            }  
	        }  
	    }  
	    // ȫ����   
	    public static void f(int[] n,int start,int end){  
	        if(start>=end){  
	            check(n);   // ���,����ӷ��ϵ����   
	            return ;  
	        }else{  
	            for(int i=start;i<n.length;i++){  
	                int temp = n[start];  
	                n[start] = n[i];  
	                n[i] = temp;  
	                f(n,start+1,end);  
	                temp = n[start];  
	                n[start] = n[i];  
	                n[i] = temp;  
	            }  
	        }  
	    }  
	    public static void main(String[] args){  
	        int[] n = {1,2,3,4,5,6,7,8,9};  
	        f(n,0,n.length-1);  
	        print();    // ������   
	        System.out.println("�ܸ���:"+lis.size());  // �������   
	    }  


}
