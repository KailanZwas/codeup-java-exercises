package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 *length) + (2 * width);
    }

    @Override
    public double getArea() {
        return width * length;
    }


//    protected double lenght;
//    protected double width;
//
//    /////// Constrictor
//    public Rectangle(double lenght, double width) {
//        this.lenght = lenght;
//        this.width = width;
//    }
//
//    public Rectangle() {
//    }
//
//    /////Methods
//  public double getPerimeter(){
//       double perimeter = 2 * this.lenght + 2 * this.width;
//       return perimeter;
//    }
//    public double getArea (){
//       double area = this.lenght * this.width;
//       return area;
//    }
//    ///// Getters setters
//
//    public double getLenght() {
//        return lenght;
//    }
//
//    public void setLenght(double lenght) {
//        this.lenght = lenght;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public static void main(String[] args) {
//
//    }
}
