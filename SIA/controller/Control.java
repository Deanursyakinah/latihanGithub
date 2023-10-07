package SIA.controller;
import java.util.ArrayList;
import SIA.model.*;

public class Control {
    public static String userData(String inputNama, ArrayList<User> listUser) {
        String hasil = " ";
        for (int i = 0; i < listUser.size(); i++) {
            User sia = listUser.get(i);
            if (sia.getNama().equalsIgnoreCase(inputNama)) {
                if (sia instanceof Sarjana) {
                    Sarjana sarjana = (Sarjana) sia;
                    hasil = "Status : Mahasiswa Sarjana" + sarjana.toString();
                } else if (sia instanceof Magister) {
                    Magister magister = (Magister) sia;
                    hasil = "Status : Mahasiswa Magister" + magister.toString();
                } else if (sia instanceof Doktor) {
                    Doktor doktor = (Doktor) sia;
                    hasil = "Status : Mahasiswa Magister" + doktor.toString();
                } else if (sia instanceof DosenTetap) {
                    DosenTetap dosenTetap = (DosenTetap) sia;
                    hasil = "Status : Mahasiswa Magister" + dosenTetap.toString();
                } else if (sia instanceof DosenHonorer) {
                    DosenHonorer dosenHonorer = (DosenHonorer) sia;
                    hasil = "Status : Mahasiswa Magister" + dosenHonorer.toString();
                } else if (sia instanceof Karyawan) {
                    Karyawan karyawan = (Karyawan) sia;
                    hasil = "Status : Mahasiswa Magister" + karyawan.toString();
                }
            }
        }
        return hasil;
    }

    //nomor 2
    public static double printNA(String nim, String kodeMK, ArrayList<User> listUser) {
        double nilaiAkhir = 0;

        for (int i = 0; i < listUser.size(); i++) {
            User sia = listUser.get(i);
            if(sia instanceof Sarjana) {
                Sarjana sarjana = (Sarjana) sia;
                if (nim.equals(sarjana.getNIM())) {
                    for (int j = 0; j < sarjana.getListMatkulAmbil().size(); j++) {
                        if (kodeMK.equals(sarjana.getListMatkulAmbil().get(j).getMataKuliah().getKode())) {
                             nilaiAkhir = (sarjana.getListMatkulAmbil().get(j).getN1() + sarjana.getListMatkulAmbil().get(j).getN2() + sarjana.getListMatkulAmbil().get(j).getN3()) / 3;
                        }
                    }
                }
            } else if (sia instanceof Magister) {
                Magister magister = (Magister) sia;
                if (nim.equals(magister.getNIM())) {
                    for (int j = 0; j < magister.getListMatkulDiambil().size(); j++) {
                        if (kodeMK.equals(magister.getListMatkulDiambil().get(j).getMataKuliah().getKode())) {
                            nilaiAkhir = (magister.getListMatkulDiambil().get(j).getN1() + magister.getListMatkulDiambil().get(j).getN2() + magister.getListMatkulDiambil().get(j).getN3()) / 3;
                        }
                    }
                }
            } else if (sia instanceof Doktor) {
                Doktor doktor = (Doktor) sia;
                if (nim.equals(doktor.getNIM())) {
                    nilaiAkhir = (doktor.getNilaiSidang1() + doktor.getNilaiSidang2() + doktor.getNilaiSidang3()) / 3;
                }
            }
           
        }
        return nilaiAkhir;
    }

    //nomor 3 
    public static double printRataRataAllMhs(String kodeMK, ArrayList<User> listUser) {
        double totalNilai = 0;
        double jumlahMahasiswa = 0;
    
        for (int i = 0; i < listUser.size(); i++) {
            User sia = listUser.get(i);
            if (sia instanceof Sarjana) {
                Sarjana sarjana = (Sarjana) sia;
                for (int j = 0; j < sarjana.getListMatkulAmbil().size(); j++) {
                    if (kodeMK.equals(sarjana.getListMatkulAmbil().get(j).getMataKuliah().getKode())) {
                        double nilaiAkhir = (sarjana.getListMatkulAmbil().get(j).getN1() + sarjana.getListMatkulAmbil().get(j).getN2() + sarjana.getListMatkulAmbil().get(j).getN3()) / 3;
                        totalNilai += nilaiAkhir;
                        jumlahMahasiswa++;
                    }
                }
            } else if (sia instanceof Magister) {
                Magister magister = (Magister) sia;
                for (int j = 0; j < magister.getListMatkulDiambil().size(); j++) {
                    if (kodeMK.equals(magister.getListMatkulDiambil().get(j).getMataKuliah().getKode())) {
                        double nilaiAkhir = (magister.getListMatkulDiambil().get(j).getN1() + magister.getListMatkulDiambil().get(j).getN2() + magister.getListMatkulDiambil().get(j).getN3()) / 3;
                        totalNilai += nilaiAkhir;
                        jumlahMahasiswa++;
                    }
                }
            } 
        }
        
        if (jumlahMahasiswa > 0) {
            double rataRata = totalNilai / jumlahMahasiswa;
            return rataRata;
        } else {
            return 0.0; 
        }
    }
    

    //nomor 4
    public static double mhsYangTidakLulus(String kodeMK, ArrayList<User> listUser) {
        double jumlahMahasiswa = 0;
    
        for (int i = 0; i < listUser.size(); i++) {
            User sia = listUser.get(i);
            if (sia instanceof Sarjana) {
                Sarjana sarjana = (Sarjana) sia;
                for (int j = 0; j < sarjana.getListMatkulAmbil().size(); j++) {
                    if (kodeMK.equals(sarjana.getListMatkulAmbil().get(j).getMataKuliah().getKode())) {
                        double nilaiAkhir = (sarjana.getListMatkulAmbil().get(j).getN1() + sarjana.getListMatkulAmbil().get(j).getN2() + sarjana.getListMatkulAmbil().get(j).getN3()) / 3;
                        if (nilaiAkhir < 56) {
                            jumlahMahasiswa++;
                        }
                    }
                }
            } else if (sia instanceof Magister) {
                Magister magister = (Magister) sia;
                for (int j = 0; j < magister.getListMatkulDiambil().size(); j++) {
                    if (kodeMK.equals(magister.getListMatkulDiambil().get(j).getMataKuliah().getKode())) {
                        double nilaiAkhir = (magister.getListMatkulDiambil().get(j).getN1() + magister.getListMatkulDiambil().get(j).getN2() + magister.getListMatkulDiambil().get(j).getN3()) / 3;
                        if (nilaiAkhir < 56) {
                            jumlahMahasiswa++;
                        }
                    }
                }
            }  
        }
        return jumlahMahasiswa;
    }

    //nomor 5
    public static String mkAmbilApaAja(String nim, ArrayList<User> listUser) {
        String hasil = " ";
        int totalPresensi = 0;
        
        for (int i = 0; i < listUser.size(); i++) { 
            User sia = listUser.get(i);
            if (sia instanceof Sarjana) {
                Sarjana sarjana = (Sarjana) sia;
                if (nim.equals(sarjana.getNIM())) {
                    for (int j = 0; j < sarjana.getListMatkulAmbil().size(); j++) {
                        MatkulAmbil matkulAmbil = sarjana.getListMatkulAmbil().get(j);
                        hasil += matkulAmbil.getMataKuliah().getNama();
                        
                        for (int k = 0; k < matkulAmbil.getListPresensi().size(); k++) {
                            if (matkulAmbil.getListPresensi().get(k).getStatus() == Status.HADIR) {
                            totalPresensi++;
                        }
                    }
                    }
                }
            }
            if (sia instanceof Magister) {
                Magister magister = (Magister) sia;
                if (nim.equals(magister.getNIM())) {
                    for (int j = 0; j < magister.getListMatkulDiambil().size(); j++) {
                        MatkulAmbil matkulAmbil = magister.getListMatkulDiambil().get(j);
                        hasil += matkulAmbil.getMataKuliah().getNama();
                        
                        for (int k = 0; k < matkulAmbil.getListPresensi().size(); k++) {
                            if (matkulAmbil.getListPresensi().get(k).getStatus() == Status.HADIR) {
                            totalPresensi++;
                        }
                    }
                    }
                }
            }
        }
        return hasil;
    }

    //nomor 6
    public static double dosenNgajar (String nik, ArrayList<User> listUser) {
        double totalJam = 0;

        for (int i = 0; i < listUser.size(); i++) { 
            User sia = listUser.get(i);
            if (sia instanceof Staff) {
                Staff staff = (Staff) sia;
                if (nik.equals(staff.getNomorIndukKependudukan())) {
                    if (staff instanceof DosenTetap) {
                        DosenTetap dosenTetap = (DosenTetap) staff;
                        for (int j = 0; j < dosenTetap.getListMatkulDiajar().size(); j++) {
                            for (int k = 0; k < dosenTetap.getListMatkulDiajar().get(j).getListPresensiStaff().size(); k++) {
                                if (dosenTetap.getListMatkulDiajar().get(j).getListPresensiStaff().get(k).getStatus() == Status.HADIR) {
                                    totalJam += dosenTetap.getListMatkulDiajar().get(j).getListPresensiStaff().get(k).getJam();
                                }
                            }
                        }
                    } else if (staff instanceof DosenHonorer) {
                        DosenHonorer dosenHonorer = (DosenHonorer) staff;
                        for (int j = 0; j < dosenHonorer.getListMatkulDiajar().size(); j++) {
                            for (int k = 0; k < dosenHonorer.getListMatkulDiajar().get(j).getListPresensiStaff().size(); k++) {
                                if (dosenHonorer.getListMatkulDiajar().get(j).getListPresensiStaff().get(k).getStatus() == Status.HADIR) {
                                    totalJam += dosenHonorer.getListMatkulDiajar().get(j).getListPresensiStaff().get(j).getJam();
                                }
                            }
                        }
                    }
                }
            }
        }
        return totalJam;
    }

    //nomor 7
    public static double totalGajiStaff (ArrayList<User> listUser) {
        double gaji = 0;
        double unit = 0;
        String nik = " ";
        unit = dosenNgajar(nik, listUser);

        for (int i = 0; i < listUser.size(); i++) {
            User sia = listUser.get(i);
            if (sia instanceof Staff) {
                Staff staff = (Staff) sia;
                if (staff instanceof Karyawan) {
                    Karyawan karyawan = (Karyawan) staff;
                    for (int j = 0; j < karyawan.getListPresensiStaff().size(); j++) {
                        PresensiStaff presensiStaff = karyawan.getListPresensiStaff().get(j);
                        if (presensiStaff.getStatus() == Status.HADIR) {
                            unit++;
                        }
                    }
                    gaji = (double) unit * karyawan.getSalary() / 22.0;
                } else if (staff instanceof DosenTetap) {
                        DosenTetap dosenTetap = (DosenTetap) staff;
                        gaji = dosenTetap.getSalary() + (unit * 25000);
                } else if (staff instanceof DosenHonorer) {
                        DosenHonorer dosenHonorer = (DosenHonorer) staff;
                        gaji = dosenHonorer.getHonorPerSKS() * unit;
                }
            }
        }
        return gaji;
    }
}