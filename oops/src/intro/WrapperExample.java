package intro;
public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Integer num = 45;

        swap1(a, b);
        // we know that this will not swap the numbers because in java
        // there is nothing like pass by reference everything is pass by value
        System.out.println(a + " " + b);

        Integer x = 10;
        Integer y = 20;
        swap2(x, y);
        System.out.println(a + " " + b);
        // still values are not swap...
        // public final class Integer extends Number...
        // Interger is a final class....u can not modify value when varibale is declared
        // with final keyword

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

        final A yash = new A("yashraj");
        yash.name = "new name"; // this can be done
        
        // when a non-primitive is final u cannot reassign it...
        // yash = new A("new object");-->cannot be done
    }
}

// final keyword
// always initialised while declaring
// final gaurentee immutability when only when instance variable are primitive data types
// in case of non primitive data types value can be changed but u cannot ressigned it
/*
 * final Student yash = new Student("yashraj");
 * yash.name = "new name";
 * 
 * yash = new object....this is not allowed
 */

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }
}