package Work2;

public class TeacherRunnable implements Runnable {
	private int count=80;
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			
		
			
		
			
				while(true)
		{
					synchronized(this)
		 {
			
			try {
				
			if (count>0) {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+"��"+count+"����ҵ");
			count--;
			}
			
			
			
			} catch (Exception e) {
				// TODO: handle exception
			}
		
			
		 }
		}
	
	}

}
