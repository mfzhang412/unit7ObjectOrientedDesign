import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Abstract class Shape that will have subclasses Square and Circle
 * 
 * @author Michael Zhang
 * @version 3/4/2016
 */
abstract public class Shape
{
    /** Defines the center, radius, and color of the shape */
    public Point2D.Double center;
    public double radius;
    public Color color;
    
    /**
     * Shape constructor
     */
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
    
    public Color getColor()
    {
        return color;
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
    //abstract public boolean isOnBorder(Point2D.Double point);
    abstract public void draw(Graphics2D g2, boolean filled);
}
