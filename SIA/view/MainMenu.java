package SIA.view;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import SIA.model.User;
import SIA.Main;
import SIA.controller.Control;

public class MainMenu {
    public static void iniInputMenu () {
        ArrayList<User> listUser = new ArrayList<User>();
        Main.dataDummy(listUser);
        
        int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose Menu : \n 1. Print data user"
        +"\n"+" 2. Print nilai akhir (NA)"
        +"\n"+" 3. Print rata-rata nilai akhir (NR)"
        +"\n"+" 4. Print banyak mahasiswa yang tidak lulus"
        +"\n"+" 5. Print matkul ambil"
        +"\n"+" 6. Print total jam seorang dosen mengajar"
        +"\n"+" 7. Print gaji seorang staff"
        +"\n"+" 8. Exit"));
    
        while(input != 0) {          
            if (input == 1) {
                String nama = JOptionPane.showInputDialog(null, "input nama bang");
                String hasil = Control.userData(nama, listUser);
                JOptionPane.showMessageDialog(null, hasil);
            } else if (input == 2) {
                String inputNim = JOptionPane.showInputDialog(null, "input nim bang");
                String inputKodeMK = JOptionPane.showInputDialog(null, "input kode matkul bang");
                Double hasil = Control.printNA(inputNim, inputKodeMK, listUser);
                JOptionPane.showMessageDialog(null, hasil);
            } else if (input == 3) {
                String kodeMK = JOptionPane.showInputDialog("input kode matkul :");
                Double rataNilaiAkhir = Control.printRataRataAllMhs(kodeMK, listUser);
                JOptionPane.showMessageDialog(null, rataNilaiAkhir);
            } else if (input == 4) {
                String kodeMK = JOptionPane.showInputDialog("Masukkan Kode Matakuliah :");
                Double banyakMhsTidakLulus = Control.mhsYangTidakLulus(kodeMK, listUser);
                JOptionPane.showMessageDialog(null, banyakMhsTidakLulus + " dari ");
            } else if (input == 5) {
                String NIM = JOptionPane.showInputDialog("Masukkan NIM :");
                String hasil = Control.mkAmbilApaAja(NIM, listUser);
                JOptionPane.showMessageDialog(null, hasil);
            } else if (input == 6) {
                String NIK = JOptionPane.showInputDialog("Masukkan NIK:");
                double totalJam = Control.dosenNgajar(NIK, listUser);
                JOptionPane.showMessageDialog(null, totalJam);
            } else if (input == 7) {
                double gaji = Control.totalGajiStaff(listUser);
                JOptionPane.showMessageDialog(null, gaji);
            } else {
                JOptionPane.showMessageDialog(null, "Makasih yah", "Makasih bang", JOptionPane.INFORMATION_MESSAGE);      
                break;             
            }
        }
    }
}
