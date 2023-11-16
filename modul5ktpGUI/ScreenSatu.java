import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class ScreenSatu {
    JFrame jframe;
    JTextField nik;
    JTextField nama;
    JTextField tempatLahir;
    JRadioButton pria;
    JRadioButton wanita;
    JRadioButton golDarA;
    JRadioButton golDarB;
    JRadioButton golDarO;
    JRadioButton golDarAB;
    JTextField alamat;
    JTextField rtDanRw;
    JTextField kelDesa;
    JTextField kecamatan;
    String[] agama = { "Islam", "Kristen", "Katholik", "Hindu", "Buddha", "Konghucu" };
    JComboBox<String> cbAgama = new JComboBox<>(agama);
    String[] statusKawin = { "Belum menikah", "Menikah", "Janda", "Duda", "Jomblo" };
    JComboBox<String> cbStatusKawin = new JComboBox<>(statusKawin);
    JCheckBox karyawanSwasta;
    JCheckBox pns;
    JCheckBox wiraswasta;
    JCheckBox akademisi;
    JCheckBox pengangguran;
    JRadioButton wni;
    JRadioButton wna;
    JPanel fotoPanel;
    JFileChooser foto;
    JFileChooser ttd;
    JPanel fotoPanelTTD;
    JTextField berlakuHingga;
    JTextField kotaPembuatanKTP;
    Date tanggalPembuatanKtp;
    JButton buttonSubmit;
    ArrayList<Penduduk> person = new ArrayList<Penduduk>();

    public ScreenSatu() {
        jframe = new JFrame();
        jframe.setTitle("Screen-1 input data");
        jframe.setSize(700, 750);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(null); // Non-layout manager

        // ini nik
        JLabel labelNIK = new JLabel("NIK");
        labelNIK.setBounds(10, 10, 80, 20);
        jframe.add(labelNIK);

        nik = new JTextField(20);
        nik.setBounds(100, 10, 180, 20);
        jframe.add(nik);

        // ini nama
        JLabel labelNama = new JLabel("Nama");
        labelNama.setBounds(10, 40, 80, 20);
        jframe.add(labelNama);

        nama = new JTextField(20);
        nama.setBounds(100, 40, 180, 20);
        jframe.add(nama);

        // ini tempat lahir
        JLabel labelTempatLahir = new JLabel("Tempat Lahir");
        labelTempatLahir.setBounds(10, 70, 80, 20);
        jframe.add(labelTempatLahir);

        tempatLahir = new JTextField(20);
        tempatLahir.setBounds(100, 70, 180, 20);
        jframe.add(tempatLahir);

        // ini tanggal lahir
        JLabel labelTanggalLahir = new JLabel("Tanggal lahir");
        labelTanggalLahir.setBounds(10, 100, 80, 20);
        jframe.add(labelTanggalLahir);

        // GUI Library : Date
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        datePicker.setBounds(100, 100, 200, 30);
        jframe.add(datePicker);

        // ini gender
        JLabel labelGender = new JLabel("Jenis Kelamin");
        labelGender.setBounds(10, 135, 80, 20);
        jframe.add(labelGender);

        pria = new JRadioButton("Laki-Laki");
        pria.setBounds(100, 135, 80, 20);
        jframe.add(pria);

        wanita = new JRadioButton("Perempuan");
        wanita.setBounds(180, 135, 100, 20);
        jframe.add(wanita);

        ButtonGroup bgJk = new ButtonGroup();
        bgJk.add(pria);
        bgJk.add(wanita);

        // ini golongan darah
        JLabel labelGoldar = new JLabel("Gol darah");
        labelGoldar.setBounds(10, 165, 80, 20);
        jframe.add(labelGoldar);

        golDarA = new JRadioButton("A");
        golDarA.setBounds(100, 165, 40, 20);
        jframe.add(golDarA);

        golDarB = new JRadioButton("B");
        golDarB.setBounds(137, 165, 40, 20);
        jframe.add(golDarB);

        golDarO = new JRadioButton("O");
        golDarO.setBounds(175, 165, 40, 20);
        jframe.add(golDarO);

        golDarAB = new JRadioButton("AB");
        golDarAB.setBounds(215, 165, 50, 20);
        jframe.add(golDarAB);

        ButtonGroup bgGoldar = new ButtonGroup();
        bgGoldar.add(golDarA);
        bgGoldar.add(golDarB);
        bgGoldar.add(golDarO);
        bgGoldar.add(golDarAB);

        // ini alamat
        JLabel labelAlamat = new JLabel("Alamat");
        labelAlamat.setBounds(10, 190, 80, 20);
        jframe.add(labelAlamat);

        alamat = new JTextField(20);
        alamat.setBounds(100, 190, 180, 20);
        jframe.add(alamat);

        // ini rt dan rw
        JLabel labelRtRw = new JLabel("RT/RW");
        labelRtRw.setBounds(10, 220, 80, 20);
        jframe.add(labelRtRw);

        rtDanRw = new JTextField(20);
        rtDanRw.setBounds(100, 220, 180, 20);
        jframe.add(rtDanRw);

        // ini kel desa
        JLabel labelKelDesa = new JLabel("Kel/Desa");
        labelKelDesa.setBounds(10, 250, 80, 20);
        jframe.add(labelKelDesa);

        kelDesa = new JTextField(20);
        kelDesa.setBounds(100, 250, 180, 20);
        jframe.add(kelDesa);

        // ini kecamatan
        JLabel labelKecamatan = new JLabel("Kecamatan");
        labelKecamatan.setBounds(10, 280, 80, 20);
        jframe.add(labelKecamatan);

        kecamatan = new JTextField(20);
        kecamatan.setBounds(100, 280, 180, 20);
        jframe.add(kecamatan);

        // ini agama
        JLabel labelAgama = new JLabel("Agama");
        labelAgama.setBounds(10, 310, 80, 20);
        jframe.add(labelAgama);

        cbAgama.setBounds(100, 310, 180, 20);
        jframe.add(cbAgama);

        // ini status kawin
        JLabel labelStatusKawin = new JLabel("Status kawin");
        labelStatusKawin.setBounds(10, 335, 80, 20);
        jframe.add(labelStatusKawin);

        cbStatusKawin.setBounds(100, 335, 180, 20);
        jframe.add(cbStatusKawin);

        // ini pekerjaan
        JLabel labelPekerjaan = new JLabel("Pekerjaan");
        labelPekerjaan.setBounds(10, 365, 80, 20);
        jframe.add(labelPekerjaan);

        karyawanSwasta = new JCheckBox("Karyawan Swasta");
        karyawanSwasta.setBounds(100, 365, 180, 20);
        jframe.add(karyawanSwasta);

        pns = new JCheckBox("Pegawai Negeri Sipil");
        pns.setBounds(100, 390, 180, 20);
        jframe.add(pns);

        wiraswasta = new JCheckBox("Wiraswasta");
        wiraswasta.setBounds(100, 415, 180, 20);
        jframe.add(wiraswasta);

        akademisi = new JCheckBox("Akademisi");
        akademisi.setBounds(100, 440, 180, 20);
        jframe.add(akademisi);

        pengangguran = new JCheckBox("Pengangguran");
        pengangguran.setBounds(100, 465, 180, 20);
        jframe.add(pengangguran);

        // kalau pengangguran checked (yang lainnya disabled)
        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getItem() == pengangguran) {
                    boolean checked = pengangguran.isSelected();
                    karyawanSwasta.setEnabled(!checked);
                    pns.setEnabled(!checked);
                    wiraswasta.setEnabled(!checked);
                    akademisi.setEnabled(!checked);
                }
            }
        };
        pengangguran.addItemListener(itemListener);

        ItemListener itemListener2 = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getItem() == pengangguran) {
                    boolean checked = pengangguran.isSelected();
                    karyawanSwasta.setEnabled(!checked);
                    pns.setEnabled(!checked);
                    wiraswasta.setEnabled(!checked);
                    akademisi.setEnabled(!checked);
                    if (checked) {
                        karyawanSwasta.setSelected(false);
                        pns.setSelected(false);
                        wiraswasta.setSelected(false);
                        akademisi.setSelected(false);
                    }
                }
            }
        };
        pengangguran.addItemListener(itemListener2);

        // ini kewarganegaraan
        JLabel labelKewarganegaraan = new JLabel("Kewarganegaraan");
        labelKewarganegaraan.setBounds(10, 490, 80, 20);
        jframe.add(labelKewarganegaraan);

        wni = new JRadioButton("Warga Negara Indonesia");
        wni.setBounds(100, 490, 175, 20);
        jframe.add(wni);

        wna = new JRadioButton("Warga Negara Asing");
        wna.setBounds(275, 490, 180, 20);
        jframe.add(wna);

        ButtonGroup bgKewarganegaraan = new ButtonGroup();
        bgKewarganegaraan.add(wni);
        bgKewarganegaraan.add(wna);

        JTextField textWna = new JTextField(20);
        textWna.setBounds(275, 520, 180, 20);
        textWna.setVisible(false);
        jframe.add(textWna);

        ItemListener wnaItemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (wna.isSelected()) {
                    textWna.setVisible(true);
                } else {
                    textWna.setVisible(false);
                }
            }
        };
        wna.addItemListener(wnaItemListener);

        // ini berlaku hingga
        JLabel labelBerlakuHingga = new JLabel("Berlaku Hingga");
        labelBerlakuHingga.setBounds(10, 550, 80, 20);
        jframe.add(labelBerlakuHingga);

        berlakuHingga = new JTextField(20);
        berlakuHingga.setBounds(100, 550, 180, 20);
        jframe.add(berlakuHingga);

        // ini kota pembuatan ktp
        JLabel labelKotaPem = new JLabel("Kota pembuatan KTP");
        labelKotaPem.setBounds(10, 575, 80, 20);
        jframe.add(labelKotaPem);

        kotaPembuatanKTP = new JTextField(20);
        kotaPembuatanKTP.setBounds(100, 575, 180, 20);
        jframe.add(kotaPembuatanKTP);

        // ini tanggal pembuatan ktp
        JLabel labelTglPem = new JLabel("Tanggal Pembuatan KTP");
        labelTglPem.setBounds(10, 600, 80, 20);
        jframe.add(labelTglPem);

        UtilDateModel model2 = new UtilDateModel();
        Properties p2 = new Properties();
        JDatePanelImpl datePanel2 = new JDatePanelImpl(model2, p2);
        JDatePickerImpl datePicker2 = new JDatePickerImpl(datePanel2, new DateLabelFormatter());
        datePicker2.setBounds(100, 600, 200, 30);
        jframe.add(datePicker2);

        buttonSubmit = new JButton("SUBMIT");
        buttonSubmit.setBounds(20, 630, 100, 20);
        buttonSubmit.setEnabled(true);
        jframe.add(buttonSubmit);

        // ini foto
        JButton buttonChooseFoto = new JButton("Pilih Foto");
        buttonChooseFoto.setBounds(500, 10, 100, 30);
        jframe.add(buttonChooseFoto);

        // pakai panel untuk menampilkan gambar
        fotoPanel = new JPanel();
        fotoPanel.setBounds(500, 50, 100, 120);
        jframe.add(fotoPanel);

        buttonChooseFoto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chooseFoto();
            }
        });

        // ini ttd
        JButton buttonChooseTtd = new JButton("Pilih TTD");
        buttonChooseTtd.setBounds(500, 600, 100, 30);
        jframe.add(buttonChooseTtd);

        // pakai panel untuk menampilkan gambar
        fotoPanelTTD = new JPanel();
        fotoPanelTTD.setBounds(500, 250, 100, 50);
        jframe.add(fotoPanelTTD);

        buttonChooseTtd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chooseFotoTtd();
            }
        });
        jframe.setVisible(true);

        // action listener nya
        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nikValue = nik.getText();
                String namaValue = nama.getText();
                String tempatLahirValue = tempatLahir.getText();
                Date tanggalLahirValue = (Date) datePicker.getModel().getValue();
                String genderValue = pria.isSelected() ? "Laki-Laki" : "Perempuan";
                String golDarValue = golDarA.isSelected() ? "A"
                : golDarB.isSelected() ? "B" : golDarO.isSelected() ? "O" : "AB";
                String alamatValue = alamat.getText();
                String rtDanRwValue = rtDanRw.getText();
                String kelDesaValue = kelDesa.getText();
                String kecamatanValue = kecamatan.getText();
                String agamaValue = (String) cbAgama.getSelectedItem();
                String statusKawinValue = (String) cbStatusKawin.getSelectedItem();
                String pekerjaanValue = karyawanSwasta.isSelected() ? "Karyawan Swasta"
                : wiraswasta.isSelected() ? "Wiraswasta" : pns.isSelected() ? "Pegawai Negeri Sipil" 
                : akademisi.isSelected() ? "Akademisi" : "Penggangguran";
                String kewarganegaraanValue = wni.isSelected() ? "WNI" : "WNA";
                String wnaDetailValue = " ";
                if (wna.isSelected()) {
                    wnaDetailValue = textWna.isVisible() ? textWna.getText() : "";
                }
                String berlakuHinggaValue = berlakuHingga.getText();
                String kotaPembuatanKTPValue = kotaPembuatanKTP.getText();
                Date tanggalPembuatanKtpValue = (Date) datePicker2.getModel().getValue();

                Penduduk orang = new Penduduk(nikValue, namaValue, tempatLahirValue, tanggalLahirValue, genderValue, golDarValue,
                        alamatValue, rtDanRwValue, kelDesaValue, kecamatanValue, agamaValue,
                        statusKawinValue, pekerjaanValue, kewarganegaraanValue, wnaDetailValue, berlakuHinggaValue,
                        kotaPembuatanKTPValue, tanggalPembuatanKtpValue);
                person.add(orang);
                new HasilKtp(person);
            }
        });
    }

    private void chooseFoto() {
        foto = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Picture Files", "jpg", "jpeg", "png");
        foto.setFileFilter(filter);

        int returnValue = foto.showOpenDialog(jframe); // buat nampilin dialog pemilihan file

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = foto.getSelectedFile();
            if (selectedFile != null) {
                String filePath = selectedFile.getAbsolutePath();
                FotoChooser.setSelectedFotoPath(filePath);
                String fotoPath = FotoChooser.getSelectedFotoPath();
                if (fotoPath != null) {
                    try {
                        BufferedImage img = ImageIO.read(new File(filePath));
                        ImageIcon imageIcon = new ImageIcon(img);
                        JLabel imageLabel = new JLabel(imageIcon);
                        imageLabel.setBounds(0, 0, img.getWidth(), img.getHeight());
                        // ini buat hapus komponen sebelumnya dari fotoPanel
                        fotoPanel.removeAll();
                        fotoPanel.revalidate(); // untuk nge-refresh fotoPanel
                        fotoPanel.repaint(); // untuk nge-repaint fotoPanel
                        fotoPanel.add(imageLabel);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("null");
            }
        }
    }

    private void chooseFotoTtd() {
        ttd = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Picture Files", "jpg", "jpeg", "png");
        ttd.setFileFilter(filter);

        int returnValue = ttd.showOpenDialog(jframe); // buat nampilin dialog pemilihan file

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = ttd.getSelectedFile();
            if (selectedFile != null) {
                String filePath = selectedFile.getAbsolutePath();
                TtdChooser.setSelectedTtdPath(filePath);
                String fotoPath = TtdChooser.getSelectedTtdPath(); 
                if (fotoPath != null) {
                    try {
                        BufferedImage img = ImageIO.read(new File(filePath));
                        ImageIcon imageIcon = new ImageIcon(img);
                        JLabel imageLabel = new JLabel(imageIcon);
                        imageLabel.setBounds(0, 0, img.getWidth(), img.getHeight());
                        // ini buat hapus komponen sebelumnya dari fotoPanel
                        fotoPanelTTD.removeAll();
                        fotoPanelTTD.revalidate(); // untuk nge-refresh fotoPanel
                        fotoPanelTTD.repaint(); // untuk nge-repaint fotoPanel
                        fotoPanelTTD.add(imageLabel);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("null");
            }
        }
    }

    public static void main(String[] args) {
        new ScreenSatu();
    }
}