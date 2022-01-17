package Polymorphism.Lab.shapes;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double radius) {
        setRadius(radius);
        this.calculatePerimeter();
        this.calculateArea();
    }

    public final Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(Math.PI * 2 * radius);
    }

    @Override
    public void calculateArea() {
        setArea(Math.PI * (Math.pow(radius, 2)));
    }
}
