package com.work.dataStruct.tree;

public class Test1 {
public static void main(String[] args) {
	
	ArrayTree<String> tree=new ArrayTree<String>(5, "��");
	tree.add(0, "��һ����ڵ�", true);
	tree.add(1, "�ڶ�����ڵ�", true);
	tree.add(0, "��һ���ҽڵ�", false);
	tree.add(1, "�ڶ����ҽڵ�", false);
	tree.add(2, "�������ҽڵ�", false);
	tree.add(3, "�������ҽڵ�", false);

	System.out.println(tree.toString());
}
}
