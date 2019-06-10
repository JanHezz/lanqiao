package work7;

public class Test5 {
public static void main(String[] args) {
	LoopQuene<String> loopQuene=new LoopQuene<String>(5);
	for(int i=0;i<5;i++)
	{
		loopQuene.Add(" "+i);
	}
	System.out.println(loopQuene);
	loopQuene.Delete();
	System.out.println(loopQuene);
	loopQuene.Add(" "+0);
	System.out.println(loopQuene);
}
}
