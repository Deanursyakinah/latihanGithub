package PBO.week2;

import java.util.Scanner;

class JenisKamar {
    String kelas;
    int hargaPerhari;

    public JenisKamar() {
        // ini untuk init agar tidak null pointer
    }

    // sekalian isi variabel di dalam kelas
    public JenisKamar(String kelas, int hargaPerhari) {
        this.kelas = kelas;
        this.hargaPerhari = hargaPerhari;
    }
}

class JenisPerawatan {
    String nama;
    int biaya;

    public JenisPerawatan() {

    }

    public JenisPerawatan(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }
}

class Pasien {
    String nama;
    JenisKamar[] rawatInap = new JenisKamar[10]; 
    JenisPerawatan[] perawatan = new JenisPerawatan[5]; 
    boolean pakaiBPJS;

    public Pasien() {
        for (int i = 0; i < rawatInap.length; i++) {
            this.rawatInap[i] = new JenisKamar();
        }

        for (int i = 0; i < perawatan.length; i++) {
            this.perawatan[i] = new JenisPerawatan();
        }
    }
}

public class DeaNursyakinah_1122029_TugasPrakPBOReviewStrukturData {
    public int totBiayaBPJS(Pasien p) {
        int total = 0;
        if (!p.pakaiBPJS) {
            for (int j = 0; j < p.rawatInap.length; j++) {
                total += p.rawatInap[j].hargaPerhari;
            }
        }
        for (int j = 0; j < p.perawatan.length; j++) {
            total += p.perawatan[j].biaya;
        }
        return total;
    }

    public int totPendapatan(Pasien[] patiens) {
        int total = 0;
        for (int i = 0; i < patiens.length; i++) {
            total += totBiayaBPJS(patiens[i]);
        }
        return total;
    }

    public int totalJenisPerawatan(Pasien[] p, String jp) {
        int total = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[i].perawatan.length; j++) {
                if (p[i].perawatan[j].nama.equals(jp)) {
                    total++;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        DeaNursyakinah_1122029_TugasPrakPBOReviewStrukturData mainClass = new DeaNursyakinah_1122029_TugasPrakPBOReviewStrukturData();
        Scanner input = new Scanner(System.in);

        Pasien[] patients = new Pasien[150];

        for (int i = 0; i < patients.length; i++) {
            patients[i] = new Pasien();
            System.out.println("masukkan nama pasien ke-" + (i + 1));
            patients[i].nama = input.next();
            System.out.println("pasien ke-" + (i + 1) + " menggunakan BPJS? (true/false)");
            patients[i].pakaiBPJS = input.nextBoolean();

            input.nextLine();
            for (int j = 0; j < patients[i].rawatInap.length; j++) {
                System.out.println("masukkan kelas kamar pasien ke-" + (i + 1) + " dirawat : " + "hari ke-" + (j + 1));
                patients[i].rawatInap[j].kelas = input.next();
                System.out.println("masukkan harga perhari dari pasien ke-" + (i + 1) + "hari ke-" + (j + 1));
                patients[i].rawatInap[j].hargaPerhari = input.nextInt();
            }

            input.nextLine();
            for (int j = 0; j < patients[i].perawatan.length; j++) {
                System.out.println("masukkan jenis perawatan ke-" + (j + 1) + " dari pasien ke-" + (i + 1) + " = ");
                patients[i].perawatan[j].nama = input.next();

                System.out.print("masukkan biaya jenis perawatan ke-" + (j + 1) + " dari pasien ke-" + (i + 1));
                patients[i].perawatan[j].biaya = input.nextInt();
            }
            int biayaPerPasien = mainClass.totBiayaBPJS(patients[i]);
            System.out.println("Biaya yang harus dibayar oleh pasien ke-" + (i + 1) + ": " + biayaPerPasien);
        }

        System.out.println("total pendapatan rumah sakit adalah: " + mainClass.totPendapatan(patients));
        System.out.println("jenis perawatan apa?");
        String jenisPerawatan = input.next();
        System.out.println("total jenis perawatan : " + mainClass.totalJenisPerawatan(patients, jenisPerawatan));
    }
}
