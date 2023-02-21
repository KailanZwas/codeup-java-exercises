package shapes;

public class ShapesTest {
    public static void main(String[] args) {
      Measurable myShape = new Rectangle(5, 4);
      System.out.println(myShape.getPerimeter());
      System.out.println(myShape.getArea());
      myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        }
//        System.out.println(r.getPerimeter());
//        System.out.println(r.getArea());;

//        Square s = new Square(5);
//        System.out.println(s.getArea());
//        System.out.println(s.getPerimeter());

//        Rectangle square = new Square(5);
//        System.out.println(square.getArea());
//        System.out.println(square.getPerimeter());

}
