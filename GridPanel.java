import java.awt.*;
import javax.swing.*;

public class GridPanel extends JPanel {
    GridPanel() {
        this.setBounds(75,200,1770,780);
    }
    public void paint(Graphics wasd) {
        Graphics2D g = (Graphics2D) wasd;
        g.setStroke(new BasicStroke(3));
        g.setColor(Color.BLACK);
        for (int i = 0; i < 1770; i=i+252) {
            if (i == 1764) {break;}
            g.drawLine(i, 0, i, 780);
        }
        for (int i = 50; i < 780; i = i + 30){
            if (i ==770) {break;}
            g.drawLine(0, i, 1770, i);
        }

        
    }
}