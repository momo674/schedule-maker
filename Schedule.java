import java.awt.*;
import javax.swing.*;
//import javax.swing.border.BevelBorder;

public class Schedule{
    private JFrame frame;
    private JPanel panel;
    private int length = this.getUserDisplayLength();
    private int height = this.getUserDisplayHeight();
    private Student person;
    public Schedule(Student person) {
        this.person = person;
        this.frame = this.MainFrame();
        this.panel = this.MainPanel();
        panel.add(this.SchedulePanelView());
        for (int i = 0; i <= 7; i++){
            frame.add(this.dayDisplay(i));
        }
        
        frame.add(panel);
        

        

    }
    public JFrame MainFrame() {
        frame = new JFrame("Schedule");
        frame.getContentPane().setBackground(Color.DARK_GRAY);
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
        blank.setBackground(Color.DARK_GRAY);
        
        JPanel test = new JPanel();

        int blocklength = schedulexsize / 7;
        int blockheight = scheduleysize / 48;
        
        int x = 0;
        int y = 0;
        int blockcounty = 0;
        for (int i = 0; i < schedulexsize - blocklength; i+= blocklength ) {
            if (blockcounty == 48) {blockcounty = 0; y=0;}
            
            inner:
            for (int j = 0; j < scheduleysize-blockheight; j+= blockheight){
                System.out.println(x + " " + y);
                if (blockcounty == 48) {break inner;}
                JPanel block = new JPanel();
                test.setLayout(null);
                block.setBounds(i,j,blocklength,blockheight);
                //block.setBackground(Color.RED);
                if (this.person.SCHEDULE.getArray()[y][x] !=0) {
                    block.setBackground(Color.RED);
                }
                else {
                    block.setBackground(Color.WHITE);
                }
                
                block.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
                blank.add(block);
                blockcounty++;
                y++;
            }
            x++;
            
            
        }        
        
        return blank;
    }
    public String indexToDayName(int day, int style){
        String[] name_list = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String name = name_list[day];

        if (style == 1) {name.toUpperCase();}
        if (style == 2) {name.toLowerCase();}


        return name;
    }

    public JPanel dayDisplay(int i) {
        int schedulex = (int) (this.length/10);
        int scheduley = (int) (this.height/4) - 50;
        int schedulexsize = (int) (length - 2*schedulex);
        int blocklength = schedulexsize / 7;
        int scheduleysize = 50;
        JPanel blank = new JPanel();
        //blank.setLayout(null);
        blank.setLayout(null);
        blank.setBounds(schedulex,scheduley,schedulexsize * i/7,scheduleysize);
        blank.setBackground(new Color(237,203,130));
        blank.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        JLabel day = new JLabel("Monday");
        day.setBounds(i*blocklength, 0, 70, 25);
        blank.add(day);
        
        // for (int i = schedulex; i < schedulexsize; i = i + blocklength){
        //     JPanel block = new JPanel();
        //     block.setLayout(null);
        //     block.setBounds(i,scheduley,blocklength,scheduleysize);
        //     block.setBackground(Color.CYAN);
        //     blank.add(block);
        // }

        
        
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
        Course cs = new Course("Python", 123, 1, 3, 1200, 1500, 1200, 1500 );

        Course math = new Course("Calculus", 456, 2, 4, 1250, 1450 , 1250, 1450 );
        Student bob = new Student("bob", "bob", 123, "cs");
        bob.addCourse(cs);
        bob.addCourse(math);
        System.out.println(bob);

        Schedule a = new Schedule(bob);

        
    }
}