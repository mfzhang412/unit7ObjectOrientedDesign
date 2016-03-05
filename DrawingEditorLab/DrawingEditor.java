import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 * Class that extends JFrame
 * 
 * @author Michael Zhang
 * @version 3/4/2016
 */
public class DrawingEditor extends JFrame
{
    /** Defines the frame dimensions */
    final static private int FRAME_WIDTH = 1200;
    final static private int FRAME_HEIGHT = 600;
    
    /** Defines the canvas and controller */
    private DrawingPanel canvas;
    private ControlPanel controls;

    /**
     * Drawing Editor
     */
    public DrawingEditor()
    {
        canvas = new DrawingPanel();
        controls = new ControlPanel(canvas);
        
        this.setLayout(new BorderLayout());
        this.add(canvas, BorderLayout.CENTER);
        this.add(controls, BorderLayout.SOUTH);
        
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main (String[] args)
    {
        DrawingEditor frame = new DrawingEditor();
    }

}