package SIA.model;
import java.util.ArrayList;

public class Sarjana extends Mahasiswa{
    private ArrayList<MatkulAmbil> listMatkulAmbil = new ArrayList<MatkulAmbil>();

    public Sarjana(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, ArrayList<MatkulAmbil> listMatkulAmbil) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.listMatkulAmbil = listMatkulAmbil;
    }

    public ArrayList<MatkulAmbil> getListMatkulAmbil() {
        return listMatkulAmbil;
    }

    public void setListMatkulAmbil(ArrayList<MatkulAmbil> listMatkulAmbil) {
        this.listMatkulAmbil = listMatkulAmbil;
    }

    @Override
    public String toString() {
        return super.toString()+ " \n" + listMatkulAmbil;
    }
}

    

    
