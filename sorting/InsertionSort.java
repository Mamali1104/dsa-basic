import java.util.*;
import java.util.Collections;

public class InsertionSort {
    public static void insertionSort(Integer arr[]) {// o(n2)
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct postion
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void counting(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;

        } // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;

            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 8, 9 };
        counting(arr);
        // Arrays.sort(arr, 0, 4);
        // Arrays.sort(arr, 0, 5, Collections.reverseOrder());

        printArr(arr);
    }

}
