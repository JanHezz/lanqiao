package Work9;

import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Window {
	public int customerNum=0;
	public String name;
	public int WaitTime=0;
	public ArrayList<Data> mdDatas=new ArrayList<Data>();    //�ͻ��ı�ź�����
	public ArrayList<Integer> leavetime=new ArrayList<Integer>();//���ʱ��
  
    public Window(String name)
    {
    	this.name=name;
    }
    public int Length()
    {
    	return mdDatas.size();
    }
    //�˿��뿪
    public void Leave()
    {  if (mdDatas.size()>0&&leavetime.size()>0) {
    	WaitTime=leavetime.get(0)-mdDatas.get(0).arrave;
	
		
		mdDatas.remove(0);
		
		leavetime.remove(0);
	}
    }
    //�˿ͽ���
    public void AddCustomer(Data data)
    { 
    	customerNum++;
    	int i=leavetime.size();
    	if (leavetime.isEmpty()) {//����Ҫ�ȴ�
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

    	System.out.println(name+":  "+"�˿�"+Length()+"  "+data.customnum+" ����ʱ��"+data.arrave+"����ʱ��"+data.duringtime+"�뿪ʱ��"+leavetime.get(i)) ;
	}
    	
    
    //�˿�����뿪��ʱ��
    public int NearlyLeave()
    {
    	return leavetime.get(0);
    }


}
