package Practice;

import java.util.Scanner;

public class Test32 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int[] a = new int[5];//����  
        int[] b = new int[3];//��ȡ����  
        for (int i = 0; i < 3; i++) {  
            b[i] = sc.nextInt();  
        }  
        for (int i = 0; i < 5; i++) {  
            a[i] = sc.nextInt();  
        }  
        for (int i = 0; i < 3; i++) {//����ȡ������С��������  
            for (int j = 0; j < 3-i-1; j++) {  
                if(b[j]>b[j+1]){  
                    int t = b[j];  
                    b[j] = b[j+1];  
                    b[j+1] = b[j];  
                }  
            }  
        }  
        for (int i = 0; i < 5; i++) {  
            int x = 0, y = 0;//x��һ���˵���������y�ڶ����˵�������  
            while(a[i]!=0){  
                if(b[0]>a[i]) break;//ʣ�����ȿ�ȡ����С����С�������  
                boolean x1 = false,y1 = false;//����ܲ���ȡ��������true������  
                for (int j = 2; j >= 0; j--) {  
                    if((x%2==0&&b[j]%2==0)||(x%2!=0&&b[j]%2!=0)){//ȡ�������������������ܶ�Ϊ������Ҳ���ܶ�Ϊż��  
                        continue;  
                    }  
                    if(b[j]>a[i]) continue;  
                    x+=b[j];  
                    a[i]-=b[j];  
                    x1 = true;  
                    break;  
                }  
                if(!x1){//������ܱ�֤Ϊ����   ȡ��һ��������  
                    for (int j = 2; j >= 0; j--) {  
                        if(b[j]>a[i]) continue;  
                        x+=b[j];  
                        a[i]-=b[j]; 
                        break;
                    }  
                }  
                for (int j = 2; j >= 0; j--) {//�ڶ��������һ����ȡ���ϣ�ԭ����ͬ  
                    if((y%2==0&&b[j]%2==0)||(y%2!=0&&b[j]%2!=0)){  
                        continue;  
                    }  
                    if(b[j]>a[i]) continue;  
                    y+=b[j];  
                    a[i]-=b[j];  
                    y1 = true;  
                    break;  
                }  
                if(!y1){  
                    for (int j = 2; j >= 0; j--) {  
                        if(b[j]>a[i]) continue;  
                        y+=b[j];  
                        a[i]-=b[j];  
                        break;
                    }  
                }  
            }  
            if(y==0){  
                if(x==0)  
                    System.out.print(0+" ");  
                else  
                    System.out.print("+"+" ");  
            }else if(y%2==0&&x%2!=0){  
                System.out.print("+"+" ");  
            }else if(y%2!=0&&x%2==0){  
                System.out.print("-"+" ");  
            }else if(y%2==0&&x%2==0){  
                System.out.print(0+" ");  
            }else{  
                System.out.print(0+" ");  
            }  
        }  
    }  

}
