import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JColorChooser;
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
    private ArrayList<Shape> shapeList;
    private Shape activeShape;
    private ClickListener clickedListener;
    private MotionListener draggedListener;
    private Color currentColor;
    
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        this.setBackground(Color.WHITE);
        //activeShape
        shapeList = new ArrayList<Shape>();
        clickedListener = new ClickListener();
        draggedListener = new MotionListener();
    }

    public Color getColor()
    {
        return currentColor;
    }
    
    public Dimension getPreferredSize()
    {
        
    }
    
    public void pickColor()
    {
        JColorChooser chooser = new JColorChooser();
        currentColor = chooser.getColor();
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
        repaint();
    }
    
    public class ClickListener implements MouseListener
    {
        
    }
    
    public class MotionListener implements MouseMotionListener
    {
        
    }
    
}
