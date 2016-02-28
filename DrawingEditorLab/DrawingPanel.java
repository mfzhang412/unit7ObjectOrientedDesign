import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    private ArrayList<Shapes> shapeList;
    private Shape activeShape;
    private MouseListener listener123;
    
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        this.setBackground(Color.WHITE);
        activeShape
        shapeList = newList<Shape>();
        listener123 = new MouseListener123();
    }

    public Color getColor()
    {
        int red = activeShape.getRed();
        int green = activeShape.getGreen();
        int blue = activeShape.getBlue();
        
        return Color(red, green, blue);
    }
    
    public Dimension getPreferredSize()
    {
        
    }
    
    public void pickColor()
    {
        
    }
    
    public void addCircle()
    {
        Ellipse2D.Double circle = new Ellipse2D.Double(50, 50, 150, 200);
        shapeList.add(circle);
        activeShape = circle;
    }
    
    public void addSquare()
    {
        Rectangle square = new Rectangle(125, 175, 50, 50);
        shapeList.add(square);
        activeShape = square;
    }
    
    public void paintComponent(Graphics g)
    {
        for (int i = shapeList.size(); i >= 0; i--)
        {
            g.setColor(getColor);
            if (activeShape != shapeList[i])
            {
                g.fill(shapeList[i]);
                g.draw(shapeList[i]);
            }
            else
            {
                g.draw(activeShape);
            }
        }
    }
    
    public class ClickListener implements MouseListener
    {
        public ClickListener(MouseEvent event)
        {
            
        }
    }
    public class MotionListener implements MouseMotionListener
    {
        
    }
    public class TypingListener implements KeyListener
    {
        
    }
    
}
