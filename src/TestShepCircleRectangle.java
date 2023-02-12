public class TestShepCircleRectangle {
    public static void main(String[] args){
        Shape r1 = new Rectangle(5,5);
        Shape c1 = new Circle(13);
        Shape r2 = new Rectangle(3, 9);
        Shape c2 = new Circle(12);
        Shape[] list = {r1, c1, r2, c2,};
        for (Shape s: list) {
            System.out.println("Area = " + s.getArea());
        }
    }
}
