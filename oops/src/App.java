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

        Student stud1 = new Student("Yash", 066, 99);
        stud1.greeting();
        System.out.println(stud1.marks);
        System.out.println(stud1.name);
        System.out.println(stud1.rollNo);
        //without this keyword values remain default and did not change

        Student stud2 = new Student("Raj", 56, 98);
        stud2.greeting();
        System.out.println(stud2.marks);
        System.out.println(stud2.name);
        System.out.println(stud2.rollNo);
        // using this keyword
    }
}
