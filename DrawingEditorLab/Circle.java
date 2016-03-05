import java.awt.geom.Point2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Class that extends Shape
 * 
 * @author Michael Zhang
 * @version 3/4/2016
 */
public class Circle extends Shape
{
    /**
     * Circle constructor
     */
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
    
    //     public boolean isOnBorder(Point2D.Double point)
    //     {
    //         boolean tf = false;
    //         double x = point.getX();
    //         double y = point.getY();
    //         
    //         if (((x == (this.getCenter()).getX() - this.getRadius()) || (x == (this.getCenter()).getX() + this.getRadius())) &&
    //             ((y == (this.getCenter()).getY() - this.getRadius()) && (y == (this.getCenter()).getY() + this.getRadius())))
    //             {
    //                 tf = true;
    //             }
    //         
    //         return tf;
    //     }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        Ellipse2D.Double circle = new Ellipse2D.Double((this.getCenter()).getX() - this.getRadius(), (this.getCenter()).getY() - this.getRadius(), this.getRadius() * 2, this.getRadius() * 2);
        g2.setColor(this.getColor());
        if (filled)
            g2.fill(circle);
        g2.draw(circle);
    }
}
