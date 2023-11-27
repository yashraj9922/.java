package inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l + " " + box.h + " " + box.w);

        Box cube = new Box(10);
        System.out.println(cube.l + " " + cube.h + " " + cube.w);

        Box box2 = new Box(10, 20, 30);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);

        Box box3 = new Box(box2);
        System.out.println(box3.l + " " + box3.h + " " + box3.w);

        BoxWeight box4 = new BoxWeight();
        System.out.println(box4.l + " " + box4.h + " " + box4.w + " " + box4.weight);

        BoxWeight box5 = new BoxWeight(10, 20, 30, 40);
        System.out.println(box5.l + " " + box5.h + " " + box5.w + " " + box5.weight);
    } 
}
