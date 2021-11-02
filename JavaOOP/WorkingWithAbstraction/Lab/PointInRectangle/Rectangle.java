package WorkingWithAbstraction.Lab.PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point){
        int pointX = point.getX();
        int pointY = point.getY();

        return isPointXIside(pointX) && isPointYInside(pointY);
    }

    private boolean isPointYInside(int pointY) {
        return pointY >= this.bottomLeft.getY() && pointY <= this.topRight.getY();
    }

    private boolean isPointXIside(int pointX) {
        return pointX >= this.bottomLeft.getX() && pointX <= this.topRight.getX();
    }
}
