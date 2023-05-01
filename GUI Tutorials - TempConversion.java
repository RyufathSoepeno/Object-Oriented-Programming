import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversion extends JFrame implements ActionListener {
    private JLabel lblCelsius, lblFahrenheit;
    private JTextField txtCelsius, txtFahrenheit;
    private JButton btnCF, btnFC;

    public TempConversion() {
        super("Temperature Converter");

        // Create labels
        lblCelsius = new JLabel("Celsius:");
        lblFahrenheit = new JLabel("Fahrenheit:");

        // Create text fields
        txtCelsius = new JTextField(10);
        txtFahrenheit = new JTextField(10);

        // Create buttons
        btnCF = new JButton("Celsius to Fahrenheit");
        btnFC = new JButton("Fahrenheit to Celsius");

        // Add action listeners to buttons
        btnCF.addActionListener(this);
        btnFC.addActionListener(this);

        // Create panel for Celsius to Fahrenheit conversion
        JPanel panelCF = new JPanel();
        panelCF.setLayout(new GridLayout(2, 2));
        panelCF.add(lblCelsius);
        panelCF.add(txtCelsius);
        panelCF.add(lblFahrenheit);
        panelCF.add(txtFahrenheit);
        panelCF.setBorder(BorderFactory.createTitledBorder("Celsius to Fahrenheit"));

        // Create panel for Fahrenheit to Celsius conversion
        JPanel panelFC = new JPanel();
        panelFC.setLayout(new GridLayout(2, 2));
        panelFC.add(lblFahrenheit);
        panelFC.add(txtFahrenheit);
        panelFC.add(lblCelsius);
        panelFC.add(txtCelsius);
        panelFC.setBorder(BorderFactory.createTitledBorder("Fahrenheit to Celsius"));

        // Create main panel and add sub-panels and buttons
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(panelCF);
        mainPanel.add(panelFC);
        mainPanel.add(btnCF);
        mainPanel.add(btnFC);

        // Set frame properties and add main panel
        setContentPane(mainPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCF) {
            try {
                double celsius = Double.parseDouble(txtCelsius.getText());
                double fahrenheit = (celsius * 9/5) + 32;
                txtFahrenheit.setText(String.format("%.2f", fahrenheit));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
            }
        } else if (e.getSource() == btnFC) {
            try {
                double fahrenheit = Double.parseDouble(txtFahrenheit.getText());
                double celsius = (fahrenheit - 32) * 5/9;
                txtCelsius.setText(String.format("%.2f", celsius));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
            }
        }
    }

    public static void main(String[] args) {
        new TempConversion();
    }
}
