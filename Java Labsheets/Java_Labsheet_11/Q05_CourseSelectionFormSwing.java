import javax.swing.*;
import java.awt.*;

public class Q05_CourseSelectionFormSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Course Selection");
            JTextField studentName = new JTextField();
            JComboBox<String> course = new JComboBox<>(new String[]{"BCA", "BBA", "B.Com", "MCA"});
            JRadioButton male = new JRadioButton("Male"); JRadioButton female = new JRadioButton("Female");
            ButtonGroup gender = new ButtonGroup(); gender.add(male); gender.add(female);
            JCheckBox java = new JCheckBox("Java"); JCheckBox database = new JCheckBox("Database"); JCheckBox web = new JCheckBox("Web Development");
            JButton submit = new JButton("Submit"); JButton reset = new JButton("Reset");
            JPanel panel = new JPanel(new GridLayout(6, 2, 8, 8)); panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
            panel.add(new JLabel("Student Name:")); panel.add(studentName); panel.add(new JLabel("Course:")); panel.add(course);
            panel.add(new JLabel("Gender:")); JPanel genderPanel = new JPanel(); genderPanel.add(male); genderPanel.add(female); panel.add(genderPanel);
            panel.add(new JLabel("Subjects:")); JPanel subjectPanel = new JPanel(); subjectPanel.add(java); subjectPanel.add(database); subjectPanel.add(web); panel.add(subjectPanel);
            panel.add(submit); panel.add(reset);
            submit.addActionListener(e -> { String selectedGender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "Not selected"; String subjects = (java.isSelected() ? "Java " : "") + (database.isSelected() ? "Database " : "") + (web.isSelected() ? "Web Development" : ""); JOptionPane.showMessageDialog(frame, "Name: " + studentName.getText() + "\nCourse: " + course.getSelectedItem() + "\nGender: " + selectedGender + "\nSubjects: " + subjects); });
            reset.addActionListener(e -> { studentName.setText(""); gender.clearSelection(); java.setSelected(false); database.setSelected(false); web.setSelected(false); course.setSelectedIndex(0); });
            frame.add(panel); frame.setSize(650, 260); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setLocationRelativeTo(null); frame.setVisible(true);
        });
    }
}

/*
Expected GUI behavior:
Submit displays the selected student name, course, gender and subjects.
Reset clears the form.
*/
