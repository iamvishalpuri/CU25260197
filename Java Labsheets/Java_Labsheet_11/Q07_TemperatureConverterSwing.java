import javax.swing.*;
import java.awt.*;

public class Q07_TemperatureConverterSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Temperature Converter"); JTextField input = new JTextField(); JLabel result = new JLabel("Result: ");
            JRadioButton celsiusToFahrenheit = new JRadioButton("Celsius to Fahrenheit", true); JRadioButton fahrenheitToCelsius = new JRadioButton("Fahrenheit to Celsius"); ButtonGroup group = new ButtonGroup(); group.add(celsiusToFahrenheit); group.add(fahrenheitToCelsius);
            JButton convert = new JButton("Convert"); JButton clear = new JButton("Clear"); JPanel panel = new JPanel(new GridLayout(5, 1, 8, 8)); panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
            panel.add(new JLabel("Temperature:")); panel.add(input); panel.add(celsiusToFahrenheit); panel.add(fahrenheitToCelsius); JPanel buttons = new JPanel(); buttons.add(convert); buttons.add(clear); panel.add(buttons); panel.add(result);
            convert.addActionListener(e -> { try { double value = Double.parseDouble(input.getText()); double converted = celsiusToFahrenheit.isSelected() ? value * 9 / 5 + 32 : (value - 32) * 5 / 9; result.setText(String.format("Result: %.2f", converted)); } catch (NumberFormatException ex) { result.setText("Enter a valid temperature."); } });
            clear.addActionListener(e -> { input.setText(""); result.setText("Result: "); }); frame.add(panel); frame.setSize(400, 270); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setLocationRelativeTo(null); frame.setVisible(true);
        });
    }
}

/*
Expected GUI behavior:
The selected radio button determines the conversion direction.
Invalid input displays an error message.
*/
