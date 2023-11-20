package staticExample;

//outside classes cannot be static...only inner classes can be static
// static public class InnerClasses{} .... ERROR
public class InnerClasses {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Yash");
        Test b = new Test("raj");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
