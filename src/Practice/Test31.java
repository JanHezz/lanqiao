package Practice;

import java.util.HashSet;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Test31 {
	/*public static int min=0;
	public static void Caculate(int [][] grid,int startX,int StartY,int Sum,int count,int [][] mask)
	{
		
		if (count==Sum) {
			min++;
		}
		if (count>Sum) {
			return ;
		}
		
		
		if (startX>=0&&StartY>=0&&startX<grid.length&&StartY<grid[startX].length) {
			if (mask[startX][StartY]==0) {//寻过的格子就不选了
				count++;
				mask[startX][StartY]=1;
				Caculate(grid, startX-1, StartY, Sum, count,mask);
				Caculate(grid, startX+1, StartY, Sum, count,mask);
				Caculate(grid, startX, StartY+1, Sum, count,mask);
				Caculate(grid, startX, StartY-1, Sum, count,mask);
				mask[startX][StartY]=0;
			}
				
				
			}
				return ;
		}
	
		
	
	public static void main(String[] args) {
	   int [][] a=new int[3][4];
	   int sum=0;
	   for(int i=0;i<a.length;i++)
	   {
		   Scanner input=new Scanner(System.in);
		   for(int j=0;j<a[i].length;j++)
		   {
			  sum++;
			  a[i][j]=sum;
		   }
		   System.out.println();
	   }
	   
	   for(int i=0;i<a.length;i++)
	   {
		 
		   for(int j=0;j<a[i].length;j++)
		   {
			   Caculate(a, i, j, 5, 0,new int [3][4]);
		   }
		   
	   }
	  
	   System.out.println(min);
		
		 *  1 1 1 1

1 30 80 2

1 1 1 100
		 
	}
*/
	 public static int count = 0;    
	    public static int [] a = new int[5];    
	    public static HashSet<String> hashset = new HashSet<String>();  
	      
	    private static boolean check() {    
	        // TODO Auto-generated method stub    
	        boolean flag[] = new boolean[5];    
	        dfs(flag,0);    
	        return flag[0]&&flag[1]&&flag[2]&&flag[3]&&flag[4];    
	    }    
	    
	    private static void dfs(boolean[] flag,int n) {    
	        // TODO Auto-generated method stub    
	        flag[n] = true;    
	        for(int i = 0; i < 5; i++){    
	            //加一减一要在同一行、加四减四要在同一列    
	            if(!flag[i] && (a[i]/4 == a[n]/4) && (a[i] == a[n] - 1 || a[i] == a[n] + 1)){    
	                dfs(flag,i);    
	            }    
	            if (!flag[i] && (a[i]%4 == a[n]%4) && (a[i] == a[n] - 4 || a[i] == a[n] + 4)){    
	                dfs(flag,i);    
	            }    
	        }       
	    }  
	      
	    public static void main(String[] args){    
	        // TODO Auto-generated method stub    
	        for(a[0] = 0; a[0] < 12; ++a[0]){  
	            for(a[1] = a[0]+1; a[1] < 12; ++a[1]){  
	                for(a[2] = a[1]+1; a[2] < 12; ++a[2]){    
	                    for(a[3] = a[2]+1; a[3] < 12; ++a[3]){    
	                        for(a[4] = a[3]+1; a[4] < 12; ++a[4]){    
	                            if(check()){    
	                                hashset.add(""+a[0]+a[1]+a[2]+a[3]+a[4]);    
	                            }  
	                        }  
	                    }  
	                }  
	            }  
	        }  
	        System.out.println(hashset.size());    
	    }  
}
