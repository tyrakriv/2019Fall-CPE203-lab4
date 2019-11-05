import java.awt.*;

public class Rectangle implements Shape{

    final double THRESHOLD = 0.0001;
    private double width;
    private double height;
    private Point topLeft;
    private Color color;

    public Rectangle(double width, double height, Point topLeft, Color color){
        this.width = width;
        this.height = height;
        this.topLeft = topLeft;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return (2*width) + (2*height);
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void translate(Point p) {
        topLeft.x = topLeft.x + p.x;
        topLeft.y = topLeft.y + p.y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle r = (Rectangle) obj;
            return (Math.abs(topLeft.x - r.getTopLeft().x) < THRESHOLD && Math.abs(topLeft.y - r.getTopLeft().y) < THRESHOLD && Math.abs(getWidth() - r.width) < THRESHOLD && Math.abs(getHeight() - r.height) < THRESHOLD && ((Shape) obj).getColor() == this.color);
        }
        else {
            return false;
        }
    }
}
