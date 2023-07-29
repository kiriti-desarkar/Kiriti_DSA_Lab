package com.gl.test;

import java.util.Stack;

public class Demo {

	public static void main(String[] args) {
		 String bracketExpression = "[{(a+b)*(c-d)}/2";
		 boolean result;
		 result = isBracketBlanaced(bracketExpression);
			if(result)
				System.out.println("The entered string has balanced brackets");
			else
			System.out.println("The entered string does not contains balanced brackets");
				 
	}

	private static boolean isBracketBlanaced(String bracketExpression) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<bracketExpression.length();i++) {
			char ch = bracketExpression.charAt(i);
			if(ch=='('||ch=='{'||ch=='[')
			stack.push(ch);
			else if(ch==')'||ch=='}'||ch==']') {
				if(stack.isEmpty())
					return false;
				stack.pop();
			}
		}
		return stack.isEmpty()?true:false;
	}

}
