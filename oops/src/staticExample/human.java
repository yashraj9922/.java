package staticExample;

public class human {
    int age;
    String name;
    int salary;
    boolean isMarried;
    static long population;

    public human(int age, String name, int salary, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        this.salary = salary;
        // this.population +=1;
        human.population += 1;
    }
}
