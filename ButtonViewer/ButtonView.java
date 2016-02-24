import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonView
{
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 200;
    
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button;
    private JButton button2;
    
    public ButtonView()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();
        
        this.label = new JLabel("");
        this.panel.add(label);
        
        this.button = new JButton("A");
        this.panel.add(button);
        
        this.button2 = new JButton("B");
        this.panel.add(button2);
        
        this.frame.add(panel);
        
        ClickListener listener = new ClickListener();
        button.addActionListener(listener);
        button2.addActionListener(listener);
        
        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        ButtonView view = new ButtonView();
    }
    
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            label.setText("Button " + event.getActionCommand() + " was clicked.");
            System.out.println("Button " + event.getActionCommand() + " was clicked.");
        }
    }
}