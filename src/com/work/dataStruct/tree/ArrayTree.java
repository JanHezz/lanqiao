package com.work.dataStruct.tree;

/**
 * 
 * @author  Jan
 2018��4��19��
 *
 * @param <T>
 */
public class ArrayTree<T> {

	private Object[] datas;
	private int DEFAULT_SIZE=8;
	private int deep;
	private int arraySize;
	//Ĭ�ϵ�size������
	public ArrayTree ()
	{
		deep=DEFAULT_SIZE;
		arraySize=(int) (Math.pow(2, deep)-1);
		datas=new Object[arraySize];
	}
	//ָ��deep������
	public ArrayTree(int deep)
	{
		this.deep=deep;
		arraySize=(int) (Math.pow(2, deep)-1);
		datas=new Object[arraySize];
		
	}
	//ָ����ȣ�ָ�����ڵ㴴����
    public ArrayTree(int deep, T data) 
    {
		       this.deep = deep;
		       this.arraySize = (int) Math.pow(2, deep) - 1;
		        datas = new Object[arraySize];
		        datas[0] = data;
	 }
    
    /**
      * Ϊָ���ڵ�����ӽڵ�
      *
      * @param index ��Ҫ����ӽڵ�ĸ��ڵ������
      * @param data  ���ӽڵ������
      * @param left  �Ƿ�Ϊ��ڵ�
      */
       public void add(int index, T data, boolean left) {
           if (datas[index] == null) {
            throw new RuntimeException(index + "���ڵ�Ϊ�գ��޷�����ӽڵ�");
             }
            if (2 * index + 1 >= arraySize) {
              throw new RuntimeException("���ײ��������������Խ���쳣");
                  }
           // ������ӽڵ�
            if (left) {
                 datas[2 * index + 1] = data;
           } else {
                 datas[2 * index + 2] = data;
          }
        }
    
      // �ж϶������Ƿ�Ϊ��
     public boolean empty() {
            // ���ݸ�Ԫ���ж϶������Ƿ�Ϊ��
            return datas[0] == null;
        }
    
         // ���ظ��ڵ�
         public T root() {
           return (T) datas[0];
        }
     
         // ����ָ���ڵ㣨�Ǹ���㣩�ĸ��ڵ�
      public T parent(int index) {
            return (T) datas[(index - 1) / 2];
         }
    
        // ����ָ���ڵ㣨��Ҷ�ӣ������ӽڵ㣬�����ӽڵ㲻����ʱ����null
         public T left(int index) {
            if (2 * index + 1 >= arraySize) {
               throw new RuntimeException("�ýڵ�ΪҶ�ӽڵ㣬���ӽڵ�");
             }
           return (T) datas[index * 2 + 1];
       }
     
         // ����ָ���ڵ㣨��Ҷ�ӣ������ӽڵ㣬�����ӽڵ㲻����ʱ����null
        public T right(int index) {
            if (2 * index + 1 >= arraySize) {
               throw new RuntimeException("�ýڵ�ΪҶ�ӽڵ㣬���ӽڵ�");
             }
          return (T) datas[index * 2 + 2];
       }
     
         // ���ظö����������
         public int deep(int index) {
         return deep;
        }
     
         // ����ָ���ڵ��λ��
         public int pos(T data) {
            // ��ѭ��ʵ���Ͼ��ǰ���ȱ���������ÿ���ڵ�
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
