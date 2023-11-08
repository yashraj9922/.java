package learn_basics;
import java.util.Scanner;

public class isPrimeNum {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = isPrime(n);
        System.out.println(answer);
    }

    static int isPrime(int n) {
        if (n <= 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        if (n % 2 == 0) {
            return 0;
        }

        int sqrtN = (int) Math.sqrt(n);

        for (int c = 3; c <= sqrtN; c += 2) {
            if (n % c == 0) {
                return 0;
            }
        }

        return 1;
    }

}
