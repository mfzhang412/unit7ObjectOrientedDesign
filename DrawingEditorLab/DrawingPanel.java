import javax.swing.JPanel;
import java.awt.geom.Ellipse2D;

/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    private List<Shapes> shapeList;
    
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        shapeList = newList<Shape>;
    }

    public Color getColor()
    {
        
    }
    
    public void pickColor()
    {
        
    }
    
    public void addCircle()
    {
        Ellipse2D.Double circle = new Ellipse2D.Double(50, 50, 20, 20);
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
