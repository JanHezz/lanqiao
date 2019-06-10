package Work2;

public class MyRunable1 implements Runnable {
	private int count=0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(count<50)
		{
			count++;
			System.out.println("new");
			
		}
		
	}
	
	
	

}
