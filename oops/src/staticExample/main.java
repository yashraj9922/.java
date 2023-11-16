package staticExample;

public class main {
    public static void main(String[] args) {
        human yash = new human(19, "Yash", 5000, false);
        System.out.println(yash.population);// only 1 human

        human raj = new human(19, "raj", 5000, true);
        System.out.println(raj.population);

        System.out.println(yash.population);// 2 humans

    }
}
