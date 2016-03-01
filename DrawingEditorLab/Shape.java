import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Write a description of abstract class Shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Shape
{
    Point2D.Double center;
    double radius;
    Color color;
    
    public Shape(Point2D.Double c, double r, Color cC)
    {
        center = c;
        radius = r;
        color = cC;
    }
    
    public Point2D.Double getCenter()
    {
        return center;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public void move(double x, double y)
    {
        center.setLocation(x, y);
    }
    
    public void setRadius(double r)
    {
        radius = r;
    }
    
    abstract public boolean isInside(Point2D.Double point);
    
    abstract public boolean isOnBorder(Point2D.Double point);
    
    abstract public void draw(Graphics2D g2, boolean filled);
}
