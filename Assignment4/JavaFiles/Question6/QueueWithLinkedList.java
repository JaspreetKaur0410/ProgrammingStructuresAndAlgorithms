/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class QueueWithLinkedList {
    
    public static void main(String[] args) {
        
        LinkedList linkedList = new LinkedList();
        BufferedReader reader;
        ArrayList<Student> studentList = new ArrayList<Student>();
        try {
            reader = new BufferedReader(new FileReader("/Users/virajshah/Downloads/PSA/PSA Spring 2022/PSA_Homework_4/src/question6/input.txt"));
            String entry = reader.readLine();
            while (entry != null) {
                String[] splitArray = entry.split(",");
                Student s = new Student(splitArray[0], splitArray[1], splitArray[2], splitArray[3]);
                studentList.add(s);
                entry = reader.readLine();
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //enqueue all elements into queue
        for (Student s : studentList) {
            linkedList.enqueue(s);
        }
        
        //dequeue 4 elements from the queue
        for(int i=0; i<4; i++){
            if(!linkedList.isEmpty()){
                linkedList.dequeue();
            }
            else
                System.out.println("Error: Queue Underflow!");
            
        }
        
        //enqueue all elements into queue
        for (Student s : studentList) {
            linkedList.enqueue(s);
        }
        
        //dequeue all elements from queue
        while(!linkedList.isEmpty()){
            linkedList.dequeue();
        }
        
        //dequeue 2 elements from the queue
        for(int i=0; i<2; i++){
            if(!linkedList.isEmpty()){
                linkedList.dequeue();
            }
            else
                System.out.println("Error: Queue Underflow!");
            
        }
        
        //enqueue all elements into queue
        for (Student s : studentList) {
            linkedList.enqueue(s);
        }
       
        //enqueue new three entries
        Student s1 = new Student("11", "John", "Henry", "Software Development");
        Student s2 = new Student("12", "Raj", "Manish", "Statistician");
        Student s3 = new Student("13", "Justin", "Morgan", "Engineering Statistics");
        linkedList.enqueue(s1);
        linkedList.enqueue(s2);
        linkedList.enqueue(s3);
        
        System.out.println("Reverse order:");
        linkedList.reverseList();
        System.out.println("");
        
        System.out.println("Original order:");
        linkedList.printList();
        System.out.println("");
        
    }
}



