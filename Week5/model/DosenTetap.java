package PBO.Week5.model;

import java.util.ArrayList;

public class DosenTetap extends Dosen {
    private double salary;
    
    public DosenTetap(String nama, String alamat, String ttl, String telepon, String nik, String departemen, ArrayList<MatkulAjar> listMatkulDiajar, double salary) {
        super(nama, alamat, ttl, telepon, nik, departemen, listMatkulDiajar);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

     @Override
    public String toString() {
        return super.toString() + "\n Gaji : " + salary;
    }
}
