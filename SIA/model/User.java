package SIA.model;

public abstract class User {
    private String nama;
    private String alamat;
    private String tempatTanggalLahir;
    private String telepon;
    
    public User(String nama, String alamat, String ttl, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatTanggalLahir = ttl;
        this.telepon = telepon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTTL() {
        return tempatTanggalLahir;
    }

    public void setTTL(String ttl) {
        tempatTanggalLahir = ttl;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String toString() {
        return "Nama : " + nama 
        + " \nAlamat : " + alamat
        + " \nTempat tanggal lahir : " + tempatTanggalLahir
        + " \ntelepon : " + telepon;
    }
}
