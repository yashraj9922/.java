import javax.xml.transform.Source;

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
        Employee avi = new Employee();
        yash.getName("Yashraj Sanjay Kadam");
        yash.getId(66);
        System.out.println(yash.printName());
        System.out.println(yash.printId());

        avi.getName("Avishkar Sanjay Kadam");
        avi.getId(1);
        System.out.println(avi.printName());
        System.out.println(avi.printId());
    }
}