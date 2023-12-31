package inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box() {

        super();// Every class has {@code Object} as a superclass

        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    Box(double l) {
        this.l = l;
        this.h = l;
        this.w = l;
    }

    Box(double l, double h, double w) {
        System.out.println("Running the Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // copy constructor
    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the Box");
    }
}
