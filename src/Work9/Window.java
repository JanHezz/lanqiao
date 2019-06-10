package Work9;

import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Window {
	public int customerNum=0;
	public String name;
	public int WaitTime=0;
	public ArrayList<Data> mdDatas=new ArrayList<Data>();    //客户的编号和数据
	public ArrayList<Integer> leavetime=new ArrayList<Integer>();//离店时间
  
    public Window(String name)
    {
    	this.name=name;
    }
    public int Length()
    {
    	return mdDatas.size();
    }
    //顾客离开
    public void Leave()
    {  if (mdDatas.size()>0&&leavetime.size()>0) {
    	WaitTime=leavetime.get(0)-mdDatas.get(0).arrave;
	
		
		mdDatas.remove(0);
		
		leavetime.remove(0);
	}
    }
    //顾客进来
    public void AddCustomer(Data data)
    { 
    	customerNum++;
    	int i=leavetime.size();
    	if (leavetime.isEmpty()) {//不需要等待
    		mdDatas.add(data);
        	leavetime.add(data.arrave+data.duringtime);
		}
    	else {
        	if (data.arrave<leavetime.get(i-1)) {
        		mdDatas.add(data);
    			leavetime.add(leavetime.get(i-1)+data.duringtime);
    		}
        	else {
        		mdDatas.add(data);
    			leavetime.add(data.arrave+data.duringtime);
    		}
		}

    	System.out.println(name+":  "+"顾客"+Length()+"  "+data.customnum+" 进来时间"+data.arrave+"办事时间"+data.duringtime+"离开时间"+leavetime.get(i)) ;
	}
    	
    
    //顾客最近离开的时间
    public int NearlyLeave()
    {
    	return leavetime.get(0);
    }


}
