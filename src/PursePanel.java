import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class PursePanel extends JPanel {
    private Purse purse;

    public PursePanel() {
        purse = new Purse();
    }

    public void setPurse(Purse purse) {
        this.purse = purse;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Starting coordinates for drawing
        int x = 10;
        int y = 20;

        // Iterate over the denominations and their counts in the purse
        for (MoneyType type : MoneyType.values()) {
            Map<String, Integer> denominations = purse.getCash().get(type);
            for (Map.Entry<String, Integer> entry : denominations.entrySet()) {
                String denominationName = entry.getKey();
                int count = entry.getValue();

                // Find the denomination object for this name
                Denomination denomination = findDenominationByName(denominationName);

                // Draw the image and the count of coins/bills
                if (denomination != null) {
                    ImageIcon icon = new ImageIcon(denomination.img()); // Load the image
                    Image image = icon.getImage();
                    g.drawImage(image, x, y, 50, 50, this); // Draw image at (x, y) with fixed size 50x50
                    g.drawString(denominationName + " x " + count, x, y + 60); // Display the count below the image
                    y += 70; // Move down to next row for the next denomination
                }
            }
        }
        revalidate();
        repaint();
    }

    // Helper method to find the Denomination by name
    private Denomination findDenominationByName(String name) {
        for (Denomination denomination : Register.denominations) {
            if (denomination.name().equals(name)) {
                return denomination;
            }
        }
        return null;
    }
}
