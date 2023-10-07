package SIA.model;

public abstract class Staff extends User {
    private String nomorIndukKependudukan;

    public Staff(String nama, String alamat, String ttl, String telepon, String nik) {
        super(nama, alamat, ttl, telepon);
        this.nomorIndukKependudukan = nik;
    }

    public String getNomorIndukKependudukan() {
        return nomorIndukKependudukan;
    }

    public void setNomorIndukKependudukan(String nomorIndukKependudukan) {
        this.nomorIndukKependudukan = nomorIndukKependudukan;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nNIK : " + nomorIndukKependudukan;
    }
}
