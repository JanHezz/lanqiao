package Zt5;

import java.math.BigInteger;
import java.util.BitSet;

public class Test1  {
	
	

	public static void f(BigInteger sum,BigInteger Sxh,int j,int bit,BigInteger[] mi)
	{
		if(j>bit)return;//当前位数大于bit
		if (j==bit&&sum.compareTo(Sxh)==0&&sum.toString().length()==bit) {
			System.out.println(sum+"  "+sum.toString().length());
			return ;
		}
		for(int i=0;i<=9;i++)
		{
			Sxh=Sxh.add(new BigInteger(""+i).multiply(new BigInteger("10").pow(j)) );//水仙花数相加
			
		    sum=sum.add(mi[i]);//记录i^21次方
		    f(sum, Sxh,++j,bit,mi);
		    j--;
		    Sxh=Sxh.subtract(new BigInteger(""+i).multiply(new BigInteger("10").pow(j)));//回溯
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
              //刚好21次也分配完了
                a[9] =left;
                if(a[9] < 10){
                    //9的21次方出现的次数不能超过10次，因为9的21次方是21位数
                    BigInteger ret = BigInteger.ZERO;
                    for (int i = 0; i < a.length; i++) {
                        //一旦结果超过21位，立即跳出循环
                        if(ret.toString().length() > 21){
                            ret = null;
                            break;
                        }

                        //把每个数字出现的次数乘以它的21次方，然后累加起来
                        if(a[i] != 0){
                            ret = ret.add(b[i].multiply(BigInteger.valueOf(a[i])));
                        }

                    }     
                    if(ret!= null && ret.toString().length() == 21){
                        //进一步验证每个数字出现的次数是否和a数组一致
                        String x = ret.toString();
//                      System.out.println(x);
                        int[] c = new int[10];
                        for (int i = 0; i < x.length(); i++) {
                            c[x.charAt(i)-'0']++;//出现一次对应下标加一
                        }
                        //对比两个数组，一致说明找到答案
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

        //为第index个a数组元素分配次数
        for(int i=0; i<=left; i++){
            a[index] = i;
            ss(b,a,index+1, left-i);//一共分配21次分了一次下一次就得减去i
        }
	}
public static void main(String[] args) {
  //求21位数的水仙花数
	  int[] a=new int[10];//下标代表数字 对应值代表出现次数
	 BigInteger[] mi=new BigInteger[10];//存着对应下标的21次方
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
