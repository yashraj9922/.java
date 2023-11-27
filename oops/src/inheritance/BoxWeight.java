package inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);// super keyword calls the parent class constructor
        // used to initialise values present in parent class

        this.weight = weight;

        // this.weight --> refers to the weight variable present in this class
        // super.weight --> refers to the weight variable present in the parent classv

    }
}
