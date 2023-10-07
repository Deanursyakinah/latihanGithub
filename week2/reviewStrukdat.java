package PBO.week2;
import javax.swing.JOptionPane;

class Pasien {
    String nama;
    JenisKamar[] rawatInap = new JenisKamar[10];
    JenisPerawatan[] perawatan = new JenisPerawatan[5];
    boolean pakaiBPJS;

    public Pasien() {
        for (int i = 0; i < 10; i++) {
            rawatInap[i] = new JenisKamar();
        }
        for (int i = 0; i < 5; i++) {
            perawatan[i] = new JenisPerawatan();
        }
    }
}

class JenisKamar {
    String kelas;
    int hargaPerhari;
}

class JenisPerawatan {
    String nama;
    int biaya;
}

public class reviewStrukdat {
    static Pasien[] patients = new Pasien[150];

    public int totBiayaBPJS(int n) {
        int total = 0;
        if (!patients[n].pakaiBPJS) {
            for (int i = 0; i < 10; i++) {
                total += patients[n].rawatInap[i].hargaPerhari;
            }
            for (int i = 0; i < 5; i++) {
                total += patients[n].perawatan[i].biaya;
            }
        } else {
            for (int i = 0; i < 5; i++) {
                total += patients[n].perawatan[i].biaya;
            }
        }
        return total;
    }

    public int totPendapatan() {
        int total = 0;
        for (int i = 0; i < patients.length; i++) {
            for (int j = 0; j < 10; j++) {
                total += patients[i].rawatInap[j].hargaPerhari;
            }
            for (int k = 0; k < 5; k++) {
                total += patients[i].perawatan[k].biaya;
            }
        }
        return total;
    }

    public int jumlahPasPerTertentu(String jp1, String jp2, String jp3, String jp4) {
        int jumlah = 0;
        for (int i = 0; i < patients.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (patients[i].perawatan[j].nama.equals(jp1)) {
                    jumlah++;
                } else if (patients[i].perawatan[j].nama.equals(jp2)) {
                    jumlah++;
                } else if (patients[i].perawatan[j].nama.equals(jp3)) {
                    jumlah++;
                } else if (patients[i].perawatan[j].nama.equals(jp4)) {
                    jumlah++;
                }
            }
        }
        return jumlah;
    }

    public static void main(String[] args) {
        int totalPasien = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pasien:"));

        for (int i = 0; i < totalPasien; i++) {
            patients[i] = new Pasien();

            patients[i].nama = JOptionPane.showInputDialog("Masukkan nama pasien ke-" + (i + 1) + ":");
            String bpjsInput = JOptionPane.showInputDialog("Apakah pasien ke-" + (i + 1) + " menggunakan BPJS? (true/false):");
            patients[i].pakaiBPJS = Boolean.parseBoolean(bpjsInput);

            for (int j = 0; j < 10; j++) {
                patients[i].rawatInap[j].kelas = JOptionPane.showInputDialog("Kelas kamar rawat inap ke-" + (j + 1) + ":");
                String hargaInput = JOptionPane.showInputDialog("Harga per hari kamar rawat inap ke-" + (j + 1) + ":");
                patients[i].rawatInap[j].hargaPerhari = Integer.parseInt(hargaInput);
            }

            for (int j = 0; j < 5; j++) {
                patients[i].perawatan[j].nama = JOptionPane.showInputDialog("Jenis perawatan ke-" + (j + 1) + ":");
                String biayaInput = JOptionPane.showInputDialog("Biaya jenis perawatan ke-" + (j + 1) + ":");
                patients[i].perawatan[j].biaya = Integer.parseInt(biayaInput);
            }
        }

        // Misalnya, Anda bisa memanggil function untuk menghitung total pendapatan di sini.
        int totalPendapatan = new reviewStrukdat().totPendapatan(); // ini karena kelasnya tadi ga static 
        JOptionPane.showMessageDialog(null, "Total pendapatan Rumah Sakit adalah: " + totalPendapatan);
    }
}
