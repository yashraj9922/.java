package inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l + " " + box.h + " " + box.w);

        Box cube = new Box(10);
        System.out.println(cube.l + " " + cube.h + " " + cube.w);

        Box box2 = new Box(10, 20, 30);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);
    } 
}
