package SIA.model;

import java.util.ArrayList;

public class DosenHonorer extends Dosen {
    private int honorPerSKS;
    public DosenHonorer(String nama, String alamat, String ttl, String telepon, String nik, String departemen, ArrayList<MatkulAjar> listMatkulDiajar, int honorPerSKS) {
        super(nama, alamat, ttl, telepon, nik, departemen, listMatkulDiajar);
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

     @Override
    public String toString() {
        return super.toString() + "\n Honor per SKS : " + honorPerSKS;
    }
}
