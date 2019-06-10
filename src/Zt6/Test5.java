package Zt6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test5 {
	static boolean flag = false;    // 用来标记是否连通   
    static boolean flag2 = false;   // 用来标记是否没有结果, 如果没有结果输出"空";   
    // 初始化数组   
    public static void init(List<char[][]> lis,String[] s,int n){  
        for(int i=0;i<n;i++){  
            for(int j=i*3;j<i*3+3;j++){  
                lis.get(i)[j%3] = s[j].toCharArray();  
            }  
        }  
    }  
    // 创建n个数组  初始化,并存入lis   
    public static void input(List<char[][]> lis,int n){  
        Scanner scan = new Scanner(System.in);  
        for(int i=1;i<=n;i++){       // 创建数组   
            lis.add(new char[3][4]);  
        }  
        String[] s = new String[n*3];  
        for(int i=0;i<n*3;i++){  // 行到输入的数据   
            s[i] = scan.nextLine();  
        }  
        init(lis,s,n);  // 用输入的数据 初始化每个数组   
    }  
    // c='1' 检查列上侧是否连通    
    public static boolean colU(char[][] m,int i,int j,char c){  
        if(i<0){  
            flag = true;    // 都不连通   
            return flag;  
        }  
        if(m[i][j]=='0'){  
            return colU(m,i-1,j,c);  
        }else if(m[i][j]=='1'){  
            flag = false;   // 有一个 '1' 则连通   
            return flag;  
        }else if(m[i][j]=='-'){  
            flag = true;    // 有一个 '-' 则不连通   
            return flag;  
        }  
        return flag;  
    }  
    // c='1' 检查列下侧是否连通    
        public static boolean colD(char[][] m,int i,int j,char c){  
            if(i>=m.length){  
                flag = true;    // 都不连通   
                return flag;  
            }  
            if(m[i][j]=='0'){  
                return colD(m,i+1,j,c);  
            }else if(m[i][j]=='1'){  
                flag = false;   // 有一个 '1' 则连通   
                return flag;  
            }else if(m[i][j]=='-'){  
                flag = true;    // 有一个 '-' 则不连通   
                return flag;  
            }  
            return flag;  
        }  
    // c='-' 检查行左侧是否连通   
    public static boolean rowL(char[][] m,int i,int j,char c){  
        if(j<0){  
            flag = true;    // 都不连通   
            return flag;  
        }  
        if(m[i][j]=='0'){  
            return rowL(m,i,j-1,c);  
        }else if(m[i][j]=='1'){  
            flag = true;    // 有一个 '1' 则不连通   
            return flag;  
        }else if(m[i][j]=='-'){  
            flag = false;   // 有一个 '-' 则连通   
            return flag;  
        }  
        return flag;  
    }  
    // c='-' 检查行右侧是否连通   
    public static boolean rowR(char[][] m,int i,int j,char c){  
        if(j>=m[i].length){  
            flag = true;    // 都不连通   
            return flag;  
        }  
        if(m[i][j]=='0'){  
            return rowR(m,i,j+1,c);  
        }else if(m[i][j]=='1'){  
            flag = true;    // 有一个 '1' 则不连通   
            return flag;  
        }else if(m[i][j]=='-'){  
            flag = false;   // 有一个 '-' 则连通   
            return flag;  
        }  
        return flag;  
    }  
    // 当c='1'时 检查是否连通1111111111111111111   
    public static boolean check1(char[][] m, int i, int j, char c) {  
        if(colU(m,i,j,c)&&colD(m,i,j,c)){   // 是 '1' 时 检查(上下)是否连通   
            flag = true;  
        }else{  
            return false;  
        }  
        return flag;  
    }  
    // 当c='-'时 检查是否连通-------------------   
    public static boolean check2(char[][] m, int i, int j, char c) {  
        if(rowL(m,i,j,c)&&rowR(m,i,j,c)){   // 是 '-' 时 检查(左右)是否连通   
            flag = true;  
        }else{  
            return false;  
        }  
        return flag;  
    }  
    // 检测并添加元素   
    public static void calc2(char[][] m,int i,int j){  
        if(check1(m, i, j, '1')){   // 等于'1'时,行列都不连通   
            m[i][j] = '1';  // 则添加元素   
        }else if(check2(m, i, j, '-')){// 等于'-'时,行列都不连通   
            m[i][j] = '-';// 则添加元素   
        }else{  
            flag2 = true;   // 表示无结果   
        }  
    }  
    // 计算函数的入口   
    public static void calc(char[][] m){  
        for(int i=0;i<m.length;i++){  
            for(int j=0;j<m[i].length;j++){  
                if(m[i][j]=='0'){  
                    calc2(m,i,j);   // 进入检测函数   
                }  
                if(flag){  
                    String temp = i+""+j+""+m[i][j];  
                    System.out.println(temp);  
                    flag2 = false;  // 如果有元素添加,那么就不为空!下边的就不必输出"空"值   
                    break; // 如果添加过元素,则退出循环   
                }  
            }  
            if(flag){ // 如果添加过元素,则退出循环   
                flag = false;  
                break;  
            }  
        }  
        if(flag2){  // 如果无结果,则添加空   
            System.out.println("空");      
            flag2 = false;  // 修改标记位   
        }  
    }  
    // 主函数   
    public static void main(String[] args){  
        Scanner scan = new Scanner(System.in);  
        List<char[][]> lis = new ArrayList<char[][]>(); // 存放每个数组   
        System.out.print("输入整数 n(n<100):");  
        // 创建n个数组  初始化,并存入lis   
        input(lis,scan.nextInt());    
        // 计算函数的入口, 单独去每个数组去测试   
        for(int i=0;i<lis.size();i++){  
            calc(lis.get(i));     
        }  
    }  


}
