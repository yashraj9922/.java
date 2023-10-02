import java.util.Scanner;

public class sumMethod {
    void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum of two numbers is " + sum);
    }

    static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum of two numbers is " + sum);
    }

    public static void main(String[] args) {
        sumMethod obj = new sumMethod();
        obj.sum();// without static keyword

        add();// Using static keyword
    }
}
