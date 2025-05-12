package AdVJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FoodOrderSystem {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Restaurant Food Order System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create checkboxes for food items
        JCheckBox pizza = new JCheckBox("Pizza - ₹200");
        JCheckBox burger = new JCheckBox("Burger - ₹150");
        JCheckBox pasta = new JCheckBox("Pasta - ₹180");
        JCheckBox salad = new JCheckBox("Salad - ₹100");

        // Add checkboxes to the frame
        frame.add(pizza);
        frame.add(burger);
        frame.add(pasta);
        frame.add(salad);

        // Create a button to calculate the total bill
        JButton calculateButton = new JButton("Calculate Total");
        frame.add(calculateButton);

        // Create a label to display the total bill
        JLabel totalLabel = new JLabel("Total: ₹0");
        frame.add(totalLabel);

        // Action listener for the calculate button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                StringBuilder selectedItems = new StringBuilder("Selected Items:\n");

                // Check which items are selected and add their prices
                if (pizza.isSelected()) {
                    total += 200;
                    selectedItems.append("- Pizza\n");
                }
                if (burger.isSelected()) {
                    total += 150;
                    selectedItems.append("- Burger\n");
                }
                if (pasta.isSelected()) {
                    total += 180;
                    selectedItems.append("- Pasta\n");
                }
                if (salad.isSelected()) {
                    total += 100;
                    selectedItems.append("- Salad\n");
                }

                // Update the total label with the total bill and selected items
                totalLabel.setText(
                        "<html>" + selectedItems.toString().replace("\n", "<br>") + "<br>Total: ₹" + total + "</html>");
            }
        });

        frame.setVisible(true);
    }
}
