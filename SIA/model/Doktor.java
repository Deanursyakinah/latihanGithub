package SIA.model;

public class Doktor extends Mahasiswa {
    private String judulPeneliatanDisertasi;
    private int nilaiSidang1;
    private int nilaiSidang2;
    private int nilaiSidang3;

    public Doktor(String nama, String alamat, String ttL, String telepon, String nim, String jurusan, String judulPeneliatanDisertasi, int nilaiSidang1, int nilaiSidang2, int nilaiSidang3) {
        super(nama, alamat, ttL, telepon, nim, jurusan);
        this.judulPeneliatanDisertasi = judulPeneliatanDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    public String getJudulPeneliatanDisertasi() {
        return judulPeneliatanDisertasi;
    }

    public void setJudulPeneliatanDisertasi(String judulPeneliatanDisertasi) {
        this.judulPeneliatanDisertasi = judulPeneliatanDisertasi;
    }

    public int getNilaiSidang1() {
        return nilaiSidang1;
    }

    public void setNilaiSidang1(int nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public int getNilaiSidang2() {
        return nilaiSidang2;
    }

    public void setNilaiSidang2(int nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public int getNilaiSidang3() {
        return nilaiSidang3;
    }

    public void setNilaiSidang3(int nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }

     @Override
    public String toString() {
        return super.toString() 
        + "\nJudul penelitian disertasi : " + judulPeneliatanDisertasi
        + "\nNilai sidang 1 : " + nilaiSidang1
        + "\nNilai sidang 2 : " + nilaiSidang2
        + "\nNilai sidang 3 : " + nilaiSidang3;
    }
}
