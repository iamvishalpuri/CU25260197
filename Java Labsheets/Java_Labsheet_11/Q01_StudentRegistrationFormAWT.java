import java.awt.*;
import java.awt.event.*;

public class Q01_StudentRegistrationFormAWT extends Frame implements ActionListener {
    private final TextField nameField = new TextField(20);
    private final TextField rollField = new TextField(20);
    private final TextField courseField = new TextField(20);
    private final Checkbox male = new Checkbox("Male");
    private final Checkbox female = new Checkbox("Female");
    private final Choice semester = new Choice();
    private final Label status = new Label("Enter details and click Submit.");

    public Q01_StudentRegistrationFormAWT() {
        setTitle("Student Registration Form");
        setSize(420, 350);
        setLayout(new GridLayout(7, 2, 8, 8));
        add(new Label("Student Name:")); add(nameField);
        add(new Label("Roll Number:")); add(rollField);
        add(new Label("Course:")); add(courseField);
        add(new Label("Gender:"));
        Panel genderPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(male); genderPanel.add(female); add(genderPanel);
        add(new Label("Semester:"));
        semester.add("1st Semester"); semester.add("2nd Semester"); semester.add("3rd Semester"); semester.add("4th Semester");
        add(semester);
        Button submit = new Button("Submit"); submit.addActionListener(this); add(submit);
        Button reset = new Button("Reset"); reset.addActionListener(e -> resetForm()); add(reset);
        add(new Label("Status:")); add(status);
        addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent e) { dispose(); } });
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        status.setText("Submitted: " + nameField.getText() + ", " + rollField.getText() + ", " + courseField.getText() + ", " + semester.getSelectedItem());
    }

    private void resetForm() {
        nameField.setText(""); rollField.setText(""); courseField.setText("");
        male.setState(false); female.setState(false); status.setText("Form reset.");
    }

    public static void main(String[] args) { new Q01_StudentRegistrationFormAWT(); }
}

/*
Expected GUI behavior:
1. Enter student details and select gender and semester.
2. Submit displays the entered information in the status label.
3. Reset clears all fields.
*/
