package staticExample;

public class main {
    public static void main(String[] args) {
        human yash = new human(19, "Yash", 5000, false);
        System.out.println(yash.population);// only 1 human

        human raj = new human(19, "raj", 5000, true);
        System.out.println(raj.population);

        System.out.println(yash.population);// 2 humans

    }

    // this is independent of an object
    // this does not belong to any instance
    static void fun() {
        // greeting();--> this is not accesible...
        // a static method can only access a static data...it cannot access non-static
        // data
        // hence without specifing a instance we cannot use it
    }

    // non static method
    // as we know that static data is independent of any object....and something
    // that is not static , belongs to an object
    // this belongs to an instance
    void greeting() {
        System.out.println("Hello World");
    }

    static void greetMe() {
        main obj = new main();
        obj.greeting();
        // now as greeting() has a specified instance now we can use it

        // you cannot access non static stuff without referencing their instances in a
        // static context
    }
}
