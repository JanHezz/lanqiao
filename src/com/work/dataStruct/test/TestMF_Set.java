package com.work.dataStruct.test;

import com.work.dataStruct.mFset.MFSet;
import com.work.dataStruct.mFset.NumParis;

/**
 * 
 * @author  Jan
 2018��4��27��
 *
 */
public class TestMF_Set {
public static void main(String[] args) {
	
	  Integer[] S = new Integer[8];  
      for(int i=0;i<8;i++)  
          S[i] = new Integer(i+1);  
         
      MFSet example = new MFSet(S);//  
      //�ȼ۹�ϵ                                    = {��1��2������3��4������5��6������7��8������1��3������5��7������1��5��}��  
         
      //ȷ���ȼ���  
      NumParis[] numPairs = new NumParis[]{new NumParis(1, 2),new NumParis(3, 4),new NumParis(5, 6),new NumParis(7,8)  
      ,new NumParis(1,3),new NumParis(5, 7),new NumParis(1, 5),new NumParis(8,9)};  
         
      example.div_equalClass(numPairs);//ȷ���ȼ���  
}
}
