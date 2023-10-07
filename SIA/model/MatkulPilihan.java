package SIA.model;

public class MatkulPilihan extends Matkul {
    private int jumlahMin;

    public void setJumlahMin(int jumlahMin) {
        this.jumlahMin = jumlahMin;
    }
    
    public MatkulPilihan(String kode, int sks, String nama, int jumlahMin) {
        super(kode, sks, nama);
        this.jumlahMin = jumlahMin;
    }
    
    public int getJumlahMin() {
        return jumlahMin;
    }

    @Override
    public String toString() {
        return super.toString() 
        + " \n Jumlah minimum mahasiswa : " + jumlahMin;
    }
}
