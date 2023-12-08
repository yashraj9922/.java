// Binary Sort using Recursion
// Time Complexity: O(logn)
// Space Complexity: O(logn)

class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3;
        int ans = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high)
            return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            return binarySearch(arr, target, low, mid - 1);
        else
            return binarySearch(arr, target, mid + 1, high);
    }
}