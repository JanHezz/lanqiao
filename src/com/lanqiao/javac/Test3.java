package com.lanqiao.javac;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Test3 {
	/*
	 * ��7���������
	 * 
ƽ��ĩβ

�ܹ���ʾΪĳ��������ƽ�������ֳ�Ϊ��ƽ������
���磬25,64
��Ȼ�޷�����˵��ĳ������ƽ���������������Զ϶�ĳ��������ƽ������
��Ϊƽ������ĩλֻ�����ǣ�[0, 1, 4, 5, 6, 9] ��6�������е�ĳ����
���ԣ�4325435332��Ȼ����ƽ������

�������һ��2λ��2λ���ϵ����֣����ܸ���ĩλ����λ���϶�������ƽ������

�����һ�£�һ��2λ���ϵ�ƽ�����������λ�ж����ֿ����ԣ�

ע�⣺��Ҫ�ύ����һ����������ʾ2λ���ϵ�ƽ���������λ�Ĳ�ͬ�������
��Ҫ��д�κζ������ݣ����磬˵���������ֵȣ�

	 * @˼·:��ʵ����4��100����λ����Ψһ���ó���
	 */
	public static void main(String[] args) {
		
		List mlist=new ArrayList();
		for(int i=4;i<100;i++)
		{
			int temp=i*i;
			temp=(temp/10%10)*10+temp%10;//ȡ�ú���λ
			if (!mlist.contains(temp)) {
				mlist.add(temp);
			}
			
		}
		System.out.println(mlist.size());
	}

}
