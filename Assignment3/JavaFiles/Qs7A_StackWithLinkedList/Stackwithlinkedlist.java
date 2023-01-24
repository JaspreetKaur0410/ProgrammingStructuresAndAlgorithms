/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_LL;

/**
 *
 * @author jaspr_000
 */

public class Stackwithlinkedlist {
    
    private class Node {
        String data;
        Node link;
    }


    int count = 0;
    int size() {
        return count;
    }
    Node top;

    Stackwithlinkedlist() {
        this.top = null;
    }

    public void push(String str) {
        Node temp = new Node();
        if (temp == null) {
            System.out.println("Stack Overflow");
            return;
        }
        temp.data = str;
        temp.link = top;
        count++;
        top = temp;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public String peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return "-1";
        }
    }

    public String pop() {
        // handling stack underflow
        if (top == null) {
            System.out.println("Stack Underflow");
            return null;
        }
        count--;
        String prev_data = top.data;
        top = (top).link;
        return prev_data;
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack Underflow");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.link;
            }
        }
    }
}
