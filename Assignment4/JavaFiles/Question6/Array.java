/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;


public class Array {
 


    private int capacity;
    Student queueArr[];
    int front;
    int rear;
    int currentSize = 0;

    public Array(int sizeOfQueue) {
        this.capacity = sizeOfQueue;
        front = 0;
        rear = -1;
        queueArr = new Student[this.capacity];
    }
    
    

    public void enqueue(Student student) {
        if (isFull()) {
            System.out.println("Queue is full!! Can not add more elements");
        } else {
            rear++;
            if (rear == capacity - 1) {
                rear = 0;
            }
            queueArr[rear] = student;
            currentSize++;
            System.out.println(student + " added to the queue");
        }
            
            
    }
    
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!! Can not dequeue element");
        } else {
            currentSize--;
            front++;
            System.out.println(queueArr[front - 1] + " removed from the queue");
            if (front == capacity - 1) {
                System.out.println(queueArr[front - 1] + " removed from the queue");
                front = 0;
            } else {
                System.out.println(queueArr[front - 1] + " removed from the queue");
            }
            
        }
    }
    
    public boolean isFull() {
        if (currentSize == capacity) {
            return true;
        }
        return false;
    }

    public Boolean isEmpty() {
        if (currentSize == 0) {
            return true;
        }
        return false;
    }

    public void reverseList(){
        for(int i = rear; i>0; i--){
            System.out.print(queueArr[i]);
        }
    }
    
    public void printList(){
        for(int i = 1; i<=rear; i++){
            System.out.print(queueArr[i]);
        }
    }
    

}

