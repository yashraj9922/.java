class Student {
    String name;
    int rollNo;
    float marks;

    Student() {
        this.name = "Your-Name-Here";
        this.rollNo = 0;
        this.marks = 0.0f;
    }

    // Student(String name, int rollNo, float marks) {
    // rollNo = rollNo;
    // name = name;
    // marks = marks;
    // } --> without this keyword values remain default and did not change

    Student(String firstName, int rollN, float totalMarks) {
        this.rollNo = rollN;
        this.name = firstName;
        this.marks = totalMarks;
    }

    void greeting() {
        System.out.println("Hello, " + this.name + "!");
    }

    void changeName(String newName) {
        this.name = newName;
    }
}
