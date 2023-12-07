// min Heap implementation using array
// Time Complexity: O(nlogn)

import java.util.*;

class MinHeap {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        buildHeap(arr);
        System.out.println("Heap: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void buildHeap(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, i, arr.length - 1);
        }
    }

    public static void heapify(int[] arr, int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int smallest = i;
        if (left <= n && arr[left] < arr[smallest])
            smallest = left;
        if (right <= n && arr[right] < arr[smallest])
            smallest = right;
        if (smallest != i) {
            swap(arr, i, smallest);
            heapify(arr, smallest, n);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// Output:
// Swapping 5 and 1
// Swapping 5 and 2
// Swapping 5 and 3
// Swapping 5 and 4
// Heap:
// [1, 2, 3, 5, 4]