import java.awt.*;
import javax.swing.*;

public class MakingChange extends JFrame {

    public static void main(String[] args) {

       JFrame frame = new JFrame("Making Change");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


       RegisterPanel registerPanel = new RegisterPanel();
       frame.getContentPane().add(new RegisterPanel());
       frame.pack();
       frame.setVisible(true);
    }



}