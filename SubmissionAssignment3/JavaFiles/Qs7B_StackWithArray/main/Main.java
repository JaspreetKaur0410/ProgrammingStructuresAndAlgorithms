/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Stack.StackOperations;
import java.io.IOException;
import java.nio.file.Files;
import static java.nio.file.Files.list;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author jaspr_000
 */
public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<>(Files.readAllLines(Paths.get("C:/Users/jaspr_000/Documents/NetBeansProjects/Ques7_Array/src/main/data.txt")));
        StackOperations stop = new StackOperations(list);
        
        // PUSHING 4 elements to stack
        for (int i = 0; i <=3; i++) {
            stop.push(list.get(i));
        }
        System.out.println("STACK AFTER PUSHING 4 elements");
        stop.display();

        System.out.println();
        System.out.println();
        
        //POPPING 5 ELEMENTS FROM STACK
        System.out.println("POPPED 5 ELEMETS AS FOLLOWS - ");
        int a = 0;
        while (!stop.isEmpty()) {
            System.out.println(stop.pop());
            a++;
        }
        //POP 5th ELEMENT FROM STACK
        stop.pop();
                
        System.out.println();
        System.out.println();

        System.out.println("STACK AFTER POPPING 5 ELEMENTS");
        stop.display();
        
        System.out.println();
        System.out.println();
        
        //STACK PUSHING ALL ELEMENTS
        for (int i = 0; i <list.size(); i++) {
            stop.push(list.get(i));
        }
        System.out.println("STACK AFTER PUSHING ALL elements");
        stop.display();
        
        System.out.println();
        System.out.println();
        
        
        //PUSHINHG 2 elements to stack
        stop.push("11,john henry,software development");
        stop.push("12,justin morgan,engineering statistics");
        System.out.println("STACK AFTER PUSHING 2 More elements");
        stop.display();
        
        System.out.println();
        System.out.println();

        //POPPING ELEMENTS FROM STACK
        System.out.println("POPPED ELEMETS AS FOLLOWS - ");
        int j = 0;
        while (stop.getItems()[j] != null) {
            System.out.println(stop.pop());
            j++;
        }

        System.out.println();
        System.out.println();

        System.out.println("STACK AFTER POPPING ALL ELEMENTS");
        stop.display();

        System.out.println();
        System.out.println();
        //PUSH 8 ELEMENTS TO STACK
        for (int k = 15; k < 23; k++) {
            stop.push(String.valueOf(k) + "," + "Nick Jonas" + "," + String.valueOf(k) + ",engineering statistics" + "," + String.valueOf(k));
        }
        System.out.println("STACK AFTER PUSHING 8 elements");
        stop.display();

        System.out.println();
        System.out.println();
        //POPPING 9 ELEMENTS
        System.out.println("POPPED ELEMETS AS FOLLOWS - ");
        int p = 0;
        while (!stop.isEmpty()) {
            System.out.println(stop.pop());
            p++;
        }
        //POPPING 9th ELEMENT
        stop.pop();
        System.out.println();
        System.out.println();

        System.out.println("STACK AFTER POPPING 9 ELEMENTS");
        stop.display();

        System.out.println();
        System.out.println();

        //PUSH BACK ALL ITEM FROM DATA.TXT TO STACK
        ArrayList<String> list1 = new ArrayList<>(Files.readAllLines(Paths.get("C:/Users/jaspr_000/Documents/NetBeansProjects/Ques7_Array/src/main/data.txt")));
        String[] items1 = list1.toArray(new String[15]);
        System.out.println("PUSH BACK ALL ITEM FROM DATA.TXT TO STACK");
        for (int i = 0; i < items1.length; i++) {
            if (items1[i] != null) {
                stop.push(items1[i]);
            }
        }
        stop.display();

        System.out.println();
        System.out.println();

        //STACK WITH ORDER FROM 1 to 10
        System.out.println("STACK WITH ORDER FROM 1 to 10");
        Stack<String> stack2 = new Stack<String>();

        String[] res = new String[11];
        for (int i = 0; i < 11; i++) {
            if (items1[i] != null) 
                // POPPING ELEMENT FROM STACK
                stack2.push(stop.pop());
        }
        
        while(!stack2.isEmpty()) {
            String popped_ele = stack2.pop();
            System.out.println(popped_ele + " ");
        }
        
        System.out.println();
        System.out.println();

        System.out.println("STACK AFTER POPPING ALL ELEMENTS");
        stop.display();

        System.out.println();
        System.out.println();

    }

}
