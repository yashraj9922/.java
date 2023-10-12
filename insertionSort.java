import java.util.Arrays;

// apni kaksha
public class insertionSort {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 1, 0 };
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j > -1 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }
}
