package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter radius of the circle");
        double userRadius = input.getDouble();
        Circle circle = new Circle(userRadius);
        double userCircumference = circle.getCircumference();
        double userArea = circle. getArea();
        System.out.printf("""
                The Radius of your circle is: %.0f, 
                the Circumference of your circle is: %.0f,
                and the Area of your circle is: %.0f.
                """, userRadius, userCircumference, userArea);
    }
}
