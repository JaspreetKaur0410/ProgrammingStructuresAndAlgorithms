/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs8_infixevaluation;

import java.util.Stack;

/**
 *
 * @author jaspr_000
 */
public class InfixEvaluation {

    public static boolean hasPrecedence(
            char op1, char op2) {

        // whether incoming operator(op1) has precedence over operator(op2) on top of STACK operators
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/')
                && (op2 == '+' || op2 == '-')) {
            return false;
        } else {
            return true;
        }
    }

    public static int applyOp(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException(
                            "Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }

    public int infixEvaluation(String input) {

        Stack<Character> opearators = new Stack<>();
        Stack<Integer> operands = new Stack<>();

        char[] input_array = input.toCharArray();

        for (int i = 0; i < input_array.length; i++) {
            
            if (input_array[i] == ' ')
                continue;

            // if current is operand - push to operands stack
            else if (input_array[i] >= '0' && input_array[i] <= '9') {
                operands.push(Integer.parseInt(String.valueOf(input_array[i])));
            } 
            

            // if current is an opening brace - push to OPERATORS
            else if (input_array[i] == '(') {
                opearators.push('(');
            } 

            // if current is a closing brace
            else if (input_array[i] == ')') {
                while (opearators.peek() != '(') {
                    operands.push(applyOp(opearators.pop(), operands.pop(), operands.pop()));
                }
                opearators.pop();
            } 


            // if current is an operator
            else if (input_array[i] == '+'
                    || input_array[i] == '-'
                    || input_array[i] == '*'
                    || input_array[i] == '/') {
                
                // while top of stack OPEARTORS has same or greater precedence compared to current operator
                // pop opeartor from OPERATORS Stack and pop two operands from OPERAND STACK
                
                while (!opearators.isEmpty() && hasPrecedence(input_array[i], opearators.peek())) {
                    operands.push(applyOp(opearators.pop(), operands.pop(), operands.pop()));
                }
                opearators.push(input_array[i]);
            }
        }
 
        
        while (!opearators.empty())
            operands.push(applyOp(opearators.pop(),
                             operands.pop(),
                           operands.pop()));
        return operands.pop();
    }
    
    public String infixEvaluationChar(String input) {

        Stack<Character> opearators = new Stack<>();
        Stack<String> operands = new Stack<>();

        char[] input_array = input.toCharArray();

        for (int i = 0; i < input_array.length; i++) {
            
            if (input_array[i] == ' ')
                continue;

            // if current is operand - push to operands stack
            else if (Character.isLetter(input_array[i])) {
                operands.push(String.valueOf(input_array[i]));
            } 
            

            // if current is an opening brace - push to OPERATORS
            else if (input_array[i] == '(') {
                opearators.push('(');
            } 

            // if current is a closing brace
            else if (input_array[i] == ')') {
                while (opearators.peek() != '(') {
                    operands.push(applyOpChar(opearators.pop(), operands.pop(), operands.pop()));
                }
                opearators.pop();
            } 


            // if current is an operator
            else if (input_array[i] == '+'
                    || input_array[i] == '-'
                    || input_array[i] == '*'
                    || input_array[i] == '/') {
                
                // while top of stack OPEARTORS has same or greater precedence compared to current operator
                // pop opeartor from OPERATORS Stack and pop two operands from OPERAND STACK
                
                while (!opearators.isEmpty() && hasPrecedence(input_array[i], opearators.peek())) {
                    operands.push(applyOpChar(opearators.pop(), operands.pop(), operands.pop()));
                }
                opearators.push(input_array[i]);
            }
        }
 
        
        while (!opearators.empty())
            operands.push(applyOpChar(opearators.pop(),
                             operands.pop(),
                           operands.pop()));
        return operands.pop();
    }
    
    public static String applyOpChar(char op, String b, String a) {
        switch (op) {
            case '+':
                return a + " + " + b;
            case '-':
                return a + " - " + b;
            case '*':
                return a + " * " + b;
            case '/':
                return a + " / " + b;
        }
        return null;
    }
}
