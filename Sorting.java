package Solution;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] myAr = {3, 0, -7, 14, 2, 90, 1};
        quickSort(myAr, 0, myAr.length - 1);
        printArray(myAr);
    }

    public static void bubbleSort(int[] myAr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < myAr.length; i++) {
                if (myAr[i - 1] > myAr[i]) {
                    int temp;
                    temp = myAr[i - 1];
                    myAr[i - 1] = myAr[i];
                    myAr[i] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public static void printArray(int[] myAr) {
        for (int i :
                myAr) {
            System.out.println(i);
        }
    }

    public static void quickSort(int[] myAr, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = myAr[(leftMarker + rightMarker) / 2];

        do {
            while (myAr[leftMarker] < pivot) {
                leftMarker++;
            }
            while (myAr[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int temp = myAr[leftMarker];
                    myAr[leftMarker] = myAr[rightMarker];
                    myAr[rightMarker] = temp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) quickSort(myAr, leftMarker, rightBorder);
        if (leftBorder < rightMarker) quickSort(myAr, leftBorder, rightMarker);
    }
    
    public static void heapify(int arr[], int n, int i)
    {
        int MAX = i; // Initialize largest as root
        int left = 2 * i + 1; //index of the left child of ith node = 2*i + 1
        int right = 2 * i + 2; //index of the right child of ith node  = 2*i + 2
        int temp;

        if (left < n && arr[left] > arr[MAX])            //check if the left child of the root is larger than the root
        {
            MAX = left;
        }
 
        if (right < n && arr[right] > arr[MAX])            //check if the right child of the root is larger than the root
        {
            MAX = right;
        }
 
        if (MAX != i) 
        {                                               //repeat the procedure for finding the largest element in the heap
            temp = arr[i];
            arr[i] = arr[MAX];
            arr[MAX] = temp;
            heapify(arr, n, MAX);
        }
    }
    
    public static void insertionSort(int arr[], int n) 
    { 
        if (n <= 1)                             //passes are done
        {
            return; 
        }

        insertionSort( arr, n-1 );        //one element sorted, sort the remaining array
       
        int last = arr[n-1];                        //last element of the array
        int j = n-2;                                //correct index of last element of the array
       
        while (j >= 0 && arr[j] > last)                 //find the correct index of the last element
        { 
            arr[j+1] = arr[j];                          //shift section of sorted elements upwards by one element if correct index isn't found
            j--; 
        } 
        arr[j+1] = last;                            //set the last element at its correct index
    } 

}
