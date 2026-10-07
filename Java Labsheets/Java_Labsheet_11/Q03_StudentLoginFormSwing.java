import javax.swing.*;
import java.awt.*;

public class Q03_StudentLoginFormSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Student Login");
            JTextField username = new JTextField();
            JPasswordField password = new JPasswordField();
            JPanel panel = new JPanel(new GridLayout(3, 2, 8, 8));
            panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
            panel.add(new JLabel("Username:")); panel.add(username);
            panel.add(new JLabel("Password:")); panel.add(password);
            JButton login = new JButton("Login"); JButton reset = new JButton("Reset");
            panel.add(login); panel.add(reset);
            login.addActionListener(e -> {
                boolean valid = username.getText().equals("student") && new String(password.getPassword()).equals("java123");
                JOptionPane.showMessageDialog(frame, valid ? "Login successful." : "Invalid username or password.");
            });
            reset.addActionListener(e -> { username.setText(""); password.setText(""); });
            frame.add(panel); frame.setSize(350, 180); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setLocationRelativeTo(null); frame.setVisible(true);
        });
    }
}

/*
Expected GUI behavior:
Correct credentials: username student, password java123.
A successful or invalid-login message is displayed using JOptionPane.
*/
