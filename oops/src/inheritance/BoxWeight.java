package inheritance;

public class BoxWeight extends Box {
    double weight;
    double w = 10;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);// super keyword calls the parent class constructor
        // used to initialise values present in parent class

        this.weight = weight;

        // this.weight --> refers to the weight variable present in this class
        // super.weight --> refers to the weight variable present in the parent class

        System.out.println(this.w);// this keyword is used to refer to the current object
        // w = 10.....initialised in this class
        System.out.println(super.w);// super keyword is used to refer to the parent object
        // w = 30.....initialised in parent class

    }
}