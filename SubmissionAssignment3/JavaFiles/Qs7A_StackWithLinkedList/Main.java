/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_LL;

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

        Stackwithlinkedlist stackimplobj = new Stackwithlinkedlist();
        
        System.out.println();

        // pushing 4 elements into stack
        for (int i = 0; i <= 3; i++) {
            stackimplobj.push(list.get(i));
        }

        // printing stack elements after pushing 4 elements
        System.out.println("Stack after pushing 4 elements: ");
        stackimplobj.display();
        System.out.println();
        System.out.println("-------------------------------------------------------------------");
     
        
        System.out.println("POPPED ELEMENTS AS FOLLOWS - ");
        // poppping 5 elements FROM stack
        while(!stackimplobj.isEmpty()) {
            System.out.println(stackimplobj.pop());
        }
        //poppping 5th element FROM stack
        stackimplobj.pop();
        System.out.println();
        System.out.println("Stack after popping 5 elements: ");
        stackimplobj.display();

        // pushing all elements into stack
        for (int i = 0; i < list.size(); i++) {
            stackimplobj.push(list.get(i));
        }

        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        System.out.println("Stack after pushing all elements: ");
        stackimplobj.display();
        System.out.println();
        System.out.println("-------------------------------------------------------------------");
       
        
        // pushing 2 elements into STACK
        stackimplobj.push("11,john henry,software development");
        stackimplobj.push("12,justin morgan,engineering statistics");
        System.out.println("STACK AFTER PUSHING 2 More elements");
        stackimplobj.display();
        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        
         // POP ALL ELEMENTS
        System.out.println("POPPED ELEMETS AS FOLLOWS - ");
        
        //POPPING  ALL ELEMENTS FROM STACK
        while(!stackimplobj.isEmpty()) {
            System.out.println(stackimplobj.pop());
        }

        System.out.println();
        System.out.println();
        
        
        //PUSH 8 ELEMENTS TO STACK
        for (int k = 15; k < 23; k++) {
            stackimplobj.push(String.valueOf(k) + "," + "Nick Jonas" + "," + String.valueOf(k) + ",engineering statistics" + "," + String.valueOf(k));
        }
        System.out.println("STACK AFTER PUSHING 8 elements");
        stackimplobj.display();

        System.out.println();
        System.out.println();
        //POPPING 9 ELEMENTS
        System.out.println("POPPED ELEMETS AS FOLLOWS - ");
        int p = 0;
        while (!stackimplobj.isEmpty()) {
            System.out.println(stackimplobj.pop());
            p++;
        }
        //POPPING 9th ELEMENT
        stackimplobj.pop();
        System.out.println();
        System.out.println();

        System.out.println("STACK AFTER POPPING 9 ELEMENTS");
        stackimplobj.display();

        System.out.println();
        System.out.println();
        
  
        //PUSH BACK ALL ITEM FROM DATA.TXT TO STACK
        String[] items1 = list.toArray(new String[15]);
        System.out.println("PUSH BACK ALL ITEM FROM DATA.TXT TO STACK");
        for (int i = 0; i < items1.length; i++) {
            if (items1[i] != null) {
                stackimplobj.push(items1[i]);
            }
        }
        stackimplobj.display();

        System.out.println();
        System.out.println();

        //STACK WITH ORDER FROM 10 to 1
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        System.out.println("STACK WITH ORDER FROM 10 to 1");
        stackimplobj.display();
        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        
        
        
         //STACK WITH ORDER FROM 1 to 10
        System.out.println("STACK WITH ORDER FROM 1 to 10");
        Stack<String> stack2 = new Stack<String>();

        String[] res = new String[11];
        for (int i = 0; i < 11; i++) {
            if (items1[i] != null) 
                // POPPING ELEMENT FROM STACK
                stack2.push(stackimplobj.pop());
        }
        
        while(!stack2.isEmpty()) {
            String popped_ele = stack2.pop();
            System.out.println(popped_ele + " ");
        }
        
        System.out.println();
        System.out.println();

        System.out.println("STACK AFTER POPPING ALL ELEMENTS");
        stackimplobj.display();

        System.out.println();
        System.out.println();


        // Time Complexity:
        // push -> O(1)
        // pop -> O(1)
        // peek -> O(1)
    }
}
