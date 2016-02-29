import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

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
    public Shape(Point2D.Double center, double radius, Color color)
    {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }
    
    public Point2D.Double getCenter()
    {
        
    }
    
    public double getRadius()
    {
        
    }
    
    public void move(double x, double y)
    {
        
    }
    
    public void setRadius(double r)
    {
        
    }
    
    public boolean isInside(Point2D.Double point)
    {
        
    }
    
    public boolean isOnBorder(Point2D.Double point)
    {
        
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        
    }
}
