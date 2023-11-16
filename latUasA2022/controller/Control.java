package controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import model.GenderEnum;
import model.User;

public class Control {
    static DatabaseHandler conn = new DatabaseHandler();

    // SELECT WHERE ini email sama pw
    public User getUser(String email, String password) {
        conn.connect();
        String query = "SELECT * FROM users WHERE email ='" + email + "'&&Password='" + password + "'";
        User orang = new User();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                orang.setId(rs.getInt("id"));
                orang.setName(rs.getString("name"));
                orang.setEmail(rs.getString("email"));
                orang.setPassword(rs.getString("password"));
                orang.setGender(GenderEnum.valueOf(rs.getString("gender")));
                orang.setBirthday(new Date(rs.getDate("birthday").getTime()));
                orang.setPhoto(rs.getString("photo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.disconnect();
        return (orang);
    }

    public User getUserById(int userId) {
        conn.connect();
        String query = "SELECT * FROM users WHERE id ='" + userId + "''";
        User orang = new User();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                orang.setName(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.disconnect();
        return (orang);
    }

}
