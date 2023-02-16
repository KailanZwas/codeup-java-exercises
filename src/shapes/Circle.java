package shapes;

public class Circle {
    private double radius;

    ////Constructor
    public Circle(){

    }
    public Circle(double radius){
    this.radius = radius;
    }

    // Getters Setters


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
// Methods ??
    public double getArea(){
    double radiusSquared = Math.pow(this.radius, 2);
    return radiusSquared * Math.PI;
    }
    public double getCircumference(){
        return  2 * Math.PI * this.radius;
    }


}
