package Work2;

public class CountThread extends Thread{
	private int m_Start;
public static int sum;
//1
//11
//21
	public CountThread(int start)
	{
		m_Start=start;
		
	}
	//同步方法
	public synchronized void  Add(int num)
	{
		sum+=num;
	}

		public void run() {
			int num=0;
			for(int  i=0;i<10;i++)
			{   
			 num+=m_Start+i;
			}
			Add(num);
			
		}


}
