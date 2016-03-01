import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{    
    public Circle(Point2D.Double c, double r, Color cC)
    {
        super(c, r, cC);
    }
    
    public boolean isInside(Point2D.Double point)
    {
        boolean tf = false;
        double x = point.getX();
        double y = point.getY();
        if (((x > (this.getCenter()).getX() - this.getRadius()) && (x < (this.getCenter()).getX() + this.getRadius())) &&
            ((y > (this.getCenter()).getY() - this.getRadius()) && (y < (this.getCenter()).getY() + this.getRadius())))
            {
                tf = true;
            }
        
        return tf;
    }
    
    public boolean isOnBorder(Point2D.Double point)
    {
        boolean tf = false;
        double x = point.getX();
        double y = point.getY();
        
        //if (((x = (this.getCenter()).getX() - this.getRadius()) || (x < (this.getCenter()).getX() + this.getRadius())) &&
            ((y > (this.getCenter()).getY() - this.getRadius()) && (y < (this.getCenter()).getY() + this.getRadius())))
            {
                tf = true;
            }
        
        return tf;
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        
    }
}
