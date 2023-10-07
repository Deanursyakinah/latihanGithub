package SIA.model;
import java.util.ArrayList;

public class Karyawan extends Staff {
    private double salary;
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<PresensiStaff>();
    
    public Karyawan(String nama, String alamat, String ttl, String telepon, String nik, double salary, ArrayList<PresensiStaff> listPresensiStaff) {
        super(nama, alamat, ttl, telepon, nik);
        this.salary = salary;
        this.listPresensiStaff = listPresensiStaff;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nKaryawan : " + "  \nGaji = " + salary
        + " \nList presensi karyawan : " + listPresensiStaff;
    }
}
