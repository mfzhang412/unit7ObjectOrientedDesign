import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Class that extends JPanel
 * 
 * @author Michael Zhang
 * @version 3/4/2016
 */
public class ControlPanel extends JPanel
{
    /** Defines the buttons that will be clicked */
    private JButton b1;
    private JButton b2;
    private JButton b3;
    
    /** Defines the canvas, the Jpanel that shows the currentColor, and currentColor */
    private DrawingPanel canvas;
    private JPanel getColorPanel;
    private Color currentColor;
    
    /**
     * Control Panel
     */
    public ControlPanel(DrawingPanel panel)
    {
        canvas = panel;
        
        this.b1 = new JButton("Pick Color");
        this.b2 = new JButton("Add Circle");
        this.b3 = new JButton("Add Square");
        
        getColorPanel = new JPanel();
        currentColor = canvas.getColor();
        
        this.add(b1);
        this.add(getColorPanel);
        getColorPanel.setBackground(currentColor);
        this.add(b2);
        this.add(b3);
        
        ColorListener b1Listener = new ColorListener();
        CircleListener b2Listener = new CircleListener();
        SquareListener b3Listener = new SquareListener();
        
        b1.addActionListener(b1Listener);
        b2.addActionListener(b2Listener);
        b3.addActionListener(b3Listener);
    }
    
    public class ColorListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            canvas.pickColor();
            currentColor = canvas.getColor();
            getColorPanel.setBackground(currentColor);
            canvas.repaint();
        }
    }
    
    public class CircleListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            canvas.addCircle();
            canvas.repaint();
        }
    }
    
    public class SquareListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            canvas.addSquare();
            canvas.repaint();
        }
    }
}
