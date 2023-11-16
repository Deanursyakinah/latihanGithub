import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JobSelectionApp extends JFrame {
    private JCheckBox karyawanSwastaCheckBox;
    private JCheckBox pnsCheckBox;
    private JCheckBox wiraswastaCheckBox;
    private JCheckBox akademisiCheckBox;
    private JCheckBox pengangguranCheckBox;

    public JobSelectionApp() {
        setTitle("Job Selection");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        karyawanSwastaCheckBox = new JCheckBox("Karyawan Swasta");
        pnsCheckBox = new JCheckBox("PNS");
        wiraswastaCheckBox = new JCheckBox("Wiraswasta");
        akademisiCheckBox = new JCheckBox("Akademisi");
        pengangguranCheckBox = new JCheckBox("Pengangguran");

        add(karyawanSwastaCheckBox);
        add(pnsCheckBox);
        add(wiraswastaCheckBox);
        add(akademisiCheckBox);
        add(pengangguranCheckBox);

        pengangguranCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (pengangguranCheckBox.isSelected()) {
                    // Jika "Pengangguran" di-check, maka disable semua JCheckBox lainnya
                    karyawanSwastaCheckBox.setEnabled(false);
                    pnsCheckBox.setEnabled(false);
                    wiraswastaCheckBox.setEnabled(false);
                    akademisiCheckBox.setEnabled(false);
                } else {
                    // Jika "Pengangguran" di-uncheck, maka enable semua JCheckBox lainnya
                    karyawanSwastaCheckBox.setEnabled(true);
                    pnsCheckBox.setEnabled(true);
                    wiraswastaCheckBox.setEnabled(true);
                    akademisiCheckBox.setEnabled(true);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JobSelectionApp().setVisible(true);
            }
        });
    }
}
