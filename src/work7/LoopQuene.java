package work7;

public class LoopQuene<T> {
	public int mFront=0;//对头指针
	public int mRear=0;//对尾指针
	public Object[] data;//存数据的数组
	public int size;
	public LoopQuene(int size)
	{
		this.size=size;
		data=new Object[size];
	}
   public void Add(T mdata)
   {
	   //对满
	   if (mRear==mFront&&data[mFront]!=null) {
		throw new IndexOutOfBoundsException("对满");
	}
	   data[mRear]=mdata;
	   mRear++;
	   //到头则掉头
	   mRear=mRear==size?0 :mRear;
   }
   
   //删除对头元素
   public void Delete()
   {  //判断对空
	   if (mFront==mRear&&data[mRear]==null) {
       throw new NullPointerException("空对列");		
	  }
	   data[mFront++]=null;
	   //到头掉头
	   mFront=mFront==size?0:mFront;
   }
@Override
public String toString() {
	// TODO Auto-generated method stub
	if (data[mFront]==null) {
		return "[]";
	}
	
	if (mFront<mRear)//对头小于对尾则该队列的数据在 mfront 与 mrear之间 
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
	//数据在对头 到size 之间 加上 0 到 对尾之间
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
