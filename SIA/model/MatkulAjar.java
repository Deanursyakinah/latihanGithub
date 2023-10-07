package SIA.model;

import java.util.ArrayList;

public class MatkulAjar {
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<PresensiStaff>();
    private Matkul matkulDiAjar;

    public MatkulAjar(ArrayList<PresensiStaff> listPresensiStaff, Matkul matkulAjar) {
        this.listPresensiStaff = listPresensiStaff;
        this.matkulDiAjar = matkulAjar;
    }

    
    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }
    
    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }
    
    public Matkul getMatkulAjar() {
        return matkulDiAjar;
    }
    
    public void setMatkulAjar(Matkul matkulAjar) {
        this.matkulDiAjar = matkulAjar;
    }
    @Override
    public String toString() {
        return "\nMatkul yang diajar : " + matkulDiAjar + super.toString() +  "\nList presensi staff : " + listPresensiStaff;
    }
}
