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
}
