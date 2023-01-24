/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs10_postfixevaluation;

import java.util.Stack;

/**
 *
 * @author jaspr_000
 */
public class PostfixEvaluation {

    public int evaluatePostfix(String input_str) {

        Stack<Integer> stack = new Stack<>();
        String[] input = input_str.split(" ");
        for (int i = 0; i < input.length; i++) {
            String c = input[i];

            // if number 
            if (isNumeric(c)) {
                stack.push(Integer.parseInt(String.valueOf(c)));
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (c) {
                    case "+":
                        stack.push(val2 + val1);
                        break;

                    case "-":
                        stack.push(val2 - val1);
                        break;

                    case "/":
                        stack.push(val2 / val1);
                        break;

                    case "*":
                        stack.push(val2 * val1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
