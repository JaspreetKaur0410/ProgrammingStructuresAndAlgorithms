/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs2_circularqueue;

/**
 *
 * @author jaspr_000
 */
public class CircularQueueImpl {
    
    int[] queue = new int[17];
    int rear = -1;
    int front = -1;
    
    public int eneque(int x){
        // if queue is empty
        if(isEmpty()){
            front = rear = 0;
            queue[rear] = x;
            System.out.println("");
            System.out.println("--------------------------------Enequed element is "+queue[rear]+"--------------------------------");
        }
        // if queue is full
        else if(isFull()){
            System.out.println("");
            System.out.println("---------------------------Queue is Full, No Item can be inserted-----------------------");
        }
        // eneque element at rear position
        else{
            rear = ((rear+1)%(queue.length)); // tells next available position to insert element
            queue[rear] = x;
            System.out.println("");
            System.out.println("--------------------------------Enequed element is "+queue[rear]+"--------------------------------");
        }
        System.out.println("");
        System.out.println("rear "+rear);
        System.out.println("front "+front);
        return queue[rear];
    }
    
    public void dequeue(){
        // if queue is empty - no item can be dequeued
        if(front == -1 && rear == -1){
            System.out.println("");
            System.out.println("--------------------------Queue is Empty, No Item can be Dequeued------------------------------------");
        }
        // if front and rear points to same position - means there is only 1 element 
        else if(front == rear){
            front = rear = -1;
        }
        //deque element from front position
        else{
            System.out.println("");
            System.out.println("--------------------------------Dequed element is "+queue[front]+"-------------------------------------");
            front = (front+1)%(queue.length);
            System.out.println("");
            System.out.println("rear "+rear);
            System.out.println("front "+front);
        }
    }
    
    public boolean isFull(){
        return ((front + 1)%(queue.length)) == front;
    }
    
    public boolean isEmpty(){
        return (front == -1 && rear == -1);
    }
    
    public void displayQueue(){
        System.out.println("");
        System.out.println("");
        if(front == -1){
            System.out.println("---------------------------------Queue is Empty----------------------------------------------------------");
        }
        else if(rear >= front){
            System.out.println("---------------------------------------Elements in the Queue are----------------------------------------------");
            for(int i=front;i<=rear;i++){
                System.out.print(" "+queue[i]+" ");
            }
            System.out.println("");
        }
        else{
            System.out.println("rear "+rear);
            System.out.println("front "+front);
            System.out.println("---------------------------------------Elements in the Queue are----------------------------------------------");
            for(int i=front;i<queue.length;i++){
                System.out.print(" "+queue[i]+" ");
            }
            for(int i=0;i<=rear;i++){
                System.out.print(" "+queue[i]+" ");
            }
        }
    }
    
}
