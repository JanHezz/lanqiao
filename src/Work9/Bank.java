package Work9;



import java.util.ArrayList;
import java.util.Random;



public class Bank {
	
	private int mArriveTime;	

	private int mCustomerNum;
	private int timer=0;
	private ArrayList<Integer> mEvent=new ArrayList<Integer>();
	private Window[] mWindows=new Window[4];
	public Random random=new Random();
	private int totaltime=0;
	public int Id=0;
	public boolean isClose=false;

	public Bank()
	{
	
	mArriveTime=0;
	 mCustomerNum=0;
	
	 for(int i=0;i<mWindows.length;i++)
	 {
		 mWindows[i]=new Window("����"+(i+1));
	 }
	}
	//��ʼӪҵӪҵʱ��Ϊ480����
	public void OpenBank()
	{
		int wait=random.nextInt(5);
		int duringTime=random.nextInt(30)+1;
		int min=MiniList();//ȡ����̵Ĵ���
		mCustomerNum++;
		Add(min,new Work9.Data(mCustomerNum, mArriveTime, duringTime));
		 mEvent.add(min);
	while(mEvent.size()!=0||mArriveTime<=480)//���пͻ���δ����ʱ
	{
		if (mArriveTime<=480) {//
			CustomerArrave();//�ͻ�����
		}
		else {
			isClose=true;
		}
		if (mEvent.size()!=0) {//��������Ϊ������
			
			Customerleave();//����˿��뿪
 				
			}
		}
	for(int i=0;i<mWindows.length;i++)
	{
		totaltime+=mWindows[i].WaitTime;
	}
	System.out.println("һ��"+mCustomerNum+"��"+"ƽ���ȴ�ʱ��Ϊ"+totaltime/mCustomerNum);
	
	}
	//�˿�����
	public void CustomerArrave()
	{
	 int wait=random.nextInt(5);
       int  duringTime=random.nextInt(30)+1;
	   int  min=MiniList();
		mCustomerNum++;
		Add(min,new Work9.Data(mCustomerNum, mArriveTime,duringTime));
		mEvent.add(min);
		mArriveTime+=wait;
	}
	//�˿��뿪
	public void Customerleave()
	{
		
			while(isClose) {//������
				timer++;
				while(timer>=Next()&&mEvent.size()>0)
				{   
					mWindows[Id].Leave();
					mEvent.remove(0);
				}
				if (mEvent.size()==0) {
					isClose=false;
				}
			}	
			while(timer<=mArriveTime)
				{
					
					while(timer>=Next()&&mEvent.size()>0) {
					mWindows[Id].Leave();
					mEvent.remove(0);
					
				}
					timer++;
				}
				
			}
		
		
	
	//�����̵Ķ���
	public int MiniList()
	{    int min1=0;
		int min=mWindows[0].Length();
		for(int i=0;i<mWindows.length;i++)
		{
			if (min>mWindows[i].Length()) {
				min=mWindows[i].Length();
				min1=i;
			}
			
		}
				
		return min1;	
	}
	//��ӹ˿�
	public void Add(int i,Work9.Data data)
	{
		mWindows[i].AddCustomer(data);
		
	}
//��һ����Ҫ�뿪��ʱ��
public int Next()
{   int time=100000;

	if (mWindows[0].leavetime.size()!=0) {
	 time=mWindows[0].leavetime.get(0);
	 Id=0;
      }

	
	for(int i=0;i<mWindows.length;i++)
	{
		if (mWindows[i].leavetime.size()!=0) {
			if (time>mWindows[i].leavetime.get(0)) {
			time=mWindows[i].leavetime.get(0);
			Id=i;
		}
		}
		
	}
	return time;
}


}
