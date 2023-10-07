package SIA.model;

public class Matkul {
    private String kode;
    private int satuanKreditSemester;
    private String nama;

    public Matkul(String kode, int sks, String nama) {
        this.kode = kode;
        this.satuanKreditSemester = sks;
        this.nama = nama;
    }
   
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getSKS() {
        return satuanKreditSemester;
    }

    public void setSKS(int sks) {
        satuanKreditSemester = sks;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "\nKode matkul : " + kode
        + " \nSKS : " + satuanKreditSemester
        + " \nNama matkul : " + nama;
    }
}
