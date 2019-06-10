package Practice;

public class Test26 {
	public static void main(String[] args) {
		 int [] a=new int[10001];
	     int j=2;
    	 a[1]=1;
    	 for(int i=2;(int )Math.pow(i, j)<=10000;i++)
    	 {
    		 for(;Math.pow(i, j)<=10000;j++)
    		 {
    			 a[(int)Math.pow(i, j)]=1;
    		 }
    		 j=2;
    	 }
    	 int count=0;
    	 for(int i=0;i<a.length;i++)
    	 {
    		 if (a[i]==0) {
				count++;
			}
    	 }
    	 System.out.println(count);
	}
	

}
