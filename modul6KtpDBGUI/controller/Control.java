import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Control {
    static DatabaseHandler conn = new DatabaseHandler();
    // INSERT
    public boolean insertNewPenduduk(Penduduk penduduk) {
        conn.connect();
        String query = "INSERT INTO penduduk VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, penduduk.getNik());
            stmt.setString(2, penduduk.getNama());
            stmt.setString(3, penduduk.getTempatLahir());
            stmt.setDate(4, new java.sql.Date(penduduk.getTanggalLahir().getTime()));
            stmt.setString(5, penduduk.getJenisKelamin());
            stmt.setString(6, penduduk.getGolonganDarah());
            stmt.setString(7, penduduk.getAlamat());
            stmt.setString(8, penduduk.getRtDanRw());
            stmt.setString(9, penduduk.getKelDesa());
            stmt.setString(10, penduduk.getKecamatan());
            stmt.setString(11, penduduk.getAgama());
            stmt.setString(12, penduduk.getStatusKawin());
            stmt.setString(13, penduduk.getPekerjaan());
            stmt.setString(14, penduduk.getWni());
            stmt.setString(15, penduduk.getWna());
            stmt.setString(16, penduduk.getBerlakuHingga());
            stmt.setString(17, penduduk.getKotaPembuatanKTP());
            stmt.setDate(18, new java.sql.Date(penduduk.getTanggalPembuatanKTP().getTime()));
            stmt.setString(19, Penduduk.getSelectedFotoPath());
            stmt.setString(20, Penduduk.getSelectedTtdPath());
            stmt.executeUpdate();
            conn.disconnect();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            conn.disconnect();
            return (false);
        }
    }

    // SELECT WHERE
    public Penduduk getPenduduk(String nik) {
        conn.connect();
        String query = "SELECT * FROM penduduk WHERE nik = '" + nik + "'";
        Penduduk penduduk = new Penduduk();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                penduduk.setNik(rs.getString("nik"));
                penduduk.setNama(rs.getString("nama"));
                penduduk.setTempatLahir(rs.getString("tempatLahir"));
                penduduk.setTanggalLahir(new Date(rs.getDate("tanggalLahir").getTime()));
                penduduk.setJenisKelamin(rs.getString("jenisKelamin"));
                penduduk.setGolonganDarah(rs.getString("golonganDarah"));
                penduduk.setAlamat(rs.getString("alamat"));
                penduduk.setRtDanRw(rs.getString("rt_rw"));
                penduduk.setKelDesa(rs.getString("kelurahan_desa"));
                penduduk.setKecamatan(rs.getString("kecamatan"));
                penduduk.setAgama(rs.getString("agama"));
                penduduk.setStatusKawin(rs.getString("statusKawin"));
                penduduk.setPekerjaan(rs.getString("pekerjaan"));
                penduduk.setWni(rs.getString("wni"));
                penduduk.setWna(rs.getString("wna"));
                penduduk.setBerlakuHingga(rs.getString("berlakuHingga"));
                penduduk.setKotaPembuatanKTP(rs.getString("kotaPembuatanKtp"));
                penduduk.setTanggalPembuatanKTP(new Date(rs.getDate("tanggalPembuatanKtp").getTime()));
                Penduduk.setSelectedFotoPath(rs.getString("pathFoto"));
                Penduduk.setSelectedTtdPath(rs.getString("pathTtd"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.disconnect();
        return (penduduk);
    }

    //UPDATE
    public boolean updatePenduduk(Penduduk penduduk, String NikLama) {
        conn.connect();
        String query = "UPDATE penduduk SET nama='" + penduduk.getNama() + "', "
                + "tempatLahir='" + penduduk.getTempatLahir() + "', "
                + "tanggalLahir='" + new java.sql.Date(penduduk.getTanggalLahir().getTime()) + "', "
                + "jenisKelamin='" + penduduk.getJenisKelamin() + "', "
                + "golonganDarah='" + penduduk.getGolonganDarah() + "', "
                + "alamat='" + penduduk.getAlamat() + "', "
                + "rt_rw='" + penduduk.getRtDanRw() + "', "
                + "kelurahan_desa='" + penduduk.getKelDesa() + "', "
                + "kecamatan='" + penduduk.getKecamatan() + "', "
                + "agama='" + penduduk.getAgama() + "', "
                + "statusKawin='" + penduduk.getStatusKawin() + "', "
                + "pekerjaan='" + penduduk.getPekerjaan() + "', "
                + "wni='" + penduduk.getWni() + "', "
                + "wna='" + penduduk.getWna() + "', "
                + "berlakuHingga='" + penduduk.getBerlakuHingga() + "', "
                + "kotaPembuatanKtp='" + penduduk.getKotaPembuatanKTP() + "', "
                + "tanggalPembuatanKtp='" + new java.sql.Date(penduduk.getTanggalPembuatanKTP().getTime()) + "', "
                + "pathFoto='" + Penduduk.getSelectedFotoPath() + "' "
                + "pathTtd='" + Penduduk.getSelectedTtdPath() + "' "
                + "WHERE NIK='" + NikLama + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // DELETE
    public boolean deletePenduduk(Penduduk penduduk) {
        conn.connect();

        String query = "DELETE FROM penduduk WHERE NIK='" + penduduk.getNik()+ "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}
