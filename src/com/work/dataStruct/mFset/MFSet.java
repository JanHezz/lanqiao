package com.work.dataStruct.mFset;

import java.util.ArrayList;

public class MFSet {
	private int n;
	private  TreeNode [] mfset;
	
	public MFSet()
	{};
	public MFSet(Object[] xi)
	{
		this.n=xi.length;
		mfset=new TreeNode[xi.length+1];
	}

	//��ʼ������������һ����n���Ӽ�Si...Sn��ÿ���Ӽ�ֻ��������ԱXi�����ɵļ���S�� 
	public void Init(Object [] xi)
	{
		for(int i=0;i<xi.length;i++)
		{
			mfset[i+1]=new TreeNode(xi[i]);
		}
	}
	
	//�Ҹ��������ø��ڵ�
	public TreeNode findParent(Object x)
	{
		TreeNode parent=null;
		for (TreeNode treeNode : mfset) {
			if (treeNode!=null&&treeNode.toString().equals(x.toString())) {
				parent=treeNode;
			}
		}
		if (parent==null) {
			return parent;
		}
		if (parent!=null) {
			parent=parent.getParentTree();
		}
		
		
		return parent;
		
	}
	//�Ѹ��ڵ����ϵ�ȫ��ɸ��ڵ�ĺ���        ���Է��صļ��Ǹ��ڵ�
	 public TreeNode  fix_findParent(Object x){  
	        TreeNode si = null;  
	           
	        //�ҵ��洢x�Ľڵ�  
	        for(TreeNode ele : mfset){  
	            if(ele!=null && ele.toString().equals(x.toString())){  
	                si = ele; break;  
	            }  
	        }  
	        if(si == null) return si;//x������  
	           
	        ArrayList<TreeNode> path = new ArrayList<>();//�洢����·��   
	        while(si.getParentTree() != null){  
	            path.add(si);  
	            si = si.getParentTree();  
	        }  
	           
	        for(TreeNode ele : path)//����i����·���ϵ����нڵ㶼��ɸ��ĺ��ӽڵ�  
	          ele.setParentTree(si);
	           
	        return si;  
	    }  
	
	//�鲢�����Ӽ�
	public void merge_mset(TreeNode s1,TreeNode s2)
	{
		if (s1!=null&&s2!=null) {
			s1.setParentTree(s2);
		}
	
	} 
	//�ó�Ա�����ٵĹ鲢���
	public void mix_merge_mset(TreeNode s1,TreeNode s2)
	{
		if (s1==null||s2==null) return ;
		
		if (s1.getCount()>s2.getCount()) {
			s2.setCount(s1.getCount()+s2.getCount());
			s2.setParentTree(s1);
		}
		else {
			s1.setCount(s1.getCount()+s2.getCount());
			s1.setParentTree(s2);
		}
	
	} 
	
    public  void div_equalClass(NumParis[] numPairs){  
        for(int i=0;i<numPairs.length;i++){  
            TreeNode S1 = fix_findParent(numPairs[i].x);//��ǿ����Һ���  
            TreeNode S2 = fix_findParent(numPairs[i].y);  
               
            /*TreeNode S1 = find_mfset(numPairs[i].x);//ԭ����Һ��� 
            TreeNode S2 = find_mfset(numPairs[i].y);*/  
               
            if(S1 != S2){  
               merge_mset(S1, S2);//�ϲ���ͨ��  
                //mix_mfset(S1,S2);//�ϲ���ǿ��  
            }  
        }  
    }  
	
}
