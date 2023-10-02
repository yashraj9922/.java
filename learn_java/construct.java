class Employee {
    // private String name;
    // private int id;

    Employee(String name, int id) {
        // this.name = name;
        // this.id = id;
        System.out.println("my name is " + name + " and my id is " + id);
    }

    // Constructor overloaded
    Employee(String s, int i, int salary) {
        System.out.println("The name of the second employee is : " + s);
        System.out.println("The id of the second employee is : " + i);
        System.out.println("The salary of second employee is : " + salary);
    }
}

public class construct {
    public static void main(String[] args) {
        Employee yash = new Employee("Yashraj Sanjay Kadam", 66);
        Employee avi = new Employee("Harry", 2, 70000);

    }
}

// class CWH {
// CWH(String s, int b){
// System.out.println("This is the " +b+ "th video of "+ " "+ s);
// }
// }
// public class construct {
// public static void main(String[] args) {
// CWH obj1 = new CWH("CodeWithHarry Java Playlist",42);
// }
// }