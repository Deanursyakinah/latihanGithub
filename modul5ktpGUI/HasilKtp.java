import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.text.SimpleDateFormat;

public class HasilKtp {
    JFrame jframe;
    JPanel fotoPanel;
    JPanel ttdPanel;
    JLabel pict;
    
    public HasilKtp(ArrayList<Penduduk> penduduk) {
        jframe = new JFrame();
        jframe.setTitle("Output KTP");
        Font fontHeader = new Font("Helvetica", Font.BOLD, 16);
        Font child = new Font("Helvetica", Font.BOLD, 11);

        jframe.setSize(500, 300);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLayout(null);

        jframe.getContentPane().setBackground(new Color(94, 171, 219));

        JLabel title = new JLabel("Republik Harapan Bangsa");
        title.setBounds(150, 10, 200, 20);
        title.setFont(fontHeader);
        jframe.add(title);

        //ini nik 
        JLabel nikValue = new JLabel(" NIK : " + penduduk.get(0).getNik().toUpperCase());
        nikValue.setBounds(5, 30, 150, 20);
        nikValue.setFont(fontHeader);
        jframe.add(nikValue);

        //ini nama
        JLabel nama = new JLabel("Nama");
        nama.setBounds(10, 50, 100, 20);
        nama.setFont(child);
        jframe.add(nama);

        JLabel titikDua = new JLabel(":");
        titikDua.setBounds(110, 50, 50, 20);
        titikDua.setFont(child);
        jframe.add(titikDua);

        JLabel namaValue = new JLabel(penduduk.get(0).getNama().toUpperCase());
        namaValue.setBounds(120, 50, 180, 20); 
        namaValue.setFont(child);
        jframe.add(namaValue);

        //ini tempat lahir dan tanggal lahir
        JLabel tempatLahir = new JLabel("Tempat/Tgl Lahir");
        tempatLahir.setBounds(10, 65, 100, 20);
        tempatLahir.setFont(child);
        jframe.add(tempatLahir);

        JLabel titikDua2 = new JLabel(":");
        titikDua2.setBounds(110, 65, 50, 20);
        titikDua2.setFont(child);
        jframe.add(titikDua2);

        JLabel tempatLahirValue = new JLabel(penduduk.get(0).getTempatLahir().toUpperCase() + ",");
        tempatLahirValue.setBounds(120, 65, 180, 20); 
        tempatLahirValue.setFont(child);
        jframe.add(tempatLahirValue);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String tanggalLahirStr = dateFormat.format(penduduk.get(0).getTanggalLahir());

        JLabel tanggalLahirValue = new JLabel(tanggalLahirStr);
        tanggalLahirValue.setBounds(200, 65, 180, 20); 
        tanggalLahirValue.setFont(child);
        jframe.add(tanggalLahirValue);

        //ini jenis kelamin
        JLabel jk = new JLabel("Jenis Kelamin");
        jk.setBounds(10, 80, 100, 20);
        jk.setFont(child);
        jframe.add(jk);

        JLabel titikDua3 = new JLabel(":");
        titikDua3.setBounds(110, 80, 50, 20);
        titikDua3.setFont(child);
        jframe.add(titikDua3);

        JLabel jkValue = new JLabel(penduduk.get(0).getJenisKelamin().toUpperCase());
        jkValue.setBounds(120, 80, 180, 20); 
        jkValue.setFont(child);
        jframe.add(jkValue);
        
        //ini golongan darah
        JLabel golDar = new JLabel("Gol.Darah : " + penduduk.get(0).getGolonganDarah().toUpperCase());
        golDar.setBounds(200, 80, 100, 20);
        golDar.setFont(child);
        jframe.add(golDar);

        //ini alamat
        JLabel alamat = new JLabel("Alamat");
        alamat.setBounds(10, 95, 100, 20);
        alamat.setFont(child);
        jframe.add(alamat);

        JLabel titikDua4 = new JLabel(":");
        titikDua4.setBounds(110, 95, 50, 20);
        titikDua4.setFont(child);
        jframe.add(titikDua4);
        
        JLabel alamatValue = new JLabel(penduduk.get(0).getAlamat().toUpperCase());
        alamatValue.setBounds(120, 95, 100, 20);
        alamatValue.setFont(child);
        jframe.add(alamatValue);

        //ini RT/RW
        JLabel rtOrRw = new JLabel("RT/RW"); 
        rtOrRw.setBounds(30, 110, 100, 20); 
        rtOrRw.setFont(child);
        jframe.add(rtOrRw);

        JLabel titikDua5 = new JLabel(":");
        titikDua5.setBounds(110, 110, 50, 20);
        titikDua5.setFont(child);
        jframe.add(titikDua5);

        JLabel rtOrRwValue = new JLabel(penduduk.get(0).getRtDanRw().toUpperCase());
        rtOrRwValue.setBounds(120, 110, 100, 20);
        rtOrRwValue.setFont(child);
        jframe.add(rtOrRwValue);

        //ini kelurahan or desa
        JLabel kelOrDesa = new JLabel("Kel/Desa");
        kelOrDesa.setBounds(30, 125, 100, 20);
        kelOrDesa.setFont(child);
        jframe.add(kelOrDesa);

        JLabel titikDua6 = new JLabel(":");
        titikDua6.setBounds(110, 125, 50, 20);
        titikDua6.setFont(child);
        jframe.add(titikDua6);

        JLabel kelOrDesaValue = new JLabel(penduduk.get(0).getKelDesa().toUpperCase());
        kelOrDesaValue.setBounds(120, 125, 100, 20);
        kelOrDesaValue.setFont(child);
        jframe.add(kelOrDesaValue);

        //ini kecamatan
        JLabel kecamatan = new JLabel("Kecamatan");
        kecamatan.setBounds(30, 140, 100, 20);
        kecamatan.setFont(child);
        jframe.add(kecamatan);

        JLabel titikDua7 = new JLabel(":");
        titikDua7.setBounds(110, 140, 50, 20);
        titikDua7.setFont(child);
        jframe.add(titikDua7);

        JLabel kecamaatanValue = new JLabel(penduduk.get(0).getKecamatan().toUpperCase());
        kecamaatanValue.setBounds(120, 140, 100, 20);
        kecamaatanValue.setFont(child);
        jframe.add(kecamaatanValue);

        //ini agama
        JLabel agama = new JLabel("Agama");
        agama.setBounds(10, 155, 100, 20);
        agama.setFont(child);
        jframe.add(agama);

        JLabel titikDua8 = new JLabel(":");
        titikDua8.setBounds(110, 155, 50, 20);
        titikDua8.setFont(child);
        jframe.add(titikDua8);

        JLabel agamaValue = new JLabel(penduduk.get(0).getAgama().toUpperCase());
        agamaValue.setBounds(120, 155, 100, 20);
        agamaValue.setFont(child);
        jframe.add(agamaValue);

        //ini status perkawinan
        JLabel statusKawin = new JLabel("Status Perkawinan");
        statusKawin.setBounds(10, 170, 110, 20);
        statusKawin.setFont(child);
        jframe.add(statusKawin);

        JLabel titikDua9 = new JLabel(":");
        titikDua9.setBounds(110, 170, 50, 20);
        titikDua9.setFont(child);
        jframe.add(titikDua9);

        JLabel statusKawinValue = new JLabel(penduduk.get(0).getStatusKawin().toUpperCase());
        statusKawinValue.setBounds(120, 170, 100, 20);
        statusKawinValue.setFont(child);
        jframe.add(statusKawinValue);

        //ini pekerjaan
        JLabel pekerjaan = new JLabel("Pekerjaan");
        pekerjaan.setBounds(10, 185, 100, 20);
        pekerjaan.setFont(child);
        jframe.add(pekerjaan);

        JLabel titikDua10 = new JLabel(":");
        titikDua10.setBounds(110, 185, 50, 20);
        titikDua10.setFont(child);
        jframe.add(titikDua10);

        JLabel pekerjaanValue = new JLabel(penduduk.get(0).getPekerjaan().toUpperCase());
        pekerjaanValue.setBounds(120, 185, 100, 20);
        pekerjaanValue.setFont(child);
        jframe.add(pekerjaanValue);

        //ini kewarganegaraan 
        JLabel kewarganegaraan = new JLabel("Kewarganegaraan");
        kewarganegaraan.setBounds(10, 200, 100, 20);
        kewarganegaraan.setFont(child);
        jframe.add(kewarganegaraan);

        JLabel titikDua11 = new JLabel(":");
        titikDua11.setBounds(110, 200, 50, 20);
        titikDua11.setFont(child);
        jframe.add(titikDua11);

        JLabel kewarganegaraanValue = new JLabel(penduduk.get(0).getWni().toUpperCase());
        kewarganegaraanValue.setBounds(120, 200, 100, 20);
        kewarganegaraanValue.setFont(child);
        jframe.add(kewarganegaraanValue);

        JLabel wnaValue = new JLabel(penduduk.get(0).getWna().toUpperCase());
        wnaValue.setBounds(120, 200, 100, 20);
        wnaValue.setFont(child);
        jframe.add(wnaValue);

        //ini berlaku hingga
        JLabel berlakuHingga = new JLabel("Berlaku Hingga");
        berlakuHingga.setBounds(10, 215, 100, 20);
        berlakuHingga.setFont(child);
        jframe.add(berlakuHingga);

        JLabel titikDua12 = new JLabel(":");
        titikDua12.setBounds(110, 215, 50, 20);
        titikDua12.setFont(child);
        jframe.add(titikDua12);

        JLabel berlakuHinggaValue = new JLabel(penduduk.get(0).getBerlakuHingga().toUpperCase());
        berlakuHinggaValue.setBounds(120, 215, 100, 20);
        berlakuHinggaValue.setFont(child);
        jframe.add(berlakuHinggaValue);

        //ini foto pakai panel untuk menampilkan gambar
        fotoPanel = new JPanel();
        fotoPanel.setBounds(130, 30, 500, 100);
        fotoPanel.setBackground(new Color(94, 171, 219));
        jframe.add(fotoPanel);

        //ini kota pembuatan ktp
        JLabel kotaPembuatanValue = new JLabel(penduduk.get(0).getKotaPembuatanKTP().toUpperCase());
        kotaPembuatanValue.setBounds(355, 130, 100, 20);
        kotaPembuatanValue.setFont(child);
        jframe.add(kotaPembuatanValue);

        //ini tanggal pembuatan ktp
        SimpleDateFormat formatdate = new SimpleDateFormat("dd-MM-yyyy"); 
        String tanggalPembuatan = formatdate.format(penduduk.get(0).getTanggalPembuatanKTP());

        JLabel tanggalPembuatanValue = new JLabel(tanggalPembuatan);
        tanggalPembuatanValue.setBounds(350, 145, 180, 20); 
        tanggalPembuatanValue.setFont(child);
        jframe.add(tanggalPembuatanValue);

        //ini ttd
        ttdPanel = new JPanel();
        ttdPanel.setBounds(330, 180, 100, 50);
        ttdPanel.setBackground(new Color(94, 171, 219));
        jframe.add(ttdPanel);

        jframe.setVisible(true);
        viewPict();
        viewPict2();
    }

    private void viewPict() {
        String selectedFotoPath = FotoChooser.getSelectedFotoPath();
        if (selectedFotoPath != null) {
            try {
                BufferedImage img = ImageIO.read(new File(selectedFotoPath));
                ImageIcon imageIcon = new ImageIcon(img);
                JLabel imageLabel = new JLabel(imageIcon);
                imageLabel.setBounds(0, 0, img.getWidth(), img.getHeight());
                //hapus komponen sebelumnya dari fotoPanel
                fotoPanel.removeAll();
                fotoPanel.revalidate();
                fotoPanel.repaint();
                fotoPanel.add(imageLabel);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void viewPict2() {
        String selectedTtdPath = TtdChooser.getSelectedTtdPath();
        if (selectedTtdPath != null) {
            try {
                BufferedImage img = ImageIO.read(new File(selectedTtdPath));
                ImageIcon imageIcon = new ImageIcon(img);
                JLabel imageLabel = new JLabel(imageIcon);
                imageLabel.setBounds(0, 0, img.getWidth(), img.getHeight());
                //hapus komponen sebelumnya dari fotoPanel
                ttdPanel.removeAll();
                ttdPanel.revalidate();
                ttdPanel.repaint();
                ttdPanel.add(imageLabel);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
