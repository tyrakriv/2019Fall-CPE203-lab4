import javax.sql.rowset.serial.SerialJavaObject;
import java.awt.*;

public class Triangle implements Shape{

    final double THRESHOLD = 0.0001;
    private Point a;
    private Point b;
    private Point c;
    private Color color;

    public Triangle(Point a, Point b, Point c, Color color){
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    public Point getVertexA() {
        return a;
    }

    public Point getVertexB() {
        return b;
    }

    public Point getVertexC() {
        return c;
    }

    @Override
    public double getArea() {
        return (.5 * ((a.x*b.y + b.x*c.y + c.x*a.y) - (a.y*b.x + b.y*c.x + c.y*a.x)));
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt((a.x - b.x)*(a.x - b.x) + (a.y - b.y)*(a.y - b.y)) +
                Math.sqrt((a.x - c.x)*(a.x - c.x) + (a.y - c.y)*(a.y - c.y)) +
                Math.sqrt((b.x - c.x)*(b.x - c.x) + (b.y - c.y)*(b.y - c.y));
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
        a.x += p.x;
        a.y += p.y;
        b.x += p.x;
        b.y += p.y;
        c.x += p.x;
        c.y += p.y;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Shape){
            Triangle t = (Triangle)obj;
            return (Math.abs(a.x - t.getVertexA().x) < THRESHOLD && Math.abs(a.y - t.getVertexA().y) < THRESHOLD
                    && Math.abs(b.x - t.getVertexB().x) < THRESHOLD && Math.abs(b.y - t.getVertexB().y) < THRESHOLD
                    && Math.abs(c.x - t.getVertexC().x) < THRESHOLD && Math.abs(c.y - t.getVertexC().y) < THRESHOLD);
        }
        else{
            return false;
        }
    }
}
