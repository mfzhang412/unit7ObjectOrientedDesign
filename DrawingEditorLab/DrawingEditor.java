import javax.swing.JFrame;

/**
 * Write a description of class DrawingEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
    final static private int FRAME_WIDTH = 300;
    final static private int FRAME_HEIGHT = 400;
    
    DrawingPanel canvas;
    ControlPanel controls;

    /**
     * Drawing Editor
     */
    public DrawingEditor()
    {
        canvas = new DrawingPanel();
        controls = new ControlPanel(canvas);
        
        this.add(controls, BorderLayout.SOUTH);
        this.add(canvas, BorderLayout.CENTER);
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main (String[] args)
    {
        DrawingEditor frame = new DrawingEditor();
    }

}
