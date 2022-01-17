package Polymorphism.Lab.shapes;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2.4, 3.2);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Circle circle = new Circle(2.5);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
