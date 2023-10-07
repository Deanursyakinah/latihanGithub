package SIA.model;
import java.util.ArrayList;

public class Dosen extends Staff {
    private String departemen;
    private ArrayList<MatkulAjar> listMatkulDiajar = new ArrayList<MatkulAjar>();
    
    public Dosen(String nama, String alamat, String ttl, String telepon, String nik, String departemen, ArrayList<MatkulAjar> listMatkulDiajar) {
        super(nama, alamat, ttl, telepon, nik);
        this.departemen = departemen;
        this.listMatkulDiajar = listMatkulDiajar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getListMatkulDiajar() {
        return listMatkulDiajar;
    }

    public void setListMatkulDiajar(ArrayList<MatkulAjar> listMatkulDiajar) {
        this.listMatkulDiajar = listMatkulDiajar;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartemen : " + departemen + "\n" + listMatkulDiajar;
    }
}


    
