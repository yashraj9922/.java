import java.util.Arrays;

public class array2d {
    public static void main(String[] args) {
        int [][]arr = new int[3][];
        int [][]arr2d = {{1},{4,3}};

        System.out.println(Arrays.toString(arr2d)); //will not give desiredoutput for multi dimensional array

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
