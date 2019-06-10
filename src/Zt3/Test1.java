package Zt3;

import java.util.Stack;

public class Test1 {
	public static Boolean IsGoodBarket(String mString)
	{
		Stack<Character> stack=new Stack<Character>();
		for (int i = 0; i < mString.length(); i++) {
			char c=mString.charAt(i);
			if (c=='(') {
				stack.push(')');
			}
			if (c=='[') {
				stack.push(']');
			}
			if (c=='{') {
				stack.push('}');
			}
			if (c==')'||c==']'||c=='}') {
				if (stack.size()==0) {
					return false;//МоїХ
				}
				if(stack.pop()!=c) {
					return false;
				}
			}
			
		}
		if (stack.size()!=0) {
			return false;//МоїХ
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(IsGoodBarket("...(..[.)..].{.(..).}..."));
		System.out.println(IsGoodBarket("...(..[...].(.).).{.(..).}..."));
		System.out.println(IsGoodBarket(".....[...].(.).){.(..).}..."));
		System.out.println(IsGoodBarket("...(..[...].(.).){.(..)...."));

		
	}

}
