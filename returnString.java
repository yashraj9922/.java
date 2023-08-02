import java.util.Scanner;

public class returnString {
    public static void main(String[] args) {
        System.out.println("Enter your name ");
        Scanner inp = new Scanner(System.in);
        String nme = inp.nextLine();

        String abc = greet(nme);
        System.out.println(abc);
    }

    static String greet(String name) {

        String greeting = "How are u " + name + "?";
        return greeting;
    }
}