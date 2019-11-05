import java.awt.*;

public class Circle implements Shape{

    final double THRESHOLD = .0001;
    private double radius;
    private Point center;
    private Color color;

    public Circle(double radius, Point center, Color color)
    {
        this.radius = radius;
        this.center = center;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getArea(){
        return (Math.pow(getRadius(),2)*Math.PI);
    }

    public double getPerimeter(){
        return (getRadius()*2*Math.PI);
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
        this.center.x = center.x + p.x;
        this.center.y = center.y + p.y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Shape) {
            Circle c = (Circle)obj;
            return (Math.abs(center.x - c.getCenter().x) < THRESHOLD && Math.abs(center.y - c.getCenter().y) < THRESHOLD && Math.abs(getRadius() - c.radius) < THRESHOLD && ((Shape) obj).getColor() == this.color);
        }
        else {
            return false;
        }
    }
}
