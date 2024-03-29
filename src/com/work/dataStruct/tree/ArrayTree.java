package com.work.dataStruct.tree;

/**
 * 
 * @author  Jan
 2018年4月19日
 *
 * @param <T>
 */
public class ArrayTree<T> {

	private Object[] datas;
	private int DEFAULT_SIZE=8;
	private int deep;
	private int arraySize;
	//默认的size创建树
	public ArrayTree ()
	{
		deep=DEFAULT_SIZE;
		arraySize=(int) (Math.pow(2, deep)-1);
		datas=new Object[arraySize];
	}
	//指定deep创建树
	public ArrayTree(int deep)
	{
		this.deep=deep;
		arraySize=(int) (Math.pow(2, deep)-1);
		datas=new Object[arraySize];
		
	}
	//指定深度，指定根节点创建树
    public ArrayTree(int deep, T data) 
    {
		       this.deep = deep;
		       this.arraySize = (int) Math.pow(2, deep) - 1;
		        datas = new Object[arraySize];
		        datas[0] = data;
	 }
    
    /**
      * 为指定节点添加子节点
      *
      * @param index 需要添加子节点的父节点的索引
      * @param data  新子节点的数据
      * @param left  是否为左节点
      */
       public void add(int index, T data, boolean left) {
           if (datas[index] == null) {
            throw new RuntimeException(index + "处节点为空，无法添加子节点");
             }
            if (2 * index + 1 >= arraySize) {
              throw new RuntimeException("树底层的数组已满，树越界异常");
                  }
           // 添加左子节点
            if (left) {
                 datas[2 * index + 1] = data;
           } else {
                 datas[2 * index + 2] = data;
          }
        }
    
      // 判断二叉树是否为空
     public boolean empty() {
            // 根据根元素判断二叉树是否为空
            return datas[0] == null;
        }
    
         // 返回根节点
         public T root() {
           return (T) datas[0];
        }
     
         // 返回指定节点（非根结点）的父节点
      public T parent(int index) {
            return (T) datas[(index - 1) / 2];
         }
    
        // 返回指定节点（非叶子）的左子节点，当左子节点不存在时返回null
         public T left(int index) {
            if (2 * index + 1 >= arraySize) {
               throw new RuntimeException("该节点为叶子节点，无子节点");
             }
           return (T) datas[index * 2 + 1];
       }
     
         // 返回指定节点（非叶子）的右子节点，当右子节点不存在时返回null
        public T right(int index) {
            if (2 * index + 1 >= arraySize) {
               throw new RuntimeException("该节点为叶子节点，无子节点");
             }
          return (T) datas[index * 2 + 2];
       }
     
         // 返回该二叉树的深度
         public int deep(int index) {
         return deep;
        }
     
         // 返回指定节点的位置
         public int pos(T data) {
            // 该循环实际上就是按广度遍历来搜索每个节点
           for (int i = 0; i < arraySize; i++) {
              if (datas[i].equals(data)) {
                 return i;
                }
   
           }
            return -1;
        }
    
        public String toString() {
            return java.util.Arrays.toString(datas);
        }
	
}
