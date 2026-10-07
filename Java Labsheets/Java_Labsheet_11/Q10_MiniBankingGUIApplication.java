import javax.swing.*;
import java.awt.*;

public class Q10_MiniBankingGUIApplication {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Mini Banking Application"); JPanel panel = new JPanel(new GridLayout(7, 2, 8, 8)); panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
            JTextField account = new JTextField(); JTextField customer = new JTextField(); JTextField balance = new JTextField("10000"); JTextField amount = new JTextField(); JLabel message = new JLabel("Enter details.");
            panel.add(new JLabel("Account Number:")); panel.add(account); panel.add(new JLabel("Customer Name:")); panel.add(customer); panel.add(new JLabel("Current Balance:")); panel.add(balance); panel.add(new JLabel("Amount:")); panel.add(amount);
            JButton deposit = new JButton("Deposit"); JButton withdraw = new JButton("Withdraw"); JButton check = new JButton("Check Balance"); JButton clear = new JButton("Clear"); panel.add(deposit); panel.add(withdraw); panel.add(check); panel.add(clear); panel.add(message);
            deposit.addActionListener(e -> updateBalance(balance, amount, message, true)); withdraw.addActionListener(e -> updateBalance(balance, amount, message, false)); check.addActionListener(e -> message.setText("Balance: " + balance.getText())); clear.addActionListener(e -> { account.setText(""); customer.setText(""); balance.setText("0"); amount.setText(""); message.setText("Inputs cleared."); });
            frame.add(panel); frame.setSize(500, 350); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setLocationRelativeTo(null); frame.setVisible(true);
        });
    }

    private static void updateBalance(JTextField balance, JTextField amount, JLabel message, boolean deposit) {
        try { double current = Double.parseDouble(balance.getText()); double value = Double.parseDouble(amount.getText()); if (value < 0) throw new NumberFormatException(); if (!deposit && value > current) { message.setText("Insufficient balance."); return; } balance.setText(String.format("%.2f", deposit ? current + value : current - value)); message.setText(deposit ? "Amount deposited." : "Amount withdrawn."); } catch (NumberFormatException ex) { message.setText("Enter valid positive amounts."); }
    }
}

/*
Expected GUI behavior:
Deposit adds the amount, Withdraw subtracts only when sufficient balance exists,
Check Balance displays the current balance, and Clear resets the inputs.
*/
