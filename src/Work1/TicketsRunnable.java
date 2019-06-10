package Work1;

public class TicketsRunnable implements Runnable{
 public int count=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(count<20)
		{
			
			
			synchronized(this)
			{
				if (count<20) {
					count++;
					
			System.out.println(Thread.currentThread().getName()+":"+count);
				}
			
			}
		}
	}

}
