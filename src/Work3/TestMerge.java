package Work3;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class TestMerge {
	public static void sort(int[] array){  
        int length = array.length; 
        //4
        int[] tmpArray = new int[ length ];  
        sort(array, tmpArray, 0, length-1);  
    }  
	public static void sort(int[] array, int[] tmpArray, int left, int right){  
        if(left < right){  
            int center = (left + right)/2;    //ȡ�м�ֵ  
           
            sort(array, tmpArray, left, center);    //�ݹ�ֽ�  
            sort(array, tmpArray, center+1, right);    //�ݹ�ֽ�  
            merge(array, tmpArray, left, center+1, right);    //�ϲ�����  
        }  
    } 
	 private static void merge(int[] array, int[] tmpArray, int leftStart, int rightStart, int rightEnd) {  
	        int leftEnd = rightStart - 1;    //��������ֹ�±�  
	        int tmpPos = leftStart;    //��������  
	        int total = rightEnd - leftStart + 1;    //��Ҫ�ϲ�������Ԫ������  
	  System.out.println(leftStart+" "+rightStart+" "+rightEnd);
	  //0  1  1
	        while(leftStart <= leftEnd && rightStart <= rightEnd){  
	            if(array[ leftStart ] <= array[ rightStart ]){  
	                //����������Ԫ��С�ڻ�����Ҳ�����Ԫ�أ����������Ԫ�ص�ֵ������ʱ���飬���ƶ���������±�  
	                tmpArray[ tmpPos++ ] = array[ leftStart++ ];  
	            }else{  
	                //����������Ԫ�ش����Ҳ�����Ԫ�أ����Ҳ�����Ԫ�ص�ֵ������ʱ���飬���ƶ��Ҳ������±�  
	                tmpArray[ tmpPos++ ] = array[ rightStart++ ];  
	            }  
	        }  
	  
	        //����������Ԫ��û��ȫ��������ʱ���飬��ʣ��Ԫ��ѭ��д����ʱ����  
	        while(leftStart <= leftEnd){  
	            tmpArray[ tmpPos++ ] = array[ leftStart++ ];  
	        }  
	  
	        //����Ҳ�����Ԫ��û��ȫ��������ʱ���飬��ʣ��Ԫ��ѭ��д����ʱ����  
	        while(rightStart <= rightEnd){  
	            tmpArray[ tmpPos++ ] = array[ rightStart++ ];  
	        }  
	  
	        //����ʱ����������õ�Ԫ��д��ԭ����  
	        for(int i = 0; i < total; i++ ,rightEnd--){  
	            array[rightEnd] = tmpArray[rightEnd];  
	        }  
	  
	    }  
	 public static void merge(int[] a, int low, int mid, int high) {
		System.out.println(low);
		System.out.println(mid);
		System.out.println(high);
	        int[] temp = new int[high - low + 1];
	        int i = low;// ��ָ��
	        int j = mid + 1;// ��ָ��
	        int k = 0;
	        // �ѽ�С�������Ƶ���������
	        while (i <= mid && j <= high) {
	            if (a[i] < a[j]) {
	                temp[k++] = a[i++];
	            } else {
	                temp[k++] = a[j++];
	            }
	            //14
	        }
	        // �����ʣ�������������
	        while (i <= mid) {
	            temp[k++] = a[i++];
	        }
	        // ���ұ߱�ʣ�������������
	        while (j <= high) {
	            temp[k++] = a[j++];
	        }
	        // ���������е�������nums����
	        for (int k2 = 0; k2 < temp.length; k2++) {
	            a[k2 + low] = temp[k2];
	        }
	    }

	    public static void mergeSort(int[] a, int low, int high) {
	        int mid = (low + high) / 2;
	       
	        //���
	        //mid=3 low=0 high=7
	        //mid=1 low=0 high=3
	        //mid=0 low=0 high=1
	     
	        //�ұ�
	        //mid=1  right=2 high=2
	        if (low < high) {
	            // ��� 
	      /*  System.out.println(low);	
	        System.out.println(mid);
	        System.out.println(high);*/
	            mergeSort(a, low, mid);
	            // �ұ�
	            mergeSort(a, mid + 1, high);
	            // ���ҹ鲢
	            merge(a, low, mid, high);
	            System.out.println(Arrays.toString(a));
	        }
	        else {
				return;
			}

	    }
	    public static void main(String[] args) throws InterruptedException {
			int [] a= {1,5,4,2,3,8,10,9};
			System.out.println(Arrays.toString(a));
			int miniLengh=a.length/2;
			int [] b=new int[miniLengh];
			int [] c=new int[miniLengh];
			for(int i=0;i<2;i++)
			{
				int start=miniLengh*i;
				int end=miniLengh*(i+1);
				if (i==0) {
					for(int k=start,j=0;k<end;k++,j++)
					{
						b[k]=a[j];
						
					}
					
				}
				else if(i==1) {
					for(int k=start,j=0;k<end;k++,j++)
					{
						c[j]=a[k];
						
					}
					
				}
			}
			  CountDownLatch latch = new CountDownLatch(2);  
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					sort(b);
					latch.countDown();//����������ж��߳�
				}
			}).start();
			
	new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					sort(c);
					latch.countDown();//����������ж��߳�
				}
			}).start();
			latch.await();//�������߳�
			merge(b, c, a);
		
			System.out.println(Arrays.toString(a));
		}
	    private static void merge(int[] a1, int[] a2, int[] tmpArray){  
	        int length1 = a1.length;  
	        int length2 = a2.length;  
	      //1245
	      //38910
	        //1 2 3 4 5 8 9 10
	        int left = 0;  
	        int right = 0;  
	        int pos = 0;  
	       //left 1 2 3 4
	        //right 1
	        while(left < length1 && right < length2){  
	            if(a1[left] <= a2[right]){  
	                tmpArray[pos++] = a1[left++];  
	                  
	            }else{  
	                tmpArray[pos++] = a2[right++];  
	                
	            }  
	            
	        }  
	  
	        while(left < length1){  
	            tmpArray[ pos++ ] = a1[ left++ ];  
	        }  
	  
	        while(right < length2){  
	            tmpArray[ pos++ ] = a2[ right++ ];  
	        }  
	  
	    }  
}
