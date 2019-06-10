package com.lanqiao.practice2;

import java.util.Scanner;

public class Test5 {
	
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        while (sc.hasNext()) {
	            F(sc.nextInt());
	        }
	        sc.close();
	    }
	     
	    private static void F(int y){
	        int d = 4; //1998年1月1日为星期四
	        for(int i = 1998; i <= y-1; i++){
	            if((i % 400 == 0) || (i%4 == 0 && i%100 != 0))
	                d += 366;
	            else
	                d += 365;
	        }
	        d %= 7; //得到第y年1月1日为星期d
	        int sum = 0, count = 0;
	        for(int m = 0; m < 12; m++){
	            
	                switch(m){
	                    case 2:
	                        if((y%400 == 0) || (y%4 == 0 && y%100 != 0))
	                            sum += 29;
	                        else
	                            sum += 28;
	                        break;
	                    case 4:
	                    case 6:
	                    case 9:
	                    case 11:
	                        sum += 30;
	                        break;
	                    default:
	                        sum += 31;
	                }
	            
	             
	            if((d+12) % 7 == 5) count++;
	               
	            d+=sum;
	        }
	         
	        System.out.println(count);
	    }

}
