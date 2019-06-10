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
            int center = (left + right)/2;    //取中间值  
           
            sort(array, tmpArray, left, center);    //递归分解  
            sort(array, tmpArray, center+1, right);    //递归分解  
            merge(array, tmpArray, left, center+1, right);    //合并排序  
        }  
    } 
	 private static void merge(int[] array, int[] tmpArray, int leftStart, int rightStart, int rightEnd) {  
	        int leftEnd = rightStart - 1;    //左侧数组截止下标  
	        int tmpPos = leftStart;    //数组坐标  
	        int total = rightEnd - leftStart + 1;    //需要合并的数组元素数量  
	  System.out.println(leftStart+" "+rightStart+" "+rightEnd);
	  //0  1  1
	        while(leftStart <= leftEnd && rightStart <= rightEnd){  
	            if(array[ leftStart ] <= array[ rightStart ]){  
	                //如果左侧数组元素小于或等于右侧数组元素，将左侧数组元素的值存入临时数组，并移动左侧数组下标  
	                tmpArray[ tmpPos++ ] = array[ leftStart++ ];  
	            }else{  
	                //如果左侧数组元素大于右侧数组元素，将右侧数组元素的值存入临时数组，并移动右侧数组下标  
	                tmpArray[ tmpPos++ ] = array[ rightStart++ ];  
	            }  
	        }  
	  
	        //如果左侧数组元素没有全部存入临时数组，将剩余元素循环写入临时数组  
	        while(leftStart <= leftEnd){  
	            tmpArray[ tmpPos++ ] = array[ leftStart++ ];  
	        }  
	  
	        //如果右侧数组元素没有全部存入临时数组，将剩余元素循环写入临时数组  
	        while(rightStart <= rightEnd){  
	            tmpArray[ tmpPos++ ] = array[ rightStart++ ];  
	        }  
	  
	        //将临时数组中排序好的元素写入原数组  
	        for(int i = 0; i < total; i++ ,rightEnd--){  
	            array[rightEnd] = tmpArray[rightEnd];  
	        }  
	  
	    }  
	 public static void merge(int[] a, int low, int mid, int high) {
		System.out.println(low);
		System.out.println(mid);
		System.out.println(high);
	        int[] temp = new int[high - low + 1];
	        int i = low;// 左指针
	        int j = mid + 1;// 右指针
	        int k = 0;
	        // 把较小的数先移到新数组中
	        while (i <= mid && j <= high) {
	            if (a[i] < a[j]) {
	                temp[k++] = a[i++];
	            } else {
	                temp[k++] = a[j++];
	            }
	            //14
	        }
	        // 把左边剩余的数移入数组
	        while (i <= mid) {
	            temp[k++] = a[i++];
	        }
	        // 把右边边剩余的数移入数组
	        while (j <= high) {
	            temp[k++] = a[j++];
	        }
	        // 把新数组中的数覆盖nums数组
	        for (int k2 = 0; k2 < temp.length; k2++) {
	            a[k2 + low] = temp[k2];
	        }
	    }

	    public static void mergeSort(int[] a, int low, int high) {
	        int mid = (low + high) / 2;
	       
	        //左边
	        //mid=3 low=0 high=7
	        //mid=1 low=0 high=3
	        //mid=0 low=0 high=1
	     
	        //右边
	        //mid=1  right=2 high=2
	        if (low < high) {
	            // 左边 
	      /*  System.out.println(low);	
	        System.out.println(mid);
	        System.out.println(high);*/
	            mergeSort(a, low, mid);
	            // 右边
	            mergeSort(a, mid + 1, high);
	            // 左右归并
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
					latch.countDown();//完成任务了切断线程
				}
			}).start();
			
	new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					sort(c);
					latch.countDown();//完成任务了切断线程
				}
			}).start();
			latch.await();//唤醒主线程
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
