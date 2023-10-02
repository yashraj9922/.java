import java.util.Scanner;

public class swapNormal {
    public static void main(String[] args) {
        System.out.println("Enter num1: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        System.out.println("Enter num2: ");
        int n2 = sc.nextInt();

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("Numbers swaped\n" + "num1: " + n1 + "\n" + "num2: " + n2);
    }
}
