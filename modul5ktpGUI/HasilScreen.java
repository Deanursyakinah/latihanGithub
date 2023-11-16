import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HasilScreen {
    public HasilScreen(String nik, ImageIcon foto) {
        JFrame jframe = new JFrame();
        jframe.setTitle("Hasil Input Data");
        jframe.setSize(500, 500);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        jframe.add(panel);
        
        JLabel labelNIK = new JLabel("NIK: " + nik);
        panel.add(labelNIK);

        JLabel labelFoto = new JLabel(foto);
        panel.add(labelFoto);

        jframe.setVisible(true);
    }
}
