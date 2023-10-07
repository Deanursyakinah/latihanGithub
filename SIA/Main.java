package SIA;
import java.util.ArrayList;
import SIA.model.*;
import SIA.view.MainMenu;

public class Main {
    public static void dataDummy(ArrayList<User> listUser) {
        Matkul algo = new Matkul("IF104", 4, "Algoritme dan pemrograman");
        Matkul teoriPer = new Matkul( "A-206", 3, "Teori perumahan dan permukiman");
        MatkulPilihan gamedev = new MatkulPilihan("IF-505", 3, "game developer", 10);
        
        // dummy buat presensi matkul yang diambil (untuk mahasiswa sarjana dan magister)
        ArrayList<Presensi> presensi1 = new ArrayList<>(); // arraylist ini berisi presensi 2 pertemuan 1 matkul
        Presensi presensiPertemuan1 = new Presensi(1, Status.HADIR); 
        Presensi presensiPertemuan2 = new Presensi(3, Status.TIDAK_HADIR);
        presensi1.add(presensiPertemuan1);
        presensi1.add(presensiPertemuan2);
    
        ArrayList<Presensi> presensi2 = new ArrayList<>(); // ini berisi presensi 1 pertemuan 1 matkul 
        Presensi presensiPertemuan3 = new Presensi(4, Status.HADIR);
        presensi2.add(presensiPertemuan3);
    
        //dummy buat matkul ambil (untuk mahasiswa sarjana dan magister)
        ArrayList<MatkulAmbil> listMatkulAmbilSarjana = new ArrayList<>(); //ini sarjana ngambil 2 matkul misalnya
        MatkulAmbil matkulS1 = new MatkulAmbil(algo, presensi1, 100, 100, 100);
        MatkulAmbil matkulS2 = new MatkulAmbil(gamedev, presensi2, 100, 100, 100);
        listMatkulAmbilSarjana.add(matkulS1);  
        listMatkulAmbilSarjana.add(matkulS2); 
        
        ArrayList<MatkulAmbil> listMatkulAmbilMagister = new ArrayList<>(); //magister ngambil 1 matkul
        MatkulAmbil matkulM1 = new MatkulAmbil(teoriPer, presensi2, 100, 100, 100);
        listMatkulAmbilMagister.add(matkulM1);
        
        //dummy data mahasiswa sarjana, magister, dan doktor
        Sarjana sarjana = new Sarjana("Dea", "Bandung", "Samarinda, 01 Agustus 2004", "088374398274", "1122029", "teknik informatika", listMatkulAmbilSarjana);
        listUser.add(sarjana);
    
        Magister magister = new Magister("Daia", "Bandung", "Bandung, 02 Juni 2000", "08343432", "1122030", "aristektur", "cara membuat rumah", listMatkulAmbilMagister);
        listUser.add(magister);
    
        Doktor doktor = new Doktor("Doy", "Korea", "Korea, 1 Feb 1996", "087656557", "1178902", "Desain Komunikasi Visual", "Integrasi model 3D", 100, 100, 100);
        listUser.add(doktor);
    
        // dummy buat presensi staff (dosen dan karyawan)
        ArrayList<PresensiStaff> presensiSt1 = new ArrayList<>(); //arraylist ini berisi presensi 1 staff di dua pertemuan
        PresensiStaff presensiS1 = new PresensiStaff(1, Status.HADIR, 15);
        PresensiStaff presensiS2 = new PresensiStaff(1, Status.TIDAK_HADIR, 15);
        presensiSt1.add(presensiS1);
        presensiSt1.add(presensiS2);
        
        ArrayList<PresensiStaff> presensiSt2 = new ArrayList<>(); //ini berisi presensi 1 staff di satu pertemuan
        PresensiStaff presensiS3 = new PresensiStaff(2, Status.HADIR, 11);
        presensiSt2.add(presensiS3);
        
        //dummy buat matkul ajar (dosen)
        ArrayList<MatkulAjar> listMatkulAjar1 = new ArrayList<>(); 
        MatkulAjar matkulAjar = new MatkulAjar(presensiSt1, algo);
        MatkulAjar matkulAjar2 = new MatkulAjar(presensiSt2, gamedev);
        listMatkulAjar1.add(matkulAjar);
        listMatkulAjar1.add(matkulAjar2);
    
        ArrayList<MatkulAjar> listMatkulAjar2 = new ArrayList<>(); 
        MatkulAjar matkulAjar3 = new MatkulAjar(presensiSt2, teoriPer);
        listMatkulAjar2.add(matkulAjar3);
    
        //dummy data dosen 
        DosenTetap dosenTetap = new DosenTetap("Jonathan", "Bojongsoang", "Bandung 30 Desember 1980", "083434324", "642422124324", "Informatika", listMatkulAjar2, 10000000);
        listUser.add(dosenTetap);
    
        DosenHonorer dosenHonorer = new DosenHonorer("Cantika", "Yogyakarta", "Yogyakarta, 02 Januari 1995", "08342543424", "6404283184784", null, listMatkulAjar1, 300000);
        listUser.add(dosenHonorer);
    
        Karyawan karyawan = new Karyawan("Budi", "Jakarta", "Jakarta, 06 Mei 1990", "08732927432", "648984848203", 500000, presensiSt2);
        listUser.add(karyawan);
    }

    public static void main(String[] args) {
       MainMenu.iniInputMenu();
    }
}
