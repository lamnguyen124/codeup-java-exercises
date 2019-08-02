package shapes;

public class ShapeTest {
    public static void main(String[] args){
        Measurable myShape = new Square(5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        Measurable box1 = new Rectangle(5, 4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());
    }
}

