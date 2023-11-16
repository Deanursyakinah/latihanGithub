import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tes extends JFrame {
    private JTextField textField;
    private JTextField textField2;
    private JButton button;
    private JButton button2;

    public tes() {
        setTitle("Text Field Example");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        // Menggunakan GridBagLayout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints(); // buat kebawah
    
        // textField2 di atas textField
        textField2 = new JTextField("deaa2", 20);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST; // Mengatur anchor ke WEST (kiri)
        add(textField2, gbc);
    
        // button2 = new JButton("Submit");
        // gbc.gridx = 1;
        // gbc.gridy = 0;
        // add(button2, gbc);
    
        // gbc.gridx = 0;
        // gbc.gridy = 1;
        // textField = new JTextField("deaa", 30);
        // add(textField, gbc);
    
        // gbc.gridx = 1;
        // gbc.anchor = GridBagConstraints.WEST; // Mengatur anchor ke WEST (kiri)
        // button = new JButton("Submit");
        // add(button, gbc);
    
        //initializeGUI();
    
        setVisible(true);
    }
    
    
    // private void initializeGUI() {
    // //// Menambahkan ActionListener ke JTextField
    //     textField.addActionListener(new ActionListener() {
    //         public void actionPerformed(ActionEvent e) {
    //             String text = textField.getText();
    //             JOptionPane.showMessageDialog(null, "You entered: " + text);
    //         }
    //     });

    //     // Menambahkan ActionListener ke tombol
    //     button.addActionListener(new ActionListener() {
    //         public void actionPerformed(ActionEvent e) {
    //             String text = textField.getText();
    //             JOptionPane.showMessageDialog(null, "You entered: " + text);
    //         }
    //     });
    // }

    public static void main(String[] args) {
        new tes();
    }
}
