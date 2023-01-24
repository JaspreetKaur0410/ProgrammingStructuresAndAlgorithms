/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psa_homework_4;
import java.util.Stack;

public class Question10a {
    

    //check precedence of the operator
    static int checkPrecedence(char operator) {
        switch (operator) {
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

    static String convertInfixToPostFix(String infixExpression) {

        String postfixExpression = "";
        Stack<Character> operatorStack = new Stack<>();
        for (int i = 0; i < infixExpression.length(); i++) {
            char character = infixExpression.charAt(i);

            //if character is the opening brace
            if (character == '(') {
                operatorStack.push(character);
            } //if character is the closing brace
            else if (character == ')') {
                char c = operatorStack.pop();
                while (c != '(') {
                    postfixExpression += c;
                    c = operatorStack.pop();
                }
            } //if character is operator
            else if (checkPrecedence(character) > 0) {
                // pop higher- or equal-precedence operators from the stack to the output; stop before popping a lower-precedence operator or a closing brace.
                while (operatorStack.isEmpty() == false && checkPrecedence(operatorStack.peek()) >= checkPrecedence(character)) {
                    postfixExpression += operatorStack.pop();
                }
                operatorStack.push(character);
            } //if character is neither any operator nor any braces i.e. operand
            else {
                postfixExpression += character;
            }
        }
        //popping out all the remaining operators from the stack to the output
        for (int i = 0; i < operatorStack.size(); i++) {
            postfixExpression += operatorStack.pop();
        }
        return postfixExpression;
    }

    public static void main(String[] args) {
        String infixExpression = "(1+3+((4/2)*(8*4)))";
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + convertInfixToPostFix(infixExpression));
    }
}

