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

	//初始化操作，构造一个由n个子集Si...Sn（每个子集只含单个成员Xi）构成的集合S。 
	public void Init(Object [] xi)
	{
		for(int i=0;i<xi.length;i++)
		{
			mfset[i+1]=new TreeNode(xi[i]);
		}
	}
	
	//找个这个对象得父节点
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
	//把父节点以上的全变成根节点的孩子        所以返回的即是根节点
	 public TreeNode  fix_findParent(Object x){  
	        TreeNode si = null;  
	           
	        //找到存储x的节点  
	        for(TreeNode ele : mfset){  
	            if(ele!=null && ele.toString().equals(x.toString())){  
	                si = ele; break;  
	            }  
	        }  
	        if(si == null) return si;//x不存在  
	           
	        ArrayList<TreeNode> path = new ArrayList<>();//存储搜索路径   
	        while(si.getParentTree() != null){  
	            path.add(si);  
	            si = si.getParentTree();  
	        }  
	           
	        for(TreeNode ele : path)//将从i至根路径上的所有节点都变成根的孩子节点  
	          ele.setParentTree(si);
	           
	        return si;  
	    }  
	
	//归并两个子集
	public void merge_mset(TreeNode s1,TreeNode s2)
	{
		if (s1!=null&&s2!=null) {
			s1.setParentTree(s2);
		}
	
	} 
	//让成员数量少的归并大的
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
            TreeNode S1 = fix_findParent(numPairs[i].x);//增强版查找函数  
            TreeNode S2 = fix_findParent(numPairs[i].y);  
               
            /*TreeNode S1 = find_mfset(numPairs[i].x);//原版查找函数 
            TreeNode S2 = find_mfset(numPairs[i].y);*/  
               
            if(S1 != S2){  
               merge_mset(S1, S2);//合并普通版  
                //mix_mfset(S1,S2);//合并增强版  
            }  
        }  
    }  
	
}
