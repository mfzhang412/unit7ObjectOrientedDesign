import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private JButton b1;
    private JButton b2;
    private Jbutton b3;
    private DrawingPanel canvas;
    private JPanel getColorPanel;
    
    public ControlPanel(DrawingPanel panel)
    {
        canvas = panel;
        
        this.b1 = new JButton("Pick Color");
        this.b2 = new JButton("Add Circle");
        this.b3 = new JButton("Add Square");
        
        getColorPanel = new JPanel();
        
        this.add(b1);
        this.add(getColorPanel.setBackground(canvas.getColor));
        this.add(b2);
        this.add(b3);
        
        ColorListener b1Listener = new ColorListener();
        CircleListener b2Listener = new CircleListener();
        SquareListener b3Listener = new SquareListener();
        
        b1.addActionListener(b1Listener);
        b2.addActionListener(b2Listener);
        b3.addActionListener(b3Listener);
    }
    
    public class ColorListener implements ColorListener
    {
        public void actionPerformed(ActionEvent event)
        {
            canvas.pickColor();
            Color currentColor = canvas.getColor();
            getColorPanel.setBackground(currentColor);
        }
    }
    
    public class CircleListener implements ActionListener
    {
        canvas.addCircle();
        canvas.requestFocusInWindow();
    }
    
    public class SquareListener implements SquareListener
    {
        canvas.addSquare();
        canvas.requestFocusInWindow();
    }
}
