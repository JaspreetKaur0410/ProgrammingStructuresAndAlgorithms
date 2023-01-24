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
public class Qs2_CircularQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] q = {54, 18, 77, 24, 11, 27, 43, 38, 3, 9, 82, 10, 21, 8, 34, 19, 6};
        
        CircularQueueImpl cq = new CircularQueueImpl();
        
        // eneque all the elements in the queue
        for(int i=0;i<q.length;i++){
            cq.eneque(q[i]);
        }
        cq.displayQueue();
        
        //deque 8 elements
        for(int i=0;i<8;i++){
            cq.dequeue();
        }
        cq.displayQueue();
        
        //eneque 5 elements
        for(int i=0;i<5;i++){
            cq.eneque(i);
        }
        cq.displayQueue();
        
        //dequeue all elements
        while(!cq.isEmpty()){
            cq.dequeue();
        }
        cq.displayQueue();   
    }
    
}
