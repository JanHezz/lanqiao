package JavaA;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
	/* ���ű�
	 * ��������
	 * JavaA��
	 */
	public static int count=0;
	public static void Dfs(int type,int num)
	{
		if (type>14) {//����ֻ��13��
			return;
		}
		if (num>13) {
			return;
		}
		if (num==13) {
			count++;
			return;
		}
		for(int i=0;i<=4;i++)//û������ֻ������
		{
			Dfs(type+1, num+i);//type����  num��ʾ���е����� 
		}
	}
	public static void main(String[] args) {
		Dfs(1, 0);//��һ������ 
      System.out.println(count);	  
	}

}
