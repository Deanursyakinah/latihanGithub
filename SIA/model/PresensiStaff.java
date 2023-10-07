package SIA.model;

public class PresensiStaff extends Presensi {
    private int jam;

     public PresensiStaff(int tanggal, Status status, int jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    @Override
    public String toString() {
        return super.toString() 
        + " \n Jam : " + jam;
    }

    public int getJam() {
        return jam;
    }



    public void setJam(int jam) {
        this.jam = jam;
    }
}
