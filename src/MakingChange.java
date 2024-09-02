import java.awt.*;
import javax.swing.*;

public class MakingChange extends JFrame {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Making Change");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new RegisterPanel());
        frame.pack();
        frame.setVisible(true);
    }

    private static class RegisterPanel extends JPanel {
        public RegisterPanel(){

            //Set Dimensions of Main Panel
            this.setPreferredSize(new Dimension(500, 500));
            this.setBackground(Color.darkGray);

            //Create Upper Panel
            JPanel upperPanel = new JPanel();
            upperPanel.setBackground(Color.white);
            upperPanel.setPreferredSize(new Dimension(500, 250));


            this.add(upperPanel);

            JLabel label = new JLabel("Hello World");
            label.setFont(new Font("Serif", Font.BOLD, 50));
            label.setForeground(Color.BLUE);
            upperPanel.add(label);



            //label.setBackground(Color.magenta);
            //label.setOpaque(true);

            //..String text = label.getText();
            //label.setText("Good Morning");



            //ImageIcon img = new ImageIcon("images/penny.jfif");

            //JLabel imgLabel = new JLabel(img);
            //this.add(imgLabel);
            //label.setIcon(img);
            //label.setHorizontalTextPosition(SwingConstants.LEFT);











        }






    }




}