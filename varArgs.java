import java.util.Arrays;
import java.util.Scanner;

public class varArgs{
    public static void main(String[] args) {
        System.out.println("Enter size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int []arr = new int[size];
        System.out.println("Enter the elements of an Array: ");
        
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        func(arr);
    }
    //when number of arguments to be passed into method is unknown use varArgs
    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }
}