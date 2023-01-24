/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs10_postfixevaluation;

/**
 *
 * @author jaspr_000
 */
public class Qs10_PostfixEvaluation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PostfixEvaluation pev = new PostfixEvaluation();
        String input = "10 2 8 * + 3 -";
        int result = pev.evaluatePostfix(input);
        System.out.println("Result for Postfix Evaluation for 10 2 8 * + 3 -"+" -> "+result);
    }
    
}
