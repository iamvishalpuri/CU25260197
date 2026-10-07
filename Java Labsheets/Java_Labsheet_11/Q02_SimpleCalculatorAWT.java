import java.awt.*;
import java.awt.event.*;

public class Q02_SimpleCalculatorAWT extends Frame implements ActionListener {
    private final TextField first = new TextField(12);
    private final TextField second = new TextField(12);
    private final Label result = new Label("Result: ");

    public Q02_SimpleCalculatorAWT() {
        setTitle("AWT Calculator"); setSize(350, 220); setLayout(new GridLayout(4, 2, 8, 8));
        add(new Label("First number:")); add(first);
        add(new Label("Second number:")); add(second);
        String[] operations = {"Add", "Subtract", "Multiply", "Divide"};
        for (String operation : operations) { Button button = new Button(operation); button.addActionListener(this); add(button); }
        add(result);
        addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent e) { dispose(); } });
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(first.getText());
            double b = Double.parseDouble(second.getText());
            double value;
            switch (e.getActionCommand()) {
                case "Add" -> value = a + b;
                case "Subtract" -> value = a - b;
                case "Multiply" -> value = a * b;
                default -> { if (b == 0) throw new ArithmeticException("Division by zero"); value = a / b; }
            }
            result.setText("Result: " + value);
        } catch (NumberFormatException ex) { result.setText("Enter valid numbers."); }
        catch (ArithmeticException ex) { result.setText(ex.getMessage()); }
    }

    public static void main(String[] args) { new Q02_SimpleCalculatorAWT(); }
}

/*
Expected GUI behavior:
The four buttons perform addition, subtraction, multiplication and division.
Invalid numbers and division by zero display an error message.
*/
