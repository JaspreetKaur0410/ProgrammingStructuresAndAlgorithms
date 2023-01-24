/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs8_infixevaluation;

/**
 *
 * @author jaspr_000
 */
public class Qs8_InfixEvaluation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String input1 = "(1+3+((4/2)*(8*4)))";
        InfixEvaluation infix1 = new InfixEvaluation();
        int result1 = infix1.infixEvaluation(input1);
        System.out.println("RESULT FOR (1 + 3 + ( ( 4 / 2 ) * ( 8 * 4 ) ))" + " -> " + result1);
        
        String input2 = "(4 + 8) * (6 - 5)/((3 - 2) * (2 + 2))";
        InfixEvaluation infix2 = new InfixEvaluation();
        int result2 = infix2.infixEvaluation(input2);
        System.out.println("RESULT FOR (4 + 8) * (6 - 5)/((3 - 2) * (2 + 2))" + " -> " + result2);
        
        String input3 = "A * B / C + (D + E - (F * (G / H)))";
        InfixEvaluation infix3 = new InfixEvaluation();
        String result3 = infix3.infixEvaluationChar(input3);
        System.out.println("RESULT FOR A * B / C + (D + E - (F * (G / H)))" + " -> " + result3);
    }
    
}
