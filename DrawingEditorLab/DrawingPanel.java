import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JColorChooser;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

/**
 * Class that extends Jpanel
 * 
 * @author Michael Zhang
 * @version 3/4/2016
 */
public class DrawingPanel extends JPanel
{
    /** Defines the list to hold the shapes and defines the activeShape */
    private ArrayList<Shape> shapeList;
    private Shape activeShape;
    
    /** Defines the listeners */
    private ClickListener clickedListener;
    private MotionListener draggedListener;
    private Color currentColor;
    
    /**
     * Drawing Panel
     */
    public DrawingPanel()
    {
        this.setBackground(Color.WHITE);
        currentColor = Color.RED;
        shapeList = new ArrayList<Shape>();
        clickedListener = new ClickListener();
        draggedListener = new MotionListener();
        this.addMouseListener(clickedListener);
        this.addMouseMotionListener(draggedListener);
    }

    public Color getColor()
    {
        return currentColor;
    }
    
    public Dimension getPreferredSize()
    {
        return (new Dimension(1000, 600));
    }
    
    public void pickColor()
    {
        currentColor = JColorChooser.showDialog(this, "Color Chooser", currentColor);
    }
    
    public void addCircle()
    {
        Circle circle = new Circle(new Point2D.Double(600, 300), 50, currentColor);
        shapeList.add(circle);
        activeShape = circle;
    }
    
    public void addSquare()
    {
        Square square = new Square(new Point2D.Double(600, 300), 50, currentColor);
        shapeList.add(square);
        activeShape = square;
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(Shape shape: shapeList)
        {
            shape.draw((Graphics2D) g, activeShape == null? true: (!(activeShape == shape)));
        }
    }
    
    public class ClickListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            boolean trueFalse = false;
            
            for (int i = 0; i < shapeList.size(); i++)
            {
                if ((shapeList.get(i)).isInside(new Point2D.Double(event.getX(), event.getY())))
                {
                    activeShape = shapeList.get(i);
                    trueFalse = true;
                }
            }
            
            if (!trueFalse)
            {
                activeShape = null;
            }
            
            repaint();
        }
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
    }
    
    public class MotionListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event)
        {
            activeShape.move(event.getX(), event.getY());
            repaint();
        }
        public void mouseMoved(MouseEvent e) {}
    }
}
