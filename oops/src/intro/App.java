package intro;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.rollNo);
        System.out.println(s.marks);

        s.greeting();

        Student yashraj = new Student();
        yashraj.greeting();
        yashraj.changeName("Yashraj");
        yashraj.greeting();

        // Student stud1 = new Student("Yash", 066, 99);
        // stud1.greeting();
        // System.out.println(stud1.marks);
        // System.out.println(stud1.name);
        // System.out.println(stud1.rollNo);
        // without this keyword values remain default and did not change

        Student stud2 = new Student("Raj", 56, 98);
        stud2.greeting();
        System.out.println(stud2.marks);
        System.out.println(stud2.name);
        System.out.println(stud2.rollNo);
        // using this keyword

        Student random = new Student(yashraj);
        System.out.println(random.name);// this will print the name same as assigned in "yashraj" object

        Student defaultStudent = new Student();
        defaultStudent.marks = 10;
        System.out.println(defaultStudent.marks);
        defaultStudent.name = "default Student";
        System.out.println(defaultStudent.name);

        Student one = new Student();
        Student two = one;

        one.name = "i am one";
        System.out.println(one.name);

        two.name = "i am two now";
        System.out.println(two.name);
        System.out.println(one.name);

    }
}
