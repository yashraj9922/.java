import java.util.Scanner;

public class swapArgumentsFalse{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        swapNum(a, b);
        System.out.println(+a+" "+b);

        System.out.println("Numbers did not got SWAP");

        System.out.println("Enter two Strings: ");
        String str1 = sc.next();
        String str2 = sc.next();

        swapString(str1, str2);
        System.out.println(str1+" "+str2);

        System.out.println("Strings did not got SWAP");
    }
    static void swapNum(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swapString(String str1, String str2){
        String tmp = str1;
        str1 = str2;
        str2 = tmp;
    }
}