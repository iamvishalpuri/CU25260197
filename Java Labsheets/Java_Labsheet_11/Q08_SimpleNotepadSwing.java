import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Q08_SimpleNotepadSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple Notepad"); JTextArea area = new JTextArea(20, 60); frame.add(new JScrollPane(area));
            JMenuBar bar = new JMenuBar(); JMenu file = new JMenu("File"); JMenuItem newItem = new JMenuItem("New"); JMenuItem open = new JMenuItem("Open"); JMenuItem save = new JMenuItem("Save"); JMenuItem exit = new JMenuItem("Exit");
            file.add(newItem); file.add(open); file.add(save); file.addSeparator(); file.add(exit); bar.add(file); frame.setJMenuBar(bar);
            newItem.addActionListener(e -> area.setText(""));
            open.addActionListener(e -> { JFileChooser chooser = new JFileChooser(); if (chooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) try (BufferedReader reader = new BufferedReader(new FileReader(chooser.getSelectedFile()))) { area.read(reader, null); } catch (IOException ex) { JOptionPane.showMessageDialog(frame, "Unable to open file."); } });
            save.addActionListener(e -> { JFileChooser chooser = new JFileChooser(); if (chooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) try (FileWriter writer = new FileWriter(chooser.getSelectedFile())) { area.write(writer); } catch (IOException ex) { JOptionPane.showMessageDialog(frame, "Unable to save file."); } });
            exit.addActionListener(e -> frame.dispose()); frame.setSize(700, 450); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setLocationRelativeTo(null); frame.setVisible(true);
        });
    }
}

/*
Expected GUI behavior:
New clears the text area, Open loads a text file, Save writes the text area to a file,
and Exit closes the application.
*/
