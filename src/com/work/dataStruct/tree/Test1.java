package com.work.dataStruct.tree;

public class Test1 {
public static void main(String[] args) {
	
	ArrayTree<String> tree=new ArrayTree<String>(5, "根");
	tree.add(0, "第一个左节点", true);
	tree.add(1, "第二个左节点", true);
	tree.add(0, "第一个右节点", false);
	tree.add(1, "第二个右节点", false);
	tree.add(2, "第三个右节点", false);
	tree.add(3, "第三个右节点", false);

	System.out.println(tree.toString());
}
}
