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

//in case of primitive data types => copy of value is pass 
//in case of object => copy of value of reference variable is pass

//object such as Arrays.....when we try to change or swap a element in an arrage we making change in object and not creating a new object