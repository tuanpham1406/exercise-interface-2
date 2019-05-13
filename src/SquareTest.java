public class SquareTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(0.1);
        shapes[1] = new Square(1.1);
        shapes[2] = new Rectangle(2.1, 1.2);
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                Colorable colorable = (Square)shape;
                System.out.println(colorable.howToColor());
            } else {
                System.out.println(shape);
            }
        }
    }
}
