class Employee{
    private String name;
    private int id;

    public void getName(String nme){
        name = nme;
    }

    public void getId(int n){
        id = n;
    }

    public String printName(){
        return name;
    }
    
    public int printId(){
        return id;
    }

    public static void main(String[] args) {
        Employee yash = new Employee();
        yash.getName("Yashraj Sanjay Kadam");

        System.out.println(yash.printName());
    }
}