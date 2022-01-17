package Polymorphism.Lab.shapes;

public class Rectangle extends Shape{
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        setHeight(height);
        setWidth(width);
        this.calculatePerimeter();
        this.calculateArea();
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter((this.height + this.width) * 2);
    }

    @Override
    public void calculateArea() {
        setArea(this.height * this.width);
    }
}
