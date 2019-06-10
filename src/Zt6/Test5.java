package Zt6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test5 {
	static boolean flag = false;    // ��������Ƿ���ͨ   
    static boolean flag2 = false;   // ��������Ƿ�û�н��, ���û�н�����"��";   
    // ��ʼ������   
    public static void init(List<char[][]> lis,String[] s,int n){  
        for(int i=0;i<n;i++){  
            for(int j=i*3;j<i*3+3;j++){  
                lis.get(i)[j%3] = s[j].toCharArray();  
            }  
        }  
    }  
    // ����n������  ��ʼ��,������lis   
    public static void input(List<char[][]> lis,int n){  
        Scanner scan = new Scanner(System.in);  
        for(int i=1;i<=n;i++){       // ��������   
            lis.add(new char[3][4]);  
        }  
        String[] s = new String[n*3];  
        for(int i=0;i<n*3;i++){  // �е����������   
            s[i] = scan.nextLine();  
        }  
        init(lis,s,n);  // ����������� ��ʼ��ÿ������   
    }  
    // c='1' ������ϲ��Ƿ���ͨ    
    public static boolean colU(char[][] m,int i,int j,char c){  
        if(i<0){  
            flag = true;    // ������ͨ   
            return flag;  
        }  
        if(m[i][j]=='0'){  
            return colU(m,i-1,j,c);  
        }else if(m[i][j]=='1'){  
            flag = false;   // ��һ�� '1' ����ͨ   
            return flag;  
        }else if(m[i][j]=='-'){  
            flag = true;    // ��һ�� '-' ����ͨ   
            return flag;  
        }  
        return flag;  
    }  
    // c='1' ������²��Ƿ���ͨ    
        public static boolean colD(char[][] m,int i,int j,char c){  
            if(i>=m.length){  
                flag = true;    // ������ͨ   
                return flag;  
            }  
            if(m[i][j]=='0'){  
                return colD(m,i+1,j,c);  
            }else if(m[i][j]=='1'){  
                flag = false;   // ��һ�� '1' ����ͨ   
                return flag;  
            }else if(m[i][j]=='-'){  
                flag = true;    // ��һ�� '-' ����ͨ   
                return flag;  
            }  
            return flag;  
        }  
    // c='-' ���������Ƿ���ͨ   
    public static boolean rowL(char[][] m,int i,int j,char c){  
        if(j<0){  
            flag = true;    // ������ͨ   
            return flag;  
        }  
        if(m[i][j]=='0'){  
            return rowL(m,i,j-1,c);  
        }else if(m[i][j]=='1'){  
            flag = true;    // ��һ�� '1' ����ͨ   
            return flag;  
        }else if(m[i][j]=='-'){  
            flag = false;   // ��һ�� '-' ����ͨ   
            return flag;  
        }  
        return flag;  
    }  
    // c='-' ������Ҳ��Ƿ���ͨ   
    public static boolean rowR(char[][] m,int i,int j,char c){  
        if(j>=m[i].length){  
            flag = true;    // ������ͨ   
            return flag;  
        }  
        if(m[i][j]=='0'){  
            return rowR(m,i,j+1,c);  
        }else if(m[i][j]=='1'){  
            flag = true;    // ��һ�� '1' ����ͨ   
            return flag;  
        }else if(m[i][j]=='-'){  
            flag = false;   // ��һ�� '-' ����ͨ   
            return flag;  
        }  
        return flag;  
    }  
    // ��c='1'ʱ ����Ƿ���ͨ1111111111111111111   
    public static boolean check1(char[][] m, int i, int j, char c) {  
        if(colU(m,i,j,c)&&colD(m,i,j,c)){   // �� '1' ʱ ���(����)�Ƿ���ͨ   
            flag = true;  
        }else{  
            return false;  
        }  
        return flag;  
    }  
    // ��c='-'ʱ ����Ƿ���ͨ-------------------   
    public static boolean check2(char[][] m, int i, int j, char c) {  
        if(rowL(m,i,j,c)&&rowR(m,i,j,c)){   // �� '-' ʱ ���(����)�Ƿ���ͨ   
            flag = true;  
        }else{  
            return false;  
        }  
        return flag;  
    }  
    // ��Ⲣ���Ԫ��   
    public static void calc2(char[][] m,int i,int j){  
        if(check1(m, i, j, '1')){   // ����'1'ʱ,���ж�����ͨ   
            m[i][j] = '1';  // �����Ԫ��   
        }else if(check2(m, i, j, '-')){// ����'-'ʱ,���ж�����ͨ   
            m[i][j] = '-';// �����Ԫ��   
        }else{  
            flag2 = true;   // ��ʾ�޽��   
        }  
    }  
    // ���㺯�������   
    public static void calc(char[][] m){  
        for(int i=0;i<m.length;i++){  
            for(int j=0;j<m[i].length;j++){  
                if(m[i][j]=='0'){  
                    calc2(m,i,j);   // �����⺯��   
                }  
                if(flag){  
                    String temp = i+""+j+""+m[i][j];  
                    System.out.println(temp);  
                    flag2 = false;  // �����Ԫ�����,��ô�Ͳ�Ϊ��!�±ߵľͲ������"��"ֵ   
                    break; // �����ӹ�Ԫ��,���˳�ѭ��   
                }  
            }  
            if(flag){ // �����ӹ�Ԫ��,���˳�ѭ��   
                flag = false;  
                break;  
            }  
        }  
        if(flag2){  // ����޽��,����ӿ�   
            System.out.println("��");      
            flag2 = false;  // �޸ı��λ   
        }  
    }  
    // ������   
    public static void main(String[] args){  
        Scanner scan = new Scanner(System.in);  
        List<char[][]> lis = new ArrayList<char[][]>(); // ���ÿ������   
        System.out.print("�������� n(n<100):");  
        // ����n������  ��ʼ��,������lis   
        input(lis,scan.nextInt());    
        // ���㺯�������, ����ȥÿ������ȥ����   
        for(int i=0;i<lis.size();i++){  
            calc(lis.get(i));     
        }  
    }  


}
