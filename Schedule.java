import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class Schedule{
    private JFrame frame;
    private JPanel panel;
    private int length = this.getUserDisplayLength();
    private int height = this.getUserDisplayHeight();
    public Schedule() {
        this.frame = this.MainFrame();
        this.panel = this.MainPanel();
        panel.add(this.SchedulePanelView());
        frame.add(panel);

        

    }
    public JFrame MainFrame() {
        frame = new JFrame("Schedule");
        frame.getContentPane().setBackground(Color.RED);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setBounds(0,0,720,480);
        return frame;
    }

    public JPanel MainPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,length,height);
        panel.setBackground(Color.DARK_GRAY);
        
        return panel;
    }
    public JPanel SchedulePanelView() {
        int schedulex = (int) (length/10);
        int scheduley = (int) (height/4);
        int schedulexsize = (int) (length - 2*schedulex);
        int scheduleysize = (int) (height - 1.25*scheduley);
        JPanel blank = new JPanel();
        blank.setBounds(schedulex,scheduley,schedulexsize,scheduleysize);
        blank.setLayout(null);
        blank.setBackground(Color.BLUE);

        JPanel test = new JPanel();
        //test.setLayout(null);
        test.setBounds(0,0,100,100);
        test.setBackground(Color.ORANGE);
        test.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        blank.add(test);
        return blank;
    }

    public int getUserDisplayLength(){
       GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        return (int) width;
    }

    public int getUserDisplayHeight(){
       GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int height = gd.getDisplayMode().getHeight();
        return (int) height;
    }

    public static void main(String[] args) {
        Schedule a = new Schedule();
    }
}