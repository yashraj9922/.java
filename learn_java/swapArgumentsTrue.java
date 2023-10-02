import java.util.Scanner;

public class swapArgumentsTrue {
    int a, b;

    public static void main(String[] args) {
        swapArgumentsTrue sn = new swapArgumentsTrue();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1: ");
        sn.a = sc.nextInt();

        System.out.println("Enter num2: ");
        sn.b = sc.nextInt();

        swapArgumentsTrue.swap(sn);

        System.out.println("After swapping: a = " + sn.a + ", b = " + sn.b);
    }

    static void swap(swapArgumentsTrue sn) { // passing object name into method
        int temp = sn.a;
        sn.a = sn.b;
        sn.b = temp;
    }
}
