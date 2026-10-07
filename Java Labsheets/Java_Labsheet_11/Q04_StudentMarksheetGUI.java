import javax.swing.*;
import java.awt.*;

public class Q04_StudentMarksheetGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Student Marksheet");
            JTextField[] fields = {new JTextField(), new JTextField(), new JTextField(), new JTextField(), new JTextField()};
            String[] subjects = {"English", "Mathematics", "Java", "DBMS", "Computer Networks"};
            JPanel panel = new JPanel(new GridLayout(7, 2, 8, 8));
            panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
            for (int i = 0; i < subjects.length; i++) { panel.add(new JLabel(subjects[i] + ":")); panel.add(fields[i]); }
            JButton calculate = new JButton("Calculate Result"); JLabel result = new JLabel("Enter marks out of 100.");
            panel.add(calculate); panel.add(result);
            calculate.addActionListener(e -> {
                try {
                    int total = 0; boolean pass = true;
                    for (JTextField field : fields) { int mark = Integer.parseInt(field.getText()); if (mark < 0 || mark > 100) throw new NumberFormatException(); total += mark; if (mark < 40) pass = false; }
                    double percentage = total / 5.0; String grade = percentage >= 90 ? "A+" : percentage >= 75 ? "A" : percentage >= 60 ? "B" : percentage >= 40 ? "C" : "F";
                    result.setText(String.format("Total: %d, Percentage: %.2f%%, Grade: %s, %s", total, percentage, grade, pass ? "PASS" : "FAIL"));
                } catch (NumberFormatException ex) { result.setText("Enter marks from 0 to 100."); }
            });
            frame.add(panel); frame.setSize(500, 300); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setLocationRelativeTo(null); frame.setVisible(true);
        });
    }
}

/*
Expected GUI behavior:
The Calculate Result button displays total, percentage, grade and pass/fail status.
*/
