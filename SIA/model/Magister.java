package SIA.model;

import java.util.ArrayList;

public class Magister extends Mahasiswa {
    private String judulPenelitianTesis;
    private ArrayList<MatkulAmbil> listMatkulDiambil = new ArrayList<MatkulAmbil>();

    public Magister(String nama, String alamat, String ttL, String telepon, String nim, String jurusan, String judulPenelitianTesis, ArrayList<MatkulAmbil> listMatkulDiambil) {
        super(nama, alamat, ttL, telepon, nim, jurusan);
        this.judulPenelitianTesis = judulPenelitianTesis;
        this.listMatkulDiambil = listMatkulDiambil;
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    public ArrayList<MatkulAmbil> getListMatkulDiambil() {
        return listMatkulDiambil;
    }

    public void setListMatkulDiambil(ArrayList<MatkulAmbil> listMatkulDiambil) {
        this.listMatkulDiambil = listMatkulDiambil;
    }
    
    @Override
    public String toString() {
        return super.toString()+ "\nJudul penelitian tesis = " + judulPenelitianTesis
        + " \nList matkul yang diambil = " + listMatkulDiambil;
    }
}
    