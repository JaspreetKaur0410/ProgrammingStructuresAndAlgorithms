/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs2.c._heapascending.max_heap;

/**
 *
 * @author jaspr_000
 */
public class Qs2C_HeapAscendingMax_Heap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = {43, 38, 3, 9, 82, 10, 21, 8, 34, 19, 6};
        
        System.out.println("Original Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        heapSort(arr, arr.length-1);
        
        System.out.println("");
        System.out.println("");
        System.out.println("After Max_HEAP Sort - in ASCENDING ORDER");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    private static void heapSort(int[] arr, int size){
        for(int i=(size/2-1);i>=0;i--){
            maxHeapify(arr,size,i);
        }
        
        // for sorting
        for(int i=size-1;i>=0;i--){
            
            //swap last node with the first node
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            // pass size i 
            maxHeapify(arr,i,0);
        }
    }
    
    private static void maxHeapify(int[] arr, int size, int i){
        
        // first we will assume the largest node which is one level up from the bottom level
        int largest = i;
        
        // left child
        int left = 2*i+1;
        
        //right child
        int right = 2*i+2;
        
        // update the parent node index(which should be largest) from 2 children
        if(left<size && arr[left] > arr[largest]){
            largest = left;
        }
        if(right<size && arr[right] > arr[largest]){
            largest = right;
        }
        
        if(largest != i){
            // swap parent with largest node of 2 children
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            
            maxHeapify(arr,size,largest);
        }
        
    }
    
}
