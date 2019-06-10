package Practice;

import java.util.Scanner;

public class Test34 {
	public static void main(String[] args) {  
    	Scanner s=new Scanner(System.in);
    	int num=s.nextInt();
    	for (int i =num; i >0; i--) {
			find(i+"",num-i,i);
			System.out.println(" ");
		}
    }
    public static void find(String data,int current,int max){
    	if(current<0)return;
    	if(current==0)System.out.print(data+" ");
    	for (int i = max; i>0; i--) {
			find(data+"+"+i,current-i,i);
		}
    }


}
