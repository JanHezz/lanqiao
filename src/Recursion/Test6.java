package Recursion;

import java.util.HashMap;
import java.util.Map;

public class Test6 {
	
		// 如何避免大量的重复计算
		// 通用法：缓存  用map (键值对，字典)
		static long g(Map map, int n){
			Long t = (Long)map.get(n);
			
			if(t != null){
				return t;
			}	
			long r = g(map, n-1) + g(map, n-2);
			map.put(n, r);
			return r;
		}
		//g(map, 4)               + g(map, 3);
		//g(map,3)                +g(map,2)
		//g(map,2)+g(map,1)
		// 斐波那契数列的第n项目
		static long f(int n){
			if(n==1 || n==2) return 1;
			return f(n-1) + f(n-2);
		}
		//f(4)         +               f(3)
		//f(3)                         +f(2)
		//f(2)+f(1)
		public static void main(String[] args){
			Map map = new HashMap();
			map.put(1,1L);
			map.put(2,1L);
			
			System.out.println(g(map, 4));
	
		//  System.out.println(f(50));
		}
	

}
