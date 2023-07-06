import java.awt.*;
import javax.swing.*;
public class UpperBlack extends JPanel {
    UpperBlack(){
        this.setBounds(75, 200, 1770, 50);
        
    }
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.fillRect(0, 0, 1770, 50);
    }
}