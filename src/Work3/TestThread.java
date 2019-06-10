package Work3;

public class TestThread {
	public static Object Lock=new Object();
	public static boolean isOne=true;
 public static int num=1;

	
public static void Print()
{
	if (isOne) {
		System.out.print(num+",");
	}
	else {
	
		System.out.print((char)(96+num)+"  ");
		if (num%4==0) {
		System.out.println();
	                }
		num++;
	}
	
	}
public static void main(String[] args) {
	
new Thread(new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (Lock) {
		 //Lock.notifyAll();
			
			while(num<=26)
			{
				
					
					try {
					//	System.out.println(211);
						Print();
					    isOne=false;
					    Lock.notify();
						Lock.wait();
					
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Lock.notifyAll();
				
				
		
		}
		
			
		
		}
			
		}
}).start();
new Thread(new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		synchronized (Lock) {
				
			while(num<=26)
			{
									
					try {
						//System.out.println(985);
						Print();
					   isOne=true;
					   Lock.notify();
						Lock.wait();	
					
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
			
		  }
				
						
}
		}
}).start();;
	
}
}
