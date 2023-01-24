/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs4._quicksort;

/**
 *
 * @author jaspr_000
 */
public class Qs4_QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] array = {43, 38, 3, 9, 82, 10, 21, 8, 34, 19, 6};

        System.out.println("Original Array");
        printArray(array);

        System.out.println("");

        quickSort(array, 0, array.length - 1);

        System.out.println("\nSorted array After Quick Sort");
        printArray(array);
    }

    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p + 1, high);
        }
    }

    private static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static int partition(int[] arr, int low, int high) {

        // Considering high element as the pivot element
        int pivot = arr[high];

        // initialise i and j to low
        int i = low;
        int j = low;

        while (i <= high) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        // j-1 will give the index of pivot
        return j - 1;
    }

}
