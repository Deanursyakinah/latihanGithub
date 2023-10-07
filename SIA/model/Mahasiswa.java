package SIA.model;

public abstract class Mahasiswa extends User {
    private String nomorIndukMahasiswa;
    private String jurusan;
    
    public Mahasiswa(String nama, String alamat, String ttl, String telepon, String nim, String jurusan) {
        super(nama, alamat, ttl, telepon);
        this.nomorIndukMahasiswa = nim;
        this.jurusan = jurusan;
    }

    public String getNIM() {
        return nomorIndukMahasiswa;
    }

    public void setNIM(String nim) {
        nomorIndukMahasiswa = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.toString() 
        + "\nNomor Induk Mahasiswa : " + nomorIndukMahasiswa
        + "\nJurusan : " + jurusan;
    }
}
