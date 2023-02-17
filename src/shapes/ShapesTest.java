package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3, 4);
//        System.out.println(r.getPerimeter());
//        System.out.println(r.getArea());;

//        Square s = new Square(5);
//        System.out.println(s.getArea());
//        System.out.println(s.getPerimeter());

        Rectangle square = new Square(5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
