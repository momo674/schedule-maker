import java.awt.*;
import javax.swing.*;
public class DayNamePanel extends JPanel {
    private final String[] day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    DayNamePanel() {
        this.setBounds(75, 200, 1770, 50);
        this.setOpaque(false);
        this.setLayout(null);
        
        JPanel test = new JPanel();
        test.setLayout(null);
        test.setBackground(Color.RED);
        test.setBounds(0, 0, 252, 50);
        
        JLabel day = new  JLabel("Hello");
        day.setVerticalAlignment(JLabel.CENTER);
        day.setHorizontalAlignment(JLabel.CENTER);
        test.add(day);
        this.add(test);
        
    }



   
}
