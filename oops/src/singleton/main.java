package singleton;

public class main {
    public static void main(String[] args) {

        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // all 3 ref. variables are pointing to the same object
    }

}
