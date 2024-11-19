import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel {
    private Register register;
    private JTextField input;
    private PursePanel changePanel;

    public RegisterPanel() {
        this.register = new Register();
        this.setLayout(new BorderLayout());

        input = new JTextField(10);
        input.addActionListener(new InputListener());

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter Amount:"));
        inputPanel.add(input);

        changePanel = new PursePanel();

        this.add(inputPanel, BorderLayout.NORTH);
        this.add(changePanel, BorderLayout.CENTER);
    }

    private class InputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double amt = Double.parseDouble(input.getText());
                Purse purse = register.makeChange(amt);
                changePanel.setPurse(purse);
                changePanel.repaint();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(RegisterPanel.this, "Invalid input. Please enter a valid number.");
            }
        }
    }
}
