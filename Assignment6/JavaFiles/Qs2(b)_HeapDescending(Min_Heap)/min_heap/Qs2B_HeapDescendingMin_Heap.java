/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs2.b._heapdescending.min_heap;

/**
 *
 * @author jaspr_000
 */
public class Qs2B_HeapDescendingMin_Heap {

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
            minHeapify(arr,size,i);
        }
        
        // for sorting
        for(int i=size-1;i>=0;i--){
            
            //swap last node with the first node
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            // pass size i 
            minHeapify(arr,i,0);
        }
    }
    
    private static void minHeapify(int[] arr, int size, int i){
        
        // first we will assume the smallest node which is one level up from the bottom level
        int smallest = i;
        
        // left child
        int left = 2*i+1;
        
        //right child
        int right = 2*i+2;
        
        // update the parent node index(which should be smallest) from 2 children
        if(left<size && arr[left] < arr[smallest]){
            smallest = left;
        }
        if(right<size && arr[right] < arr[smallest]){
            smallest = right;
        }
        
        if(smallest != i){
            // swap parent with largest node of 2 children
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            
            minHeapify(arr,size,smallest);
        }
    } 
}
