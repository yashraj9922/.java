// Linear Search
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int target = 3;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}