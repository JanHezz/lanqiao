package Zt5;

import java.math.BigInteger;
import java.util.BitSet;

public class Test1  {
	
	

	public static void f(BigInteger sum,BigInteger Sxh,int j,int bit,BigInteger[] mi)
	{
		if(j>bit)return;//��ǰλ������bit
		if (j==bit&&sum.compareTo(Sxh)==0&&sum.toString().length()==bit) {
			System.out.println(sum+"  "+sum.toString().length());
			return ;
		}
		for(int i=0;i<=9;i++)
		{
			Sxh=Sxh.add(new BigInteger(""+i).multiply(new BigInteger("10").pow(j)) );//ˮ�ɻ������
			
		    sum=sum.add(mi[i]);//��¼i^21�η�
		    f(sum, Sxh,++j,bit,mi);
		    j--;
		    Sxh=Sxh.subtract(new BigInteger(""+i).multiply(new BigInteger("10").pow(j)));//����
		    sum=sum.subtract(mi[i]);
		    
		}
		
	}
	public static void f(int sum,int Sxh,int j)
	{
		
		if(j>3)return;
		if (j==3&&sum==Sxh) {
			System.out.println(sum);
			return ;
		}
		
		for(int i=1;i<=9;i++)
		{
			Sxh=Sxh+i*(int)Math.pow(10, j);
			sum=sum+(int)Math.pow(i, 3);
		    f(sum, Sxh,++j);
		    j--;
		    Sxh=Sxh-i*(int)Math.pow(10, j);
			sum=sum-(int)Math.pow(i, 3);
		    
		}
		
	}
	private static void ss(BigInteger[] b,int[] a, int index,int left){

        if(index == 9){
              //�պ�21��Ҳ��������
                a[9] =left;
                if(a[9] < 10){
                    //9��21�η����ֵĴ������ܳ���10�Σ���Ϊ9��21�η���21λ��
                    BigInteger ret = BigInteger.ZERO;
                    for (int i = 0; i < a.length; i++) {
                        //һ���������21λ����������ѭ��
                        if(ret.toString().length() > 21){
                            ret = null;
                            break;
                        }

                        //��ÿ�����ֳ��ֵĴ�����������21�η���Ȼ���ۼ�����
                        if(a[i] != 0){
                            ret = ret.add(b[i].multiply(BigInteger.valueOf(a[i])));
                        }

                    }     
                    if(ret!= null && ret.toString().length() == 21){
                        //��һ����֤ÿ�����ֳ��ֵĴ����Ƿ��a����һ��
                        String x = ret.toString();
//                      System.out.println(x);
                        int[] c = new int[10];
                        for (int i = 0; i < x.length(); i++) {
                            c[x.charAt(i)-'0']++;//����һ�ζ�Ӧ�±��һ
                        }
                        //�Ա��������飬һ��˵���ҵ���
                        boolean isRight = true;
                        for (int i = 0; i < c.length; i++) {
                            if(a[i] != c[i]){
                                isRight = false;
                                break;
                            }
                        }

                        if(isRight){
                            System.out.println(x);
                        }
                    }
                }

            return;
        }

        //Ϊ��index��a����Ԫ�ط������
        for(int i=0; i<=left; i++){
            a[index] = i;
            ss(b,a,index+1, left-i);//һ������21�η���һ����һ�ξ͵ü�ȥi
        }
	}
public static void main(String[] args) {
  //��21λ����ˮ�ɻ���
	  int[] a=new int[10];//�±�������� ��Ӧֵ������ִ���
	 BigInteger[] mi=new BigInteger[10];//���Ŷ�Ӧ�±��21�η�
    for(int i=2;i<10;i++)
	{
		BigInteger base=new BigInteger(i+"");
	    mi[i]=base.pow(21);
	}
	mi[0]=BigInteger.ZERO;
	mi[1]=BigInteger.ONE;
	
	ss(mi, a, 0,21);
	
	/*f(sum, sxh, 0,10,mi);*/


	
	
}

}
