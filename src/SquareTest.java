public class SquareTest {
    public static void main(String[] args) {
        double percent = (Math.random()*100)/100;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(0.1);
        shapes[1] = new Square(1.1);
        shapes[2] = new Rectangle(2.1, 1.2);
        System.out.println("Pre-sored:");
        for (Shape shape: shapes) {
            System.out.println(shape);
        }
        System.out.println("After-sored:");
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                ResizeAble resizeAble = (Square)shape;
                System.out.println("Area Square = " + resizeAble.resize(percent));
            }
        }

    }
}