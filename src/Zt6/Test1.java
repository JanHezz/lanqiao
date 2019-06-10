package Zt6;
import java.math.BigInteger;
import java.util.Scanner;
public class Test1 {
    public static BigInteger p(int i){ //����i��21�η� 
        BigInteger base = BigInteger.valueOf(i);  
        return base.pow(21);  
    }  
    public static void ji_suan(BigInteger[] pw,int[] nn){  
        BigInteger sum = BigInteger.ZERO;  
        for(int i=0;i<10;i++){  
            sum = sum.add(  
                    pw[i].multiply(BigInteger.valueOf(nn[i])));  
        }  
        String s = "" + sum;  
        if(s.length()!=21) return;  
        // ȷ�������ֳ��ֵĶ��ٴ�   
        int[] nn2 = new int[10];  
        for(int i=0;i<21;i++){  
            nn2[s.charAt(i)-'0']++;  
        }  
        for(int i=0;i<10;i++){  
            if(nn[i]!=nn2[i]) return;  
        }  
        System.out.println(s);  
    }  
    public static void f(BigInteger[] pw, int[] nn, int cur, int use){  
        if(cur==9){  
            nn[9] = 21 - use;  
            ji_suan(pw,nn);  
            return;  
        }  
        // �Ե�ǰλ�����п��ܽ���ö��   
        for(int i=0;i<21-use;i++){  
            nn[cur] = i;  
            f(pw,nn,cur+1,use+i);  
        }  
    } 
    public static void main(String[] args){  
        long startTime = System.currentTimeMillis();    // ����ʼʱ��   
        BigInteger pw[] = new BigInteger[10];  
        for(int i=0;i<pw.length;i++){  
            pw[i] = p(i);  
        }  
        int nn[] = new int[10];  
        f(pw,nn,0,0);  
        System.out.println("OK");  
        long endTime = System.currentTimeMillis();  // �������ʱ��   
        System.out.println((endTime-startTime)/1000f+"��");  // ������ʱ��   
    }  


	
	/*public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		Question10Think2.size = scanner.nextInt();
		long startTime = System.currentTimeMillis();	// ����ʼʱ��
		Question10Think2OptimizeMustRemember.size=21;
		Question10Think2OptimizeMustRemember.init();
		
		Question10Think2OptimizeMustRemember.exhaustion(9, 0, BigInteger.valueOf(0));
		
		
		long endTime = System.currentTimeMillis();	// �������ʱ��
		System.out.println((endTime-startTime)/1000f+"��");	// ������ʱ
	}*/
}
class Question10Think2OptimizeMustRemember {
	public static int size;
	public static int array[]={0,1,2,3,4,5,6,7,8,9};
	public static BigInteger powArray[] = new BigInteger[10]; // ��¼0~9��size�η�
	public static int usedTimes[]=new int[10];// ��¼0~9��ʹ�ô���
	public static BigInteger iPowSizeMultiplyj[][]; //��¼0��9����������i��N�η�����i���ֵĴ���j�Ľ����i^N*j��
	public static BigInteger MAX; // sizeλ�������ܱ�ʾ�����ֵ
	public static BigInteger MIN; // sizeλ�������ܱ�ʾ����Сֵ
	public static void init() {// ���ڳ�ʼ��powArray[],MAX,MIN
		for (int i = 0; i < 10; i++) {// ��ʼ��powArray[]
			powArray[i] = (new BigInteger("" + i)).pow(size);
		}
		MIN = (new BigInteger("10")).pow(size - 1); // ��ʼ����Сֵ
		MAX = (new BigInteger("10").pow(size).add(new BigInteger("-1")));// ��ʼ�����ֵ
		iPowSizeMultiplyj=new BigInteger[10][size+1];  //��ʼ��iPowSizeMultiplyj[][]
		for (int i = 0; i < 10; i++) {
			iPowSizeMultiplyj[i][0]=BigInteger.valueOf(0);
			for (int j = 1; j < size+1; j++) {
				iPowSizeMultiplyj[i][j]=iPowSizeMultiplyj[i][j-1].add(powArray[i]);
			}
		}
	}
	public static void exhaustion(int arrayIndex,int used,BigInteger current) { 
		if (current.compareTo(MAX)>1) {//�������ֵ,�ݹ����
			return;
		}
		if(used==size){//sizeλȫ���������
			if(current.compareTo(MIN)<0){ //�ѻ�õ�ֵС����Сֵ
				return;
			}else {
				String s=current+"";
				int avaliableValueUsed[]=new int[10];
				for (int i = 0; i < s.length(); i++) {
					avaliableValueUsed[s.charAt(i)-'0']++;
				}
				for (int i = 0; i < 10; i++) {
					if(usedTimes[i]!=avaliableValueUsed[i]){
						return;
					}
				}
				System.out.println(current);
				return;
			}
		}
		if(arrayIndex==0){
			usedTimes[0]=size-used;
			exhaustion(-1, size, current);
			usedTimes[0]=0;
			return;
		}
		if(current.add(iPowSizeMultiplyj[arrayIndex][size-used]).compareTo(MIN)<0){
			return;
		}
		if(arrayIndex>=0){
			for (int i = 0; i <= size-used; i++) {
				if(current.add(iPowSizeMultiplyj[arrayIndex][i]).compareTo(MAX)>0){
					return;
				}
				usedTimes[arrayIndex]=i;//0  0
				exhaustion(arrayIndex-1, used+i,current.add(iPowSizeMultiplyj[arrayIndex][i]));
				usedTimes[arrayIndex]=0;
			}
		}else {
			return;//1��9�ѷ������,������������
		}
	}
}

