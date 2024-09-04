import javax.swing.*;
import java.awt.*;
import java.util.List;


public class PursePanel extends JPanel {
    public Purse purse;
    public JPanel innerDisplayPanel;
    public JLabel label;

    public void setPurse(Purse purse) {
        this.purse = purse; // Set the purse from RegisterPanel
    }

    // Constructor for the DisplayPanel.  Just set the dimensions and color
    public PursePanel() {

        this.purse = new Purse();

        this.setBackground(Color.DARK_GRAY);
        this.setPreferredSize(new Dimension(970, 400));
        innerDisplayPanel = new JPanel();
        innerDisplayPanel.setBackground(Color.DARK_GRAY);

        this.add(innerDisplayPanel);

    }


    public void setText(String input){




            this.setPreferredSize(new Dimension(700, 700));
            this.setBackground(Color.WHITE);

            JLabel label = new JLabel("Hello World");

            label.setFont(new Font("Serif", Font.BOLD, 50));
            label.setForeground(Color.BLUE);




        this.add(label);

        ImageIcon img = new ImageIcon( "image/penny.png");



    }



    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Purse purse = new Purse();


    }
}



