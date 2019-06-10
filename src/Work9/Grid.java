package Work9;

public class Grid {
	   public int maxLength;//长
		public int maxWidth;//宽
		public String[][] Copy;
		public int count=0;
	//格子
	public String[][] grid=new String[][] {
		{"从","我","做","起","振"},
		{"从","做","起","振","兴"},
		{"做","起","振","兴","中"},
		{"起","振","兴","中","华"}
		};
		
		public String[] Trueth=new String[] {"从","我","做","起","振","兴","中","华"};//正确的格子
public int[][] Direc=new int[][]//右上左下的顺序
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
		//初始化数组
		public void Init()
		{

			for(int i=0;i<Copy.length;i++)
			{
				for(int j=0;j<Copy[i].length;j++)
				{   
					Copy[i][j]="6";
				}
				
			}
			Copy[0][0]="从";
		}
		/*
		 * startx开始x位置
		 * starty开始y的位置
		 * start 下一个需要判断的数字
		 */
		public void Dfs(int startx,int starty,int start)
		{          
			int nextx,nexty;
			if (start>=Trueth.length) {//走到华字了输出
				show(Copy);
				count++;
				System.out.println(count);
				return ;
			}
			for(int i=0;i<Direc.length;i++)//右上左下的顺序查找
			{
				nextx=startx+Direc[i][0];
				nexty=starty+Direc[i][1];
				if (nextx<0||nextx>=maxLength||nexty<0||nexty>=maxWidth) {//超出边界结束
					continue;
				}
				if (Trueth[start].equals(grid[nextx][nexty])){//下个格子是不是你想要的字
					 Copy[nextx][nexty]=Trueth[start];//标记
						Dfs(nextx, nexty, start+1);//走下一步
						Copy[nextx][nexty]="6";//回溯
				}
				
			}
		}
		//显示一个数组
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
