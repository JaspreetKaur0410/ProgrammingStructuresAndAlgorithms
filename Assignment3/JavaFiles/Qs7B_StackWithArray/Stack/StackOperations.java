/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author jaspr_000
 */
public class StackOperations {

    private int top=-1;
    private ArrayList<String> list;
    private String[] items;
    
    public StackOperations(){
        
    }

    public StackOperations(ArrayList<String> list) throws IOException {
        items = list.toArray(new String[20]);
    }

    public void push(String str) {
        if (top == 20) {
            System.out.println("STACK FULL");
        } else {
            top++;
            items[top] = str;
        }
    }

    public String pop() {
        if(isEmpty()) {
            System.out.println("No Element to Delete");
            return "-1";
        } else {
            String element = items[top];
            top--;
            return element;
        }
    }

    public boolean isEmpty() {
        return (top == -1) ? true : false;
    }

    public String getTopElement() {
        if (top != -1) {
           return items[top];
        }
        return "-1";
    }

    public void display() {
        if (top == -1) {
            System.out.println("NO ITEMS TO DISPLAY");
        } else {
            for(int i = top;i>-1;i--){
                System.out.println(items[i]);
            }
        }
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

}
