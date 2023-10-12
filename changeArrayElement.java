import java.util.Arrays;
import java.util.Scanner;

public class changeArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of students in class: ");
        int size = sc.nextInt();

        int[] marks = new int[size];
        System.out.println("Enter the marks of students: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Student " + (i + 1));
            marks[i] = sc.nextInt();
        }

        System.out.println("Enter the roll no. of student to change the marks: ");
        int x = sc.nextInt();
        int index = x - 1;

        System.out.println("Enter the correct marks of roll no. " + x + ":");
        int crm = sc.nextInt();

        int array[] = changeElement(marks, index, crm);
        System.out.println("Correct marks of Students: ");
        System.out.println(Arrays.toString(array));
    }

    static int[] changeElement(int ar[], int idx, int num) {
        ar[idx] = num;
        return ar;
    }
}
