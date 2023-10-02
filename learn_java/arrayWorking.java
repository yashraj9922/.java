import java.util.Arrays;
import java.util.Scanner;

public class arrayWorking {
    public static void main(String[] args) {

        // Syntax for array declaration
        // dataType[] arrayName = new dataType[size];

        System.out.println("Enter number of Students in a class ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // declaration of array, rnos is getting defined in Stack memory
        int marks[];

        // initialisation of an array, actually here at this step object(value) is being
        // added to Heap memory
        marks = new int[size];

        System.out.println("Enter the marks of students in class ");
        for (int i = 0; i < size; i++) {
            System.out.println("Student " + (i + 1));
            marks[i] = sc.nextInt();
        }
        System.out.println();

        // method 1 to print an array
        for (int j = 0; j < size; j++) {
            System.out.println(+marks[j]);
        }
        System.out.println();

        // method 2 to print an array
        System.out.println(Arrays.toString(marks));

        // decalaration and initialisation of an array, array of objects
        String str[] = new String[size];
        System.out.println("Enter the Names of Students ");
        for (int a = 0; a < size; a++) {
            str[a] = sc.next();
        }

        System.out.println("Name of Students in Class ");
        System.out.println(Arrays.toString(str));
    }
}