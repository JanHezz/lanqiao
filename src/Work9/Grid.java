package Work9;

public class Grid {
	   public int maxLength;//��
		public int maxWidth;//��
		public String[][] Copy;
		public int count=0;
	//����
	public String[][] grid=new String[][] {
		{"��","��","��","��","��"},
		{"��","��","��","��","��"},
		{"��","��","��","��","��"},
		{"��","��","��","��","��"}
		};
		
		public String[] Trueth=new String[] {"��","��","��","��","��","��","��","��"};//��ȷ�ĸ���
public int[][] Direc=new int[][]//�������µ�˳��
		{
	{0,1},
	{-1,0},
	{0,-1},
	{1,0}
		};
		public Grid()
		{
			maxLength=grid.length;
			System.out.println(maxLength);
			maxWidth=grid[0].length;
			System.out.println(maxWidth);
			Copy=new String[maxLength][maxWidth];
			Init();
			
			
		}
		//��ʼ������
		public void Init()
		{

			for(int i=0;i<Copy.length;i++)
			{
				for(int j=0;j<Copy[i].length;j++)
				{   
					Copy[i][j]="6";
				}
				
			}
			Copy[0][0]="��";
		}
		/*
		 * startx��ʼxλ��
		 * starty��ʼy��λ��
		 * start ��һ����Ҫ�жϵ�����
		 */
		public void Dfs(int startx,int starty,int start)
		{          
			int nextx,nexty;
			if (start>=Trueth.length) {//�ߵ����������
				show(Copy);
				count++;
				System.out.println(count);
				return ;
			}
			for(int i=0;i<Direc.length;i++)//�������µ�˳�����
			{
				nextx=startx+Direc[i][0];
				nexty=starty+Direc[i][1];
				if (nextx<0||nextx>=maxLength||nexty<0||nexty>=maxWidth) {//�����߽����
					continue;
				}
				if (Trueth[start].equals(grid[nextx][nexty])){//�¸������ǲ�������Ҫ����
					 Copy[nextx][nexty]=Trueth[start];//���
						Dfs(nextx, nexty, start+1);//����һ��
						Copy[nextx][nexty]="6";//����
				}
				
			}
		}
		//��ʾһ������
		public void show(String[][] a)
		{
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{ 
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
}
