import java.awt.*;
import javax.swing.*;


public class Run{
    public static void main (String[] args) {

        
        JFrame f = new JFrame ("Schedule");
        f.setResizable(false);
        f.setBounds(0,0,1920,1080);
       f.getContentPane().setBackground(new Color (255,229,204));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        

       JPanel p1 = new JPanel();
       p1.setBounds(75, 250, 1770, 730);
       p1.setBackground(Color.DARK_GRAY);




       UpperBlack p2 = new UpperBlack();
       

       
       
        GridPanel p3 = new GridPanel();

        DayNamePanel p4 = new DayNamePanel();
        f.add(p4);
        f.add(p3);
       f.add(p2);
       f.add(p1);
       
       
       f.setVisible(true);
        

        
    }
}