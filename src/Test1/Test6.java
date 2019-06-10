package Test1;

public class Test6 {
	
	public static int count=0;
	/*04届蓝桥杯  李白喝酒
	 * 标题：李白打酒

    话说大诗人李白，一生好饮。幸好他从不开车。

    一天，他提着酒壶，从家里出来，酒壶中有酒2斗。他边走边唱：

    无事街上走，提壶去打酒。
    逢店加一倍，遇花喝一斗。

    这一路上，他一共遇到店5次，遇到花10次，已知最后一次遇到的是花，他正好把酒喝光了。 

    请你计算李白遇到店和花的次序，可以把遇店记为a，遇花记为b。则：babaabbabbabbbb 就是合理的次序。像这样的答案一共有多少呢？请你计算出所有可能方案的个数（包含题目给出的）。

    注意：通过浏览器提交答案。答案是个整数。不要书写任何多余的内容。
	 * 
	 * a 代表酒店的个数
	 * b 代表花
	 * c代表收中酒的数量
	 */
	public static void F(int a,int b,int c)
	{
		
		if (a>0) {
			F(a-1, b, c*2);//
		}
		if (b>0) {
			F(a, b-1, c-1);
		}
		if (a==0&&b==1&&c==1) {//店遇完了  还有一朵花  手中酒还有一斗
			count++;
		}
		
	}
	public static void main(String[] args) {
		
		F(5, 10, 2);
		System.out.println(count);
	}
}
