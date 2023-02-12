public class Circle extends Shape {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * 3.14;
    }
}
