import javax.swing.*;
import java.awt.*;

public class Q09_StudentFeedbackFormSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Student Feedback Form"); JPanel panel = new JPanel(new GridLayout(7, 2, 8, 8)); panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
            JTextField name = new JTextField(); JTextField roll = new JTextField(); JTextField course = new JTextField(); JTextArea comments = new JTextArea(4, 20);
            panel.add(new JLabel("Name:")); panel.add(name); panel.add(new JLabel("Roll Number:")); panel.add(roll); panel.add(new JLabel("Course:")); panel.add(course);
            String[] ratings = {"Excellent", "Very Good", "Good", "Average", "Poor"}; JPanel ratingPanel = new JPanel(); ButtonGroup ratingGroup = new ButtonGroup(); for (String value : ratings) { JRadioButton button = new JRadioButton(value); ratingGroup.add(button); ratingPanel.add(button); } panel.add(new JLabel("Rating:")); panel.add(ratingPanel);
            JCheckBox teaching = new JCheckBox("Teaching"); JCheckBox laboratory = new JCheckBox("Laboratory"); JCheckBox material = new JCheckBox("Course Material"); JCheckBox assignments = new JCheckBox("Assignments"); JPanel feedback = new JPanel(); feedback.add(teaching); feedback.add(laboratory); feedback.add(material); feedback.add(assignments); panel.add(new JLabel("Feedback:");); panel.add(feedback);
            panel.add(new JLabel("Comments:")); panel.add(new JScrollPane(comments)); JButton submit = new JButton("Submit"); JButton reset = new JButton("Reset"); panel.add(submit); panel.add(reset);
            submit.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Feedback submitted for " + name.getText() + ".")); reset.addActionListener(e -> { name.setText(""); roll.setText(""); course.setText(""); comments.setText(""); ratingGroup.clearSelection(); teaching.setSelected(false); laboratory.setSelected(false); material.setSelected(false); assignments.setSelected(false); });
            frame.add(panel); frame.setSize(800, 400); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setLocationRelativeTo(null); frame.setVisible(true);
        });
    }
}

/*
Expected GUI behavior:
The form collects student details, rating, checkbox feedback and comments.
Submit displays a confirmation; Reset clears the form.
*/
