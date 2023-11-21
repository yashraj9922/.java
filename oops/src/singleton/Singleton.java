package singleton;

// singleton class is a class that can have only one object (an instance of the class) at a time.
public class Singleton {

    // you should not allow anyone to call the constructor from outside the class
    // because as constructor is called new object is created
    // hence we make the constructor private
    private Singleton() {
        System.out.println("Singleton constructor called");
    }

    // the goal is just one instance of this class should be created
    private static Singleton instance = null;// create a static instance of the class

    public static Singleton getInstance() {
        // check wheather 1 object is already created or not
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
