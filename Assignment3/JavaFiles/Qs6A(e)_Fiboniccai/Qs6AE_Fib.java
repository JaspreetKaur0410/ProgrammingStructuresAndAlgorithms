/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs6a.e._fib;

/**
 *
 * @author jaspr_000
 */
public class Qs6AE_Fib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CalculateFib fib = new CalculateFib();
        System.out.println("Fiboniccai Series for n=6");
        for(int i=0;i<6;i++){
            System.out.println(fib.fibonacciRecursion(i));
        }
        System.out.println();
        System.out.println("Fiboniccai Series for n=7");
        for(int i=0;i<7;i++){
            System.out.println(fib.fibonacciRecursion(i));
        }
        
    }
}

