public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Integer num = 45;

        swap1(a, b);
        // we know that this will not swap the numbers because in java
        // there is nothing like pass by reference everything is pass by value
        System.out.println(a + " " + b);

        Integer x = 10;
        Integer y = 20;
        swap1(x, y);
        System.out.println(a + " " + b);
        // still values are not swap...

    }

    static void swap1(int a, int b) {
        // here int a is only valid in this scope of function...
        // it is swapping it inside the function only its not swapping the oringnal one
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap2(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
