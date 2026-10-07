import java.awt.*;
import java.awt.event.*;

public class Q06_EmployeeRegistrationFormAWT extends Frame {
    private final TextField id = new TextField(); private final TextField name = new TextField(); private final TextField department = new TextField(); private final TextField designation = new TextField(); private final TextField salary = new TextField(); private final TextArea output = new TextArea(); private final Checkbox male = new Checkbox("Male"); private final Checkbox female = new Checkbox("Female"); private final Choice departmentChoice = new Choice();

    public Q06_EmployeeRegistrationFormAWT() {
        setTitle("Employee Registration"); setSize(600, 420); setLayout(new BorderLayout(8, 8));
        Panel form = new Panel(new GridLayout(7, 2, 8, 8));
        addField(form, "Employee ID:", id); addField(form, "Name:", name); addField(form, "Department:", department); addField(form, "Designation:", designation); addField(form, "Salary:", salary);
        form.add(new Label("Gender:")); Panel gender = new Panel(); gender.add(male); gender.add(female); form.add(gender);
        form.add(new Label("Department selection:")); departmentChoice.add("IT"); departmentChoice.add("HR"); departmentChoice.add("Finance"); departmentChoice.add("Sales"); form.add(departmentChoice);
        add(form, BorderLayout.NORTH);
        Panel buttons = new Panel(); Button submit = new Button("Submit"); Button clear = new Button("Clear"); buttons.add(submit); buttons.add(clear); add(buttons, BorderLayout.CENTER); add(output, BorderLayout.SOUTH);
        submit.addActionListener(e -> output.setText("ID: " + id.getText() + "\nName: " + name.getText() + "\nDepartment: " + departmentChoice.getSelectedItem() + "\nDesignation: " + designation.getText() + "\nSalary: " + salary.getText()));
        clear.addActionListener(e -> { id.setText(""); name.setText(""); department.setText(""); designation.setText(""); salary.setText(""); output.setText(""); });
        addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent e) { dispose(); } }); setVisible(true);
    }
    private void addField(Panel panel, String label, TextField field) { panel.add(new Label(label)); panel.add(field); }
    public static void main(String[] args) { new Q06_EmployeeRegistrationFormAWT(); }
}

/*
Expected GUI behavior:
Submit displays employee details in the TextArea; Clear removes all entered values.
*/
