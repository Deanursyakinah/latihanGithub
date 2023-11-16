import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Pencarian {
    JFrame jframe;
    JLabel inputNik;
    JTextField search;
    JButton cari;
    JButton back;
    ArrayList<Penduduk> penduduk = new ArrayList<Penduduk>();

    public Pencarian() {
        jframe = new JFrame();
        jframe.setTitle("Menu Pencarian");
        jframe.setSize(300, 150);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(null);

        inputNik = new JLabel("Input NIK : ");
        inputNik.setBounds(10, 30, 100, 20);
        inputNik.setEnabled(true);
        jframe.add(inputNik);

        search = new JTextField(20);
        search.setBounds(80, 30, 100, 30);
        search.setEnabled(true);
        jframe.add(search);

        cari = new JButton("Search");
        cari.setBounds(180, 28, 80, 15);
        cari.setEnabled(true);
        jframe.add(cari);

        cari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputNik == null) {
                    JOptionPane.showMessageDialog(null, "input kosong");
                } else {
                    Control control = new Control();
                    Penduduk person = control.getPenduduk(search.getText());
                    penduduk.add(person);
                    new HasilPerekaman(penduduk, search.getText());
                }
            }
        });

        back = new JButton("Back"); //kembali ke main menu
        back.setBounds(180, 48, 80, 15);
        back.setEnabled(true);
        jframe.add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jframe.dispose();
            }
        });

        jframe.setVisible(true);
    }
    public static void main(String[] args) {
        new Pencarian();
    }
}
