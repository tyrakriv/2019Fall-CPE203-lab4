import org.w3c.dom.css.Rect;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class WorkSpace {
    private List<Shape> shapeList;

    public WorkSpace(){
        this.shapeList = new LinkedList<Shape>();
    }

    public void add (Shape shape){
        shapeList.add(shape);
    }

    public Shape get(int index){
        return shapeList.get(index);
    }

    public int size(){
        return shapeList.size();
    }

    public List<Circle> getCircles(){
        List<Circle> circles = new LinkedList<>();
        for (int i = 0; i < shapeList.size(); i++){
            if (shapeList.get(i) instanceof Circle){
                circles.add((Circle)shapeList.get(i));
            }
        }
        return circles;
    }

    public List<Rectangle> getRectangles(){
        List<Rectangle> rectangles = new LinkedList<Rectangle>();
        for (int i = 0; i < shapeList.size(); i++){
            if (shapeList.get(i) instanceof Rectangle){
                rectangles.add((Rectangle) shapeList.get(i));
            }
        }
        return rectangles;
    }

    public List<Triangle> getTriangles(){
        List<Triangle> triangles = new LinkedList<Triangle>();
        for (int i = 0; i < shapeList.size(); i++){
            if (shapeList.get(i) instanceof Triangle){
                triangles.add((Triangle) shapeList.get(i));
            }
        }
        return triangles;
    }

    public List<Shape> getShapesByColor(Color color){
        List<Shape> colorshapes = new LinkedList<Shape>();
        for (int i = 0; i < shapeList.size(); i++){
            if (shapeList.get(i).getColor() == color){
                colorshapes.add(shapeList.get(i));
            }
        }
        return colorshapes;
    }

    public double getAreaOfAllShapes(){
        double totalArea = 0.0;
        for (int i = 0; i < shapeList.size(); i++){
            totalArea += shapeList.get(i).getArea();
        }
        return totalArea;
    }

    public double getPerimeterOfAllShapes(){
        double totalPerimeter = 0.0;
        for (int i = 0; i < shapeList.size(); i++){
            totalPerimeter += shapeList.get(i).getPerimeter();
        }
        return totalPerimeter;
    }

}
