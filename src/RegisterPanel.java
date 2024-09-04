import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegisterPanel extends JPanel {

        public Register register;
        public JPanel inputPanel;
        public JTextField input;
        public PursePanel changePanel;


        // Constructor for RegisterPanel
        public RegisterPanel() {

            this.register = new Register();
            this.inputPanel = new JPanel();
            this.input = new JTextField();
            this.changePanel = new PursePanel();


            // Set dimensions for the main panel
            this.setPreferredSize(new Dimension(1000, 750));
            this.setBackground(Color.GRAY);

            // Create Upper panel that holds the text field.
            JPanel upperPanel = new JPanel();
            upperPanel.setBackground(Color.BLUE);
            upperPanel.setPreferredSize(new Dimension(970, 200));

            // Set up the TextField.  Make it bigger, add the action listener so that it can respond to events.  Add it
            // to the upper panel
            input = new JTextField();
            input.setPreferredSize(new Dimension(300, 50));
            input.setFont(new Font("sansserif", Font.PLAIN, 40));
            input.addActionListener(new TextListener());
            upperPanel.add(input);



            // Add the upper panel to the main panel.
            this.add(upperPanel);

            // Create the Display Panel and add it to the main panel.
            // This is the panel that should update when the event fires.
            changePanel = new PursePanel();
            this.add(changePanel);


        }

        //  This is an inner class that represents the Listener/Responder to changes in the
        // text field.
        private class TextListener implements ActionListener {
            // The function that gets called when the enter key is hit.
            public void actionPerformed(ActionEvent e) {

                    double inputValue = Double.parseDouble(input.getText());
                    Purse purse = register.makeChange(inputValue);

                    changePanel.setPurse(purse);

                    System.out.println(purse);





                    //changePanel.paintComponent(); // Update the change display

                   revalidate();
                   repaint();

            }
        }




}
