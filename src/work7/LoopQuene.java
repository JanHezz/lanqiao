package work7;

public class LoopQuene<T> {
	public int mFront=0;//��ͷָ��
	public int mRear=0;//��βָ��
	public Object[] data;//�����ݵ�����
	public int size;
	public LoopQuene(int size)
	{
		this.size=size;
		data=new Object[size];
	}
   public void Add(T mdata)
   {
	   //����
	   if (mRear==mFront&&data[mFront]!=null) {
		throw new IndexOutOfBoundsException("����");
	}
	   data[mRear]=mdata;
	   mRear++;
	   //��ͷ���ͷ
	   mRear=mRear==size?0 :mRear;
   }
   
   //ɾ����ͷԪ��
   public void Delete()
   {  //�ж϶Կ�
	   if (mFront==mRear&&data[mRear]==null) {
       throw new NullPointerException("�ն���");		
	  }
	   data[mFront++]=null;
	   //��ͷ��ͷ
	   mFront=mFront==size?0:mFront;
   }
@Override
public String toString() {
	// TODO Auto-generated method stub
	if (data[mFront]==null) {
		return "[]";
	}
	
	if (mFront<mRear)//��ͷС�ڶ�β��ö��е������� mfront �� mrear֮�� 
	{
	StringBuffer sb=new StringBuffer();
	for(int i=mFront;i<mRear;i++)
	{
		sb.append(data[i]+" ");
	}
		return sb.toString();
	}
	
else
{
	//�����ڶ�ͷ ��size ֮�� ���� 0 �� ��β֮��
	StringBuffer sb=new StringBuffer();
	for(int i=mFront;i<size;i++)
	{
		sb.append(data[i]+" ");
	}
	for(int j=0;j<mRear;j++)
	{
		sb.append(data[j]+" ");
	}

	return sb.toString();
	}
 
}
}
