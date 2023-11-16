import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tesFileChooser {
    private JFrame jframe;
    private JTextField nik;
    private JLabel labelFoto;
    
    public tesFileChooser() {
        jframe = new JFrame();
        jframe.setTitle("Screen-1 input data");
        jframe.setSize(500, 500);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(null); // Non-layout manager

        // Ini nik
        JLabel labelNIK = new JLabel("NIK");
        labelNIK.setBounds(10, 10, 80, 20);
        jframe.add(labelNIK);

        nik = new JTextField(20);
        nik.setBounds(100, 10, 180, 20);
        jframe.add(nik);

        // Ini foto
        labelFoto = new JLabel("Foto anda");
        labelFoto.setBounds(10, 10, 200, 200); // Diperbesar ukuran label untuk menampilkan gambar
        jframe.add(labelFoto);

        JButton buttonChooseFoto = new JButton("Pilih Foto");
        buttonChooseFoto.setBounds(10, 220, 100, 20);
        jframe.add(buttonChooseFoto);

        buttonChooseFoto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chooseFoto();
            }
        });

        JButton buttonSubmit = new JButton("SUBMIT");
        buttonSubmit.setBounds(20, 300, 100, 20);
        buttonSubmit.setEnabled(true);
        jframe.add(buttonSubmit);

        // action listener nya
        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String nikValue = nik.getText();
               ImageIcon fotoValue = (ImageIcon) labelFoto.getIcon();
               
               new HasilScreen(nikValue, fotoValue);
            }
        });
        
        jframe.setVisible(true);
    }

    private void chooseFoto() {
        JFileChooser fotoChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Picture Files", "jpg", "jpeg", "png");
        fotoChooser.setFileFilter(filter);

        int returnValue = fotoChooser.showOpenDialog(jframe); // Tampilkan dialog pemilihan file

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fotoChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            try {
                BufferedImage img = ImageIO.read(new File(filePath));
                Image scaledImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                ImageIcon imageIcon = new ImageIcon(scaledImg);
                labelFoto.setIcon(imageIcon);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // Pengguna membatalkan pemilihan file atau menutup dialog
            System.out.println("Pemilihan file dibatalkan.");
        }
    }
    public static void main(String[] args) {
        new tesFileChooser();
    }
}
