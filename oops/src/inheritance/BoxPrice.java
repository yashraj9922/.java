package inheritance;

public class BoxPrice extends BoxWeight {
    double cost;

    BoxPrice() {
        super();// calls the default constructor of parent class....BoxWeight type
        this.cost = -1;
    }

    BoxPrice(BoxPrice other) {
        super(other);// calls the copy constructor of parent class....BoxWeight type
        this.cost = other.cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);// calls the parameterized constructor of parent class....BoxWeight type
        this.cost = cost;
    }

    public BoxPrice(double side, double weight) {
        super(side, weight);// calls the parameterized constructor of parent class....BoxWeight type
        this.cost = cost;
    }
}
