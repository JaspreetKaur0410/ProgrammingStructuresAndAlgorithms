/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Stack;

public class Question9 {
	
	/***
	 * This will check the precedence for given operator character.
	 * @param ch
	 * @return
	 */
	static int Prec(char ch) 
	{ 
		switch (ch) 
		{ 
		case '+': 
		case '-': 
			return 1; 
	
		case '*': 
		case '/': 
			return 2; 
	
		case '^': 
			return 3; 
		} 
		return -1; 
	} 

	/***
	 * This will perform infix to postfix conversion.
	 * @param exp
	 * @return
	 */
	static String infixToPostfix(String exp) 
	{ 

		String result = new String(""); 
		Stack<Character> stack = new Stack<>(); 
		
		for (int i = 0; i<exp.length(); ++i) 
		{ 
			char c = exp.charAt(i); 

			if (Character.isLetterOrDigit(c)) 
				result += c; 

			else if (c == '(') 
				stack.push(c); 

			else if (c == ')') 
			{ 
				while (!stack.isEmpty() && stack.peek() != '(') 
					result += stack.pop(); 
				
				if (!stack.isEmpty() && stack.peek() != '(') 
					return "Invalid Expression"; 			 
				else
					stack.pop(); 
			} 
			else 
			{ 
				while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){ 
					if(stack.peek() == '(') 
						return "Invalid Expression"; 
					result += stack.pop(); 
			} 
				stack.push(c); 
			} 
	
		} 
	

		while (!stack.isEmpty()){ 
			if(stack.peek() == '(') 
				return "Invalid Expression"; 
			result += stack.pop(); 
		} 
		return result; 
	} 
	

	public static void main(String[] args) 
	{ 
		String exp = "(A+B)*C+D/(E+F*G)-H";
		System.out.println(exp + " = "+ infixToPostfix(exp)); 
	}
}


