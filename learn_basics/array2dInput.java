package learn_basics;
import java.util.Scanner;

public class array2dInput {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Element with index [" + i + "," + j + "] is: ");
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(rows, columns, arr);
    }

    static void printArray(int row, int column, int[][] arr) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
