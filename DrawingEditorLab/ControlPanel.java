import javax.swing.JPanel;

/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    JButton b1;
    JButton b2;
    Jbutton b3;
    JPanel getColorPanel;
    
    public ControlPanel(DrawingPanel panel)
    {
        this.b1 = new JButton("Pick Color");
        getColorPanel = new JPanel();
        this.b2 = new JButton("Add Circle");
        this.b3 = new JButton("Add Square");
        this.add(b1);
        this.add(getColorPanel.setBackground(panel.getColor));
        this.add(b2);
        this.add(b3);
    }

}
